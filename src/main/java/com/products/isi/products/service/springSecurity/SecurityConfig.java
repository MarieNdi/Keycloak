package com.products.isi.products.service.springSecurity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .csrf().disable()  // Désactive la protection CSRF pour les API REST
                .authorizeHttpRequests(auth -> auth.anyRequest().permitAll())// Utilise JWT pour valider les tokens
                .build();
    }
}

