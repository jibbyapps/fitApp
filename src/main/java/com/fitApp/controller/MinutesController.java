package com.fitApp.controller;

import com.fitApp.model.Activity;
import com.fitApp.model.Exercise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fitApp.service.ExerciseService;

import java.util.List;

/**
 * Created by vitaliiromanchenko on 26.03.16.
 */

@Controller
public class MinutesController {

    @Autowired
    private ExerciseService exerciseService;



    @RequestMapping(value = "/addMinutes")
    public String addMinutes(@ModelAttribute("exercise") Exercise exercise)
    {
        System.out.println("exercise: " + exercise.getMinutes());
        System.out.println("exercise Activity: " + exercise.getActivity());
        return "addMinutes";
    //    return "forward: addMoreMinutes.html";
      //  return "redirect: addMoreMinutes.html";
    }

    @RequestMapping(value = "/activities",method = RequestMethod.GET)
    public @ResponseBody List<Activity> findAllActivities(){

        return exerciseService.findAllActivities();

    }

//    @RequestMapping(value = "/activities",method = RequestMethod.GET)
//    public @ResponseBody List<Activity> findAllActivities(){
//
//        return activities;
//
//    }

//    @RequestMapping(value = "/addMoreMinutes")
//    public String addMoreMinutes(@ModelAttribute("exercise") Exercise exercise)
//    {
//        System.out.println("exercising: " + exercise.getMinutes());
//        return "addMinutes";
//    }


}
