package com.company;

public class Head extends Person{
    public Head(String name, String surname, int age, int height, double weight) {
        super(name, surname, age, height, weight);
    }

    @Override
    public String toString() {
        return "Head{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
