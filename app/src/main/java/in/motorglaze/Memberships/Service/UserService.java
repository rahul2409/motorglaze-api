package in.motorglaze.Memberships.Service;

import java.util.*;
import in.motorglaze.Memberships.DAO.UsersDao;
import in.motorglaze.Memberships.Entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UsersDao _users;
    public UserService(UsersDao usersDao){
        _users = usersDao;
    }

    public List<User> findAll(){
        // Method to get all the users
        return _users.findAll();
    }

    public User findById(String Id){
        Optional<User> temporaryUser = _users.findById(Id);
        User user = null;
        if(temporaryUser.isPresent()){
            user = temporaryUser.get();
        } else{
            throw new RuntimeException("Did not find user with Id: " + Id);
        }
        return user;
    }

    public User save(User user){
        return _users.save(user);
    }

    public void deleteById(String theId){
        _users.deleteById(theId);
    }
}
