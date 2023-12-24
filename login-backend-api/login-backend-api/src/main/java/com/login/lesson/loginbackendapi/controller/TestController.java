package com.login.lesson.loginbackendapi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${env}")
    private String env;

    @GetMapping("/hello")
    public String hello() {
        return "HELLO WORLD x'ams";
    }

    @GetMapping("/env")
    public String env() {
        return "env=" + env;
    }
}
