package com.belajar.belajarspring;

import com.belajar.belajarspring.data.Cat;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Slf4j
@Configuration
public class ScopeConfiguration {
    @Bean
    @Scope("prototype")
    public Cat cat() {
        log.info("Create a new cat");
        return new Cat();
    }
}
