package org.example.taskmanager.controller;

import lombok.RequiredArgsConstructor;
import org.example.taskmanager.entity.User;
import org.example.taskmanager.service.UserService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @PostMapping("/")
    public User addUser (@RequestBody User user) {
        return userService.save(user);

    }

}
