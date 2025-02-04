package com.example.demo.controller;

import com.example.demo.utils.calc;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping("")
    public  String ApiTesting(){
        return "Testing ap";
    }
    @GetMapping("/mul")
    public int ApiTest2(){
        return  calc.Multiply(4,6);
    }
}
