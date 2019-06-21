package com.swipepay.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication(scanBasePackages = {"com.swipepay.core", "com.swipepay.core.repository", "com.swipepay.core.service", "com.swipepay.core.service.impl", "com.swipepay.core.mapper"})
@EnableJpaAuditing
public class SwipepaycoreApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SwipepaycoreApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SwipepaycoreApplication.class);
    }
}
