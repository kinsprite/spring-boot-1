package com.example.demo.service.impl;

import com.example.demo.model.Greeting;
import com.example.demo.model.User;
import com.example.demo.service.UserService;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private static final String helloTemplate = "Hello, %s!";

    @Override
    public Greeting saveHello(User user) {
        var content = String.format(helloTemplate, user.getName());
        return new Greeting(user.getId(), content);
    }

}
