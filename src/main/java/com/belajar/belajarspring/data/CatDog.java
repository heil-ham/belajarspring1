package com.belajar.belajarspring.data;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class CatDog {
    private Cat cat;
    private Dog dog;

    public String combineSound() {
        return cat.makeSound()+" "+dog.makeSound();
    }
}
