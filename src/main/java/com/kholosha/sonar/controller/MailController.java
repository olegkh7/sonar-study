package com.kholosha.sonar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

    private static final String JDBC_PASSWORD = "wdfew";
    @GetMapping
    public String greeting() {
        var c = "df";
        return "Hello";
    }
}
