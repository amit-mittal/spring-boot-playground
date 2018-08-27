package com.playground.controller;

import com.playground.components.TennisCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TennisCoach tennisCoach;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return "I see the update: " + tennisCoach.getDailyWorkout();
    }
}
