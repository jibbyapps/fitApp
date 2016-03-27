package com.fitApp.controller;

import model.Exercise;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by vitaliiromanchenko on 26.03.16.
 */

@Controller
public class MinutesController {

    @RequestMapping(value = "/addMinutes")
    public String addMinutes(@ModelAttribute("exercise") Exercise exercise)
    {
        System.out.println("exercise: " + exercise.getMinutes());
        return "addMinutes";
    //    return "forward: addMoreMinutes.html";
      //  return "redirect: addMoreMinutes.html";
    }

//    @RequestMapping(value = "/addMoreMinutes")
//    public String addMoreMinutes(@ModelAttribute("exercise") Exercise exercise)
//    {
//        System.out.println("exercising: " + exercise.getMinutes());
//        return "addMinutes";
//    }


}
