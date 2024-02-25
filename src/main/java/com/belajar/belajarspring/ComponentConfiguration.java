package com.belajar.belajarspring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com.belajar.belajarspring.repository",
        "com.belajar.belajarspring.service"
})
public class ComponentConfiguration {
}




