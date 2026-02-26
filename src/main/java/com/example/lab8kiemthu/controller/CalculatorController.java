package com.example.lab8kiemthu.controller;

import com.example.lab8kiemthu.service.CalculatorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CalculatorController {

    private final CalculatorService service;

    public CalculatorController(CalculatorService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home() {
        return "calculator";
    }

    @PostMapping("/calculate")
    public String calculate(
            @RequestParam double a,
            @RequestParam double b,
            Model model) {

        model.addAttribute("result", service.add(a, b));
        return "calculator";
    }
}