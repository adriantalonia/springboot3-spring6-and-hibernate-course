package com.atr.dependencyInjection.controller;

import com.atr.dependencyInjection.services.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a private field for the dependency
    private final Coach myCoach;

    private final Coach secondCoach;

    // controller injection
    @Autowired
    public DemoController(/*@Qualifier("baseballCoach")*/ Coach coach, @Qualifier("swimCoach") Coach secondCoach) { // using Qualifier to use a specific Coach
        System.out.println("in constructor: " + getClass().getSimpleName());
        this.myCoach = coach;
        this.secondCoach = secondCoach;
    }

    // Setter injection
    /*@Autowired
    public void setCoach(Coach coach) {
        myCoach = coach;
    }*/

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
