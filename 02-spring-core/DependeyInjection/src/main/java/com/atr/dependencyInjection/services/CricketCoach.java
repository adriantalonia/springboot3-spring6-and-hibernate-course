package com.atr.dependencyInjection.services;

import com.atr.util.common.CommonClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    @Autowired
    private CommonClass commonClass;

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes!!! "+commonClass.getExtraInfo();
    }
}
