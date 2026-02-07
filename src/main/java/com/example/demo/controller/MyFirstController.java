package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequiredArgsConstructor
public class MyFirstController {

    private final RandomTest randomTest;

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World! updated by Oshani.!";
    }

    @GetMapping("/random")
    public String Random(@RequestParam String name, @RequestParam int value) {
        randomTest.setName(name);
        randomTest.setValue(value);
        return randomTest.sayHello();
    }
}
