package com.fitApp.controller;

import model.Activity;
import model.Exercise;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

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


    @RequestMapping(value = "/activities",method = RequestMethod.GET)
    public @ResponseBody List<Activity> findAllActivities(){
        List<Activity> activities = new ArrayList<Activity>();
        Activity run = new Activity();
        run.setDesc("Run");
        activities.add(run);

        Activity bike = new Activity();
        bike.setDesc("Bike");
        activities.add(bike);

        Activity swim = new Activity();
        swim.setDesc("Swim");
        activities.add(swim);

        return activities;

    }

//    @RequestMapping(value = "/addMoreMinutes")
//    public String addMoreMinutes(@ModelAttribute("exercise") Exercise exercise)
//    {
//        System.out.println("exercising: " + exercise.getMinutes());
//        return "addMinutes";
//    }


}
