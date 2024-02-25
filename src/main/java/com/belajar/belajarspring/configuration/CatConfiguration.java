package com.belajar.belajarspring.configuration;

import com.belajar.belajarspring.data.Cat;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class CatConfiguration {
    @Bean
    public Cat cat() {
        log.info("Create cat bean");
        return new Cat();
    }
}
