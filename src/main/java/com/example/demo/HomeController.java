package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
 
@RestController
public class HomeController {
 
    @RequestMapping("/")
    public String index() {
        return "Привет, мир!";
    }
}