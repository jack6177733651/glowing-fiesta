package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping
    public String helloWorld() {
        return "hello world";
    }

    @GetMapping("/foo")
    public String foo() {
        System.out.println("change from remote, modified 2");
        System.out.println("another change");
        System.out.println("new change");
        return "foo";
    }
}
