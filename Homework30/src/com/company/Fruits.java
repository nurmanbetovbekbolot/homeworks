package com.company;

public class Fruits implements Edible {
    String name;
    String color;

    public Fruits(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return  name ;
    }

    @Override
    public void canBeEaten() {
        System.out.println("Eat me");
    }
}
