package com.example.sbnwpractice.service;

import com.example.sbnwpractice.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class UserService {
    private static List<User> users = new ArrayList<>();
    static {
        users.add(new User("Rama", "Ramalal", "Sharma","ra123"));
        users.add(new User("sama", "samalal", "verma","sa123"));
        users.add(new User("seeta", "seeta", "Sharma","se123"));
    }

    public List<User> getAllUsers() {
        return users;
    }

    public User getUserByUserName(String userName) {
        User u = null;
        for(User user : users) {
            String uname = user.getUsername();
            if(uname.equals(userName));
            u = user;
        }
        return u;
    }

    public User addUser(User user) {
        users.add(user);
        return user;
    }

    public User updateUser(String password) {
        return null;
    }

    public void deleteUser(String username) {

    }

}
