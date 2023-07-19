package in.motorglaze.Memberships.Controllers;

import in.motorglaze.Memberships.Entity.Membership;
import in.motorglaze.Memberships.Service.MembershipService;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/membership")
public class MembershipsController {
    private MembershipService _membershipService;

    public MembershipsController(MembershipService membershipService){
        _membershipService = membershipService;
    }

    @GetMapping
    public List<Membership> getAllMemberships(){
        return _membershipService.findAll();
    }

    @GetMapping("/{membershipId}")
    public Membership findById(@PathVariable String membershipId){
        Membership membership = _membershipService.findById(membershipId);
        if(membership == null){
            throw new RuntimeException("Membership Id not found. Id: " + membershipId);
        }
        return membership;
    }

    @PostMapping
    public Membership addNewMembership(@RequestBody Membership membership){
        UUID uuid = UUID.randomUUID();
        membership.setId(uuid.toString());
        membership.setCreatedDate(LocalDateTime.now());

        Membership tempMember = _membershipService.save(membership);
        return tempMember;
    }

    @PutMapping
    public Membership updateMembership(@RequestBody Membership membership){
        return _membershipService.save(membership);
    }

    @DeleteMapping("/{id}")
    public String deleteMembership(@PathVariable String id){
        Membership membership = _membershipService.findById(id);
        if(membership == null){
            throw new RuntimeException("Membership Id not found! Id: " + id);
        }
        _membershipService.deleteById(id);
        return "Deleted Membership with id - "+id;
    }
}
