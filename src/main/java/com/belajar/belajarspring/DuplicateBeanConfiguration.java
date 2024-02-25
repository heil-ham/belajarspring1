package com.belajar.belajarspring;

import com.belajar.belajarspring.data.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DuplicateBeanConfiguration {
    @Primary
    @Bean
    public Cat cat() {
        return new Cat();
    }
    @Bean
    public Cat domestic() {
        return new Cat();
    }

    @Bean
    public Cat persian() {
        return new Cat();
    }
}
