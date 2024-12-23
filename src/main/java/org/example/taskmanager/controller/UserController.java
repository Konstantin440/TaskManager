package org.example.taskmanager.controller;

import lombok.RequiredArgsConstructor;
import org.example.taskmanager.entity.User;
import org.example.taskmanager.service.UserService;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @PostMapping("/")
    public User addUser(@RequestBody User user) {
        return userService.save(user);

    }


    @DeleteMapping("/deleteUser/")
    public void deleteUser(User user) {
        userService.deleteUser(user);
    }

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @DeleteMapping("/deleteAllUsers")
    public void deleteAllUsers() {
        List<User> users = userService.getAllUsers();
        users.clear();
    }

    @PatchMapping("/changeUserName")
    public User changeUserName(@RequestParam long id, @RequestParam String name) {
        User user = userService.getUserById(id);
        user.setName(name);
        return userService.save(user);
    }
}




