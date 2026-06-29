package com.Security.SpringOauth2Demo;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Component;

@Configuration
@EnableWebSecurity
public class SecurityConfig {


    public SecurityFilterChain securityFilterChain(HttpSecurity http)
    {
        http.authorizeHttpRequests(auth-> auth.anyRequest().authenticated())
                .oauth2Login(Customizer.withDefaults());

        return http.build();
    }
}
