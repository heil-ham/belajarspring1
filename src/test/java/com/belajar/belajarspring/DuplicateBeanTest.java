package com.belajar.belajarspring;

import com.belajar.belajarspring.data.Cat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DuplicateBeanTest {
    @Test
    void testDuplicateBean() {
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateBeanConfiguration.class);

        Assertions.assertThrows(NoUniqueBeanDefinitionException.class, () -> {
            Cat cat = context.getBean(Cat.class);
        });
    }

    @Test
    void testBean() {
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateBeanConfiguration.class);

        Cat cat = context.getBean(Cat.class);
        Cat domestic = context.getBean("domestic", Cat.class);
        Cat persian = context.getBean("persian", Cat.class);

        Assertions.assertNotSame(domestic,persian);

    }
}
