package com.brendenvogt.web.controllers;

import com.brendenvogt.web.models.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

import static com.brendenvogt.web.config.ControllerConfig.GREETING_FORMAT_STRING;

@RestController
public class GreetingController {

    @Autowired
    @Qualifier(GREETING_FORMAT_STRING)
    private String greetingFormatString;

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(greetingFormatString, name));
    }

}
