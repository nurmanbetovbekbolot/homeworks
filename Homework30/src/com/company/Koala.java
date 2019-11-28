package com.company;

public class Koala extends Animal implements AbleToClimb {
    public Koala(int age, double weight) {
        super(age, weight);
    }

    @Override
    public void climb() {
        System.out.println("I can climb");
    }

    @Override
    public String toString() {
        return "Koala";
    }
}
