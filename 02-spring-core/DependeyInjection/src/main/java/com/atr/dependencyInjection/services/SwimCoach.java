package com.atr.dependencyInjection.services;

public class SwimCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Swim 30 minutes";
    }
}
