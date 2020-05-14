package com.example.webfluxdemo.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

import com.example.webfluxdemo.model.Greeting;

@RestController
public class UserController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
	public Mono<Greeting> greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        String content = String.format(template, name);
        return Mono.just(new Greeting(counter.incrementAndGet(), content));
	}
}
