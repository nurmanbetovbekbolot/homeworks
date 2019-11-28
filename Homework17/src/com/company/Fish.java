package com.company;

public class Fish {
    String color;
    int numberoffins;
    int age;

    public Fish(String color, int numberoffins, int age) {
        this.color = color;
        this.numberoffins = numberoffins;
        if (age <= 0)
            return;
        else
            this.age = age;
    }

    public String getColor() {
        return color;
    }

    public int getNumberoffins() {
        return numberoffins;
    }

    public int getAge() {
        return age;
    }
}
