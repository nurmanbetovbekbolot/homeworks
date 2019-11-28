package com.company;

import java.util.Scanner;

public class zadachaA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        if (b > a) {
            System.out.println("Четные числа: ");

            for (int i = a; i <= b; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                    sum = sum + i;

                }
            }
            System.out.println();
            System.out.print("Сумма чисел: ");
            System.out.println(sum);
        } else
            System.out.println("Error");
    }
}
