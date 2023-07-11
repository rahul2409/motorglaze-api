package in.motorglaze.Memberships.Service;

import in.motorglaze.Memberships.DAO.UserMembershipRegistrationsDao;
import in.motorglaze.Memberships.Entity.Registration;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegistrationService {
    private UserMembershipRegistrationsDao _memberships;
    public RegistrationService(UserMembershipRegistrationsDao membershipRegistrationsDao){
        _memberships = membershipRegistrationsDao;
    }

    public List<Registration> findAll(){
        return _memberships.findAll();
    }

    public Registration findById(int id){
        Optional<Registration> tempRegistration = _memberships.findById(id);
        Registration registration = null;
        if(tempRegistration.isPresent()){
            registration = tempRegistration.get();
        }
        else{
            throw new RuntimeException("The Membership Id was not found! Id: " + id);
        }
        return registration;
    }

    public Registration save(Registration registration){
        return _memberships.save(registration);
    }

    public void deleteById(int id){
        _memberships.deleteById(id);
    }
}
