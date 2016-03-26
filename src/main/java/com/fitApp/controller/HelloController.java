package com.fitApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by vitaliiromanchenko on 25.03.16.
 */

@Controller

public class HelloController {

    @RequestMapping(value = "/greeting")
    public String SayHello(Model model){
        model.addAttribute("greeting","hello world_rocker");


        return "hello";
    }


}
