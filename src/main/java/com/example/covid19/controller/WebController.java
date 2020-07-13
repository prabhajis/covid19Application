package com.example.covid19.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping("/")
    String home(ModelMap modal) {
        return "covidTrackerHome";
    }
}
