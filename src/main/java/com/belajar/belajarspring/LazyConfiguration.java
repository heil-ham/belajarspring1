package com.belajar.belajarspring;

import com.belajar.belajarspring.data.Cat;
import com.belajar.belajarspring.data.Dog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

@Slf4j
@Configuration
public class LazyConfiguration {
    @Lazy
    @Bean
    public Dog dog() {
        log.info("Create new dog");
        return new Dog();
    }
    @Bean
    public Cat cat() {
        log.info("Create new cat");
        return new Cat();
    }
}
