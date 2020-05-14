package com.example.demo.service;

import com.example.demo.model.Greeting;
import com.example.demo.model.User;

public interface UserService {

    public Greeting saveHello(User user);
}
