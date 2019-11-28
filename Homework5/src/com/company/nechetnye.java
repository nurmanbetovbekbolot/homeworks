package com.company;

import java.util.Scanner;

public class nechetnye {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a <=b) {
            while (a <= b) {
                if (a % 2 != 0) {
                    System.out.println(a);
                }
                a++;
            }
        } else {
            while (a > b) {
                if (b % 2 != 0) {
                    System.out.println(b);
                }
                b++;
            }
        }
    }
}
