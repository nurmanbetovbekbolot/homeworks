package com.company;

import java.util.Scanner;

public class ternarnyi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        int b = (int) (a+1);
        int c = (int) a;
        double e=b-a;
        int k = (e > 0.5) ? c : b;
        System.out.println(k);
    }
}

