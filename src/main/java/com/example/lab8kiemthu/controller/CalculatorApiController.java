package com.example.lab8kiemthu.controller;

import com.example.lab8kiemthu.model.CalculatorRequest;
import com.example.lab8kiemthu.service.CalculatorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calc")
public class CalculatorApiController {

    private final CalculatorService service;

    public CalculatorApiController(CalculatorService service) {
        this.service = service;
    }

    @PostMapping("/add")
    public double add(@RequestBody CalculatorRequest req) {
        return service.add(req.getA(), req.getB());
    }
}