package org.example.taskmanager.service;


import org.example.taskmanager.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserService  {
    @Autowired
    private UserRepository userRepository;

    public User save(User user) {

        return  userRepository.save(user);
    }
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }
    public User updateUser(Long id,User user) {
        User existingUser = getUserById(id);
        existingUser.setName(user.getName());
        return userRepository.save(existingUser);


    }

}
