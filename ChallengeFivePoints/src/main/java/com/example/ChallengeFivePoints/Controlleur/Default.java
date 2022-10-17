package com.example.ChallengeFivePoints.Controlleur;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class Default {

    @GetMapping
    public String Default(){
        return "Application is works !!! " + new Date();
    }
}
