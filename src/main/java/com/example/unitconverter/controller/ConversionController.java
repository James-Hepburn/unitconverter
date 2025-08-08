package com.example.unitconverter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConversionController {
    @GetMapping ("/")
    public String home () {
        return "index";
    }

    @GetMapping ("/convert")
    public String convert (@RequestParam double value, @RequestParam String from, @RequestParam String to) {
        return "";
    }
}
