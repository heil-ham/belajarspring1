package com.belajar.belajarspring;

import com.belajar.belajarspring.data.Cat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopeTest {
    private ApplicationContext applicationContext;
    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(ScopeConfiguration.class);
    }

    @Test
    void testScope() {
        Cat cat1 = applicationContext.getBean(Cat.class);
        Cat cat2 = applicationContext.getBean(Cat.class);
        Cat cat3 = applicationContext.getBean(Cat.class);

        Assertions.assertNotSame(cat1, cat2);
        Assertions.assertNotSame(cat1, cat3);
        Assertions.assertNotSame(cat2, cat3);
    }
}
