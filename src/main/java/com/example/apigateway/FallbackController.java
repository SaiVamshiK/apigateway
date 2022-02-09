package com.example.apigateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
    @GetMapping("/userServiceDown")
    public String userServiceDown(){
        return "User Service is down";
    }
    @GetMapping("/departmentServiceDown")
    public String departmentServiceDown(){
        return "Department Service is down";
    }
}
