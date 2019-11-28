package com.company;

import java.util.Scanner;

public class gradusy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float c=sc.nextFloat();
        float f= (float) (c*1.8+32);
        System.out.println("Temperature in Fahrenheit is "+f);
    }
}
