package com.belajar.belajarspring;

import com.belajar.belajarspring.data.Cat;
import com.belajar.belajarspring.data.CatDog;
import com.belajar.belajarspring.data.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com.belajar.belajarspring.configuration"
})
public class ScanConfiguration {
    @Bean
    public CatDog catDog(Cat cat, Dog dog) {
        return new CatDog(cat,dog);
    }
}
