package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController
{
    @RequestMapping("/status")
    public String getGreeting()
    {
        return "Success! Beyond Success";
    }
}
