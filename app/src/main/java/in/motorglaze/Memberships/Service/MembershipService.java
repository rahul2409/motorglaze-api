package in.motorglaze.Memberships.Service;

import in.motorglaze.Memberships.DAO.MembershipsDao;
import in.motorglaze.Memberships.Entity.Membership;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MembershipService {
    private MembershipsDao _membershipDao;

    public MembershipService(MembershipsDao membershipsDao){
        _membershipDao = membershipsDao;
    }

    public List<Membership> findAll(){
        return _membershipDao.findAll();
    }

    public Membership findById(String id){
        Optional<Membership> tempMembership = _membershipDao.findById(id);
        Membership membership = null;
        if(tempMembership.isPresent()){
            membership = tempMembership.get();
        } else {
            throw new RuntimeException("Membership with Id not found! Id: " + id);
        }
        return membership;
    }

    public Membership save(Membership membership){
        return _membershipDao.save(membership);
    }

    public void deleteById(String id){
        _membershipDao.deleteById(id);
    }
}
