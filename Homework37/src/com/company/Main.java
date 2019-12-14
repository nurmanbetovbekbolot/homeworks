package com.company;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        HashSet<Dog> dogs = new HashSet<>();
        Dog[] dogs1 = new Dog[40];
        for (int i = 0; i < dogs1.length; i++) {
            dogs1[i] = new Dog(Generator.generateName(), Generator.generateAges());
        }

        for (int i = 0; i < 40; i++) {
            dogs.add(dogs1[i]);
        }
        for (int i = 0; i < dogs1.length; i++) {
            System.out.println(dogs1[i] + " ");
        }
        System.out.println(dogs1.length);
        System.out.println(dogs);
        System.out.println(dogs.size());
    }
}