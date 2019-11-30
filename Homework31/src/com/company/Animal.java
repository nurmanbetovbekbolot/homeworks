package com.company;

public abstract class Animal implements Swimmable {
    String name;
    double weight;

    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public boolean distinguishWithWeight(double w) {
        if (w > this.weight)
            return false;
        else
            return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
