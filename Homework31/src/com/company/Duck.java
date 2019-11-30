package com.company;

public class Duck extends Animal {
    public Duck(String name, double weight) {
        super(name, weight);
    }

    @Override
    public String toString() {
        return name+" "+weight;
    }


    @Override
    public void swim() {
        System.out.println("I swim with paws");
    }

    @Override
    public void giveVoice() {
        System.out.println("Krya-Krya");
    }
}
