package com.company;

public abstract class Animal{
    int age;
    double weight;

    public Animal(int age, double weight) {
        setAge(age);
        setWeight(weight);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", weight=" + weight +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0)
            return;
            this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight<0)
            return;
            this.weight = weight;
        }
    }
