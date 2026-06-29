package com.Security.SpringOauth2Demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/login")
public class HelloController {

    @GetMapping("/")
    public String greet(){
        return "Welcome to OAuth2";
    }
}
