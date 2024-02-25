package com.belajar.belajarspring;

import com.belajar.belajarspring.data.Cat;
import com.belajar.belajarspring.data.CatDog;
import com.belajar.belajarspring.data.Dog;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DependencyInjectionConfiguration {
    @Bean
    @Primary
    public Cat cat() {
        return new Cat();
    }

    @Bean
    public Cat persian() {
        return new Cat("persian");
    }

    @Bean
    public Dog dog() {
        return new Dog();
    }

    @Bean
    public CatDog catDog(@Qualifier("persian") Cat cat, Dog dog) {
        return new CatDog(cat,dog);
    }
}
