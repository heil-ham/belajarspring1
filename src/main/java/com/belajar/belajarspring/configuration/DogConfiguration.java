package com.belajar.belajarspring;

import com.belajar.belajarspring.data.Dog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class DogConfiguration {
    @Bean
    public Dog dog() {
        log.info("Create dog bean");
        return new Dog();
    }
}