package com.belajar.belajarspring;

import com.belajar.belajarspring.data.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public Cat cat() {
        Cat cat = new Cat();
        return cat;
    }
}
