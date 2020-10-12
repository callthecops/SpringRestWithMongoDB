package com.example.PhoneBook.Controllers;

import com.example.PhoneBook.model.User;
import com.example.PhoneBook.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //Get mappings are used both for displaying and filtering
    @GetMapping("/getusers")
    public List<User> getUser() {
        List<User> userList = userRepository.findAll();
        return userList;
    }

    //This is used for insert
    @PutMapping
    public void insertUser(@RequestBody User user) {
        userRepository.insert(user);
    }

    //post is used for update.Save method works like an upsert.Upsert is a fusion of update and insert
    //and it insert rows that don't exist and updates rows that do exists.If the user that we pass in does not
    //have an id the upser will insert that object into mongodb collection.If the user has an existing ID
    //mongodb will update the respective user.
    @PostMapping
    public void updateUser(@RequestBody User user) {
        userRepository.save(user);
    }

    //Delete is used for removal
    @DeleteMapping("/deleteuser/{id}")
    public void deleteUser(@PathVariable("id") String id) {
        userRepository.deleteById(id);
    }


}
