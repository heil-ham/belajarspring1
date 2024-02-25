package com.belajar.belajarspring.data;

public class Cat {
    private String sound = "cat";

    public Cat() {
    }

    public Cat(String sound) {
        this.sound = sound;
    }

    public String makeSound() {
        return "meow i'm "+sound;
    }
}
