package com.z2.movies.demo.service;

import com.z2.movies.demo.model.User;
import com.z2.movies.demo.reposity.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
}
