package com.z2.movies.demo.controller;


import com.z2.movies.demo.model.User;
import com.z2.movies.demo.reposity.UserRepository;
import com.z2.movies.demo.service.MovieService;
import com.z2.movies.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/add")
    public String addUser(@RequestBody User user) {
        userRepository.save(user);
        return "success!";
    }

    @GetMapping("/getAll")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @PutMapping("/update")
    public String updateUser(@RequestBody User user) {
        userRepository.save(user);

        return "success!";
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable Long userId) {
        userRepository.deleteById(userId);

        return "success!";
    }
}
