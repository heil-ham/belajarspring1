package com.belajar.belajarspring;

import com.belajar.belajarspring.data.Cat;
import com.belajar.belajarspring.data.CatDog;
import com.belajar.belajarspring.data.Dog;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyInjectionTest {
    private final ApplicationContext context = new AnnotationConfigApplicationContext(DependencyInjectionConfiguration.class);

    @Test
    void testDI() {
        Cat cat = context.getBean("persian", Cat.class);
        Dog dog = context.getBean(Dog.class);
        CatDog catDog = context.getBean(CatDog.class);

        System.out.println(cat.makeSound());
        System.out.println(dog.makeSound());
        System.out.println(catDog.combineSound());

//        Assertions.assertSame(cat, catDog.getCat());
//        Assertions.assertSame(dog, catDog.getDog());
    }

//    @Test
//    void testNoDI() {
//        var cat = new Cat();
//        var dog = new Dog();
//
//        var catDog = new CatDog(cat, dog);
//
//        Assertions.assertSame(cat, catDog.getCat());
//        Assertions.assertSame(dog, catDog.getDog());
//    }
}
