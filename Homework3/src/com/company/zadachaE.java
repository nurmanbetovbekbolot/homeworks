package com.company;

import java.util.Scanner;

public class zadachaE {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        double n = sc.nextDouble();
        double a = sc.nextDouble();

        if (n%a==0) {
            System.out.println("Делится");
        }
        else {
            System.out.println("Не делится");
        }
    }}

