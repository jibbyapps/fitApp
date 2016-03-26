package com.fitApp.controller;

import com.fitApp.controller.model.Exercise;
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
    }

}
