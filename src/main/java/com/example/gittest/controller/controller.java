package com.example.gittest.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class controller {

    @GetMapping
    public void testController(String string){
        System.out.println(string);
    }
}
