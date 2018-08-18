package com.playground.components;

import com.playground.contract.Coach;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Daily workout";
    }
}
