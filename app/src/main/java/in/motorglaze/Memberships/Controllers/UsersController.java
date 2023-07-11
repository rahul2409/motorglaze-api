package in.motorglaze.Memberships.Controllers;

import in.motorglaze.Memberships.Entity.User;
import in.motorglaze.Memberships.Service.UserService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/users")
public class UsersController {
    private UserService _userService;

    public UsersController(UserService userService){
        _userService = userService;
    }

    @GetMapping
    public List<User> findAllUsers(){
        System.out.println("findAllUsers() function called. ");
        return _userService.findAll();
    }

    @GetMapping("/{userId}")
    public User findUserById(@PathVariable String userId){
        User user = _userService.findById(userId);
        if(user == null){
            throw new RuntimeException("User not found with Id: " +userId);
        }
        return user;
    }

    @PostMapping
    public User addNewUser(@RequestBody User theUser){
        UUID uuid = UUID.randomUUID();
        theUser.setId(uuid.toString());

        theUser.setCreatedDate(LocalDateTime.now());

        User tempUser = _userService.save(theUser);
        return tempUser;
    }

    @PutMapping
    public User updateNewUser(@RequestBody User theUser){
        User tempUser = _userService.save(theUser);
        return tempUser;
    }

    @DeleteMapping("/{userId}")
    public String deleteUserById(@PathVariable String userId){
        User tempUser = _userService.findById(userId);

        if(tempUser == null){
            throw new RuntimeException("The User Id not found: "+ userId);
        }

        _userService.deleteById(userId);
        return "Deleted the user. Id: "+userId;
    }
}
