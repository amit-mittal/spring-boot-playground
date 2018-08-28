package com.playground.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class ViewController {

    @RequestMapping(value = "/other")
    public String other(Map model) {
        model.put("key1", "value1");
        return "otherFile";
    }
}
