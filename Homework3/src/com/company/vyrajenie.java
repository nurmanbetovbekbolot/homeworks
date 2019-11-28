package com.company;

import java.util.Scanner;

public class vyrajenie {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();
        double d = s.nextDouble();
        double e = s.nextDouble();
        double f = s.nextDouble();
        double k = s.nextDouble();
        double p = s.nextDouble();
        double g = s.nextDouble();
        double sum= (((a+b)*c + d * (e / f) )* (4 / 5f))/(k+ p*(b/a) +g);
        System.out.printf("%.5f",sum);
    }
}
