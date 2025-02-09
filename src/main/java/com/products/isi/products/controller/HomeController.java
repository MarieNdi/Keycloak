package com.products.isi.products.controller;

import org.springframework.web.bind.annotation.*;
import lombok.*;


@RestController
@RequestMapping("/api")
public class HomeController {

    @GetMapping(path = "/home")
    public String home(){
        return "Bienvenu boutique";
    }
    @GetMapping(path = "/admin")
    public String admin(){
        return "Bienvenu boutique admin";
    }

    @GetMapping(path = "/user")
    public String user(){
        return "Bienvenu boutique user";
    }
}

