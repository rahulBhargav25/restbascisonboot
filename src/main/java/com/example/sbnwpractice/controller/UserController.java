package com.example.sbnwpractice.controller;

import com.example.sbnwpractice.model.User;
import com.example.sbnwpractice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getmsg", method= RequestMethod.GET)
    public String getUsers() {
        return "this method will return users";
    }

    @GetMapping("/getMessage")
    public String getMappingUsers() {
        return "This method will return all users using getMapping";
    }

    @GetMapping("/getUser")
    public User getUser() {
        User user = new User();
        user.setFirstName("Ram");
        user.setLastName("sharma");
        user.setUsername("Ram123");
        user.setPassword("ram123");

        return user;
    }

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers() {
        return this.userService.getAllUsers();
    }

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user) {
        User u = this.userService.addUser(user);
        return u;
    }
}
