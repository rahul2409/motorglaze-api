package in.motorglaze.Memberships.Controllers;

import in.motorglaze.Memberships.Entity.Registration;
import in.motorglaze.Memberships.Service.RegistrationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/membership-registration")
public class MembershipRegistrationsController {
    private RegistrationService _registrationService;

    public MembershipRegistrationsController(RegistrationService theRegistrationService){
        _registrationService = theRegistrationService;
    }

    @GetMapping
    public List<Registration> getAllRegistrations(){
        return _registrationService.findAll();
    }

//    @GetMapping("/{id}")
//    public Registration findById(@PathVariable int id){
//        Registration registration = _registrationService.findById(id);
//
//    }
}
