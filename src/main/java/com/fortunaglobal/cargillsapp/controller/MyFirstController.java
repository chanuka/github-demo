package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequiredArgsConstructor
public class MyFirstController {

    private final Calculator calculator;

    private final RandomTest randomTest;

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World! updated by Oshani.!";
    }

    @GetMapping("/calculate")
    public String calculate(@RequestParam int a, @RequestParam int b) {
        try {
            calculator.setA(a);
            calculator.setB(b);
            return String.format(
                "Addition: %d, Subtraction: %d, Multiplication: %d, Division: %.4f",
                    calculator.add(), calculator.sub(), calculator.mul(), calculator.div()
            );
        } catch (ArithmeticException ex) {
            return String.format(
                "Addition: %d, Subtraction: %d, Multiplication: %d, Division: error (%s)",
                    calculator.add(), calculator.sub(), calculator.mul(), ex.getMessage()
            );
        }
    }

    @GetMapping("/random")
    public String Random(@RequestParam String name, @RequestParam int value) {
        randomTest.setName(name);
        randomTest.setValue(value);
        return randomTest.sayHello();
    }
}
