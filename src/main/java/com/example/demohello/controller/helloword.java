package com.example.demohello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class helloword {

    @RequestMapping (value = "/login", method = RequestMethod.GET)
    public String loginSubmit() {
        System.out.println("hello");
            return "main";
    }
   
   

      
            
        
    }

