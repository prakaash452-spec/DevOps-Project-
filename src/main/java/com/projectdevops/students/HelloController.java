package com.projectdevops.students;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Welcome DevOps";
    }

    @GetMapping("/health")
    public String health() {
        return "Application Running";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello DevOps";
    }
}