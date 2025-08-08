package com.example.unitconverter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConversionController {
    @GetMapping ("/")
    public String home () {
        return "index";
    }
}
