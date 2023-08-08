package com.atr.dependencyInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
        scanBasePackages = {"com.atr.util.common",
                "com.atr.dependencyInjection"})
public class InjectionDependencyApplication {

    public static void main(String[] args) {
        SpringApplication.run(InjectionDependencyApplication.class, args);
    }

}
