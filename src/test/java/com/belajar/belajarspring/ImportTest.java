package com.belajar.belajarspring;

import com.belajar.belajarspring.data.Cat;
import com.belajar.belajarspring.data.Dog;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ImportTest {
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(
                MainConfiguration.class
        );
    }

    @Test
    void testImport() {
        Cat cat = applicationContext.getBean(Cat.class);
        Dog dog  = applicationContext.getBean(Dog.class);
    }
}
