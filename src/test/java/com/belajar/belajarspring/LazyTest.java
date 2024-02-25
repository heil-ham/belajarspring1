package com.belajar.belajarspring;

import com.belajar.belajarspring.data.Dog;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LazyTest {
    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(LazyConfiguration.class);
    }

    @Test
    void testLazy() {
        Dog dog = applicationContext.getBean(Dog.class);
    }
}
