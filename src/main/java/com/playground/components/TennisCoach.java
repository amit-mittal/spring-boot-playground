package com.playground.components;

import com.playground.contract.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    public TennisCoach() {
        System.out.println("====Inside constructor 1");
    }

    @Autowired
    public void someMethod(ServiceDispatcher dispatcher) {
        dispatcher.doSomething();
    }

    @Override
    public String getDailyWorkout() {
        return "Daily workout";
    }
}
