
package com.example.spring_devops_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Spring Boot!";
    }

    @GetMapping("/api/info")
    public Map<String, String> info() {
        return Map.of(
                "application", "spring-devops-app",
                "version", "1.0",
                "message", "Spring Boot application is running"
        );
    }
    
@GetMapping("/api/status")
public Map<String, String> status() {
    return Map.of(
            "status", "UP",
            "application", "spring-devops-app"
    );
}

}
