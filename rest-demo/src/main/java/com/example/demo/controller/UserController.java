package com.example.demo.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Greeting;
import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService = null;

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        var user = new User(counter.incrementAndGet(), name);
        return this.userService.saveHello(user);
	}
}
