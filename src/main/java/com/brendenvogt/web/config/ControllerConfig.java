package com.brendenvogt.web.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ControllerConfig {

    public static final String GREETING_FORMAT_STRING = "GREETING_FORMAT_STRING";

    @Bean
    @Qualifier(GREETING_FORMAT_STRING)
    public String greetingFormatString() {
        return "Hello, %s!";
    }

}
