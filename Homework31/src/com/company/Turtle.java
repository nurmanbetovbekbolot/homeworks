package com.company;

public class Turtle extends Animal {

    public Turtle(String name, double weight) {
        super(name, weight);
    }

    @Override
    public String toString() {
        return name+" "+weight;
    }


    @Override
    public void swim() {
        System.out.println("I swim with fins");
    }

    @Override
    public void giveVoice() {
        System.out.println("Ugvey");
    }



}
