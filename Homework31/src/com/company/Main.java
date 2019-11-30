package com.company;

import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter weight:");
        double w=sc.nextDouble();
        Swimmable[] oceanarium= new Swimmable[15];;
        int min = 50;
        int max = 200;
        int []A=new int[15];
        for (int i = 0; i < A.length; i++) {
            A[i] = random.nextInt((max - min) + 1) + min;
        }
        for (int i = 0; i <oceanarium.length; i++) {
            if(i<5) oceanarium[i]=new Shark("Akula",A[i]);

            else if(i<10) oceanarium[i]=new Turtle("Turtle",A[i]);
            else oceanarium[i]=new Duck("Duck",A[i]);
        }
        for (Swimmable a:oceanarium) {
            if (a instanceof Animal){
                if(a.distinguishWithWeight(w)){
                    System.out.println(a);
                }
            }
        }
    }
}
