package com.fortunaglobal.cargillsapp.controller;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@Data
public class Calculator {

    private int a;
    private int b;

    public int add() {
        return a + b;
    }

    public int sub() {
        return a - b;
    }

    public int mul() {
        return a * b;
    }

    public double div() {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return ((double) a) / ((double) b);
    }

}
