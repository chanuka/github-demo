package com.example.demo.controller;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@ToString
public class RandomTest {
    private String name;
    private int value;

    public String sayHello() {return  "Hello, World!" + name;}
}
