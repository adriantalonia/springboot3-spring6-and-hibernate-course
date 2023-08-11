package com.atr.dependencyInjection.configuration;

import com.atr.dependencyInjection.services.Coach;
import com.atr.dependencyInjection.services.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
