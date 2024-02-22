package com.love.flames.controller;


import com.love.flames.calculator.calculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class controller {


    @RequestMapping("/")
    public String index() {

        return "index";
    }

    @PostMapping("/checkCompatibility")
    public String checkCompatibility(@RequestParam("yourName") String name,
                                     @RequestParam("partnerNames") String[] partnerNames,
                                     Model model) {

        List<String> partners = Arrays.asList(partnerNames);
        List<String> Results = new ArrayList<>();
        boolean check = false;
        for(String s :partners)
        {
            calculator cl = new calculator();
            Results.add(cl.calci(name,s));
            check = true;
        }
        if(check) {
            model.addAttribute("compatibilityResults", Results);
        }
        return "index";
    }
}

