package com.company;

public class Shark extends Animal {

    public Shark(String name, double weight) {
        super(name, weight);
    }

    @Override
    public String toString() {
        return name + " " + weight;
    }


    @Override
    public void swim() {
        System.out.println("I swim with tale");
    }

    @Override
    public void giveVoice() {
        System.out.println("Hr-hr");
    }

    void hunt() {
        System.out.println("Teeth");
    }
}
