package com.playground.components;

import com.playground.contract.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Value("${spring.property1}")
    private String property1;

    @Value("${spring.property2}")
    private String property2;

    public TennisCoach() {
        System.out.println("====Inside constructor 1");
    }

    @Autowired
    public void someMethod(ServiceDispatcher dispatcher) {
        dispatcher.doSomething();
    }

    @Override
    public String getDailyWorkout() {
        return "Daily workout: " + property1;
    }
}
