package com.atr.dependencyInjection.services;

import com.atr.util.common.CommonClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Lazy
public class CricketCoach implements Coach {

    private final CommonClass commonClass;

    @Autowired
    public CricketCoach(CommonClass commonClass) {
        this.commonClass = commonClass;
        System.out.println("in constructor: "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes!!! "+commonClass.getExtraInfo();
    }
}
