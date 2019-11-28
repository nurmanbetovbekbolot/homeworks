package com.company;

import java.util.Scanner;

public class zadachaB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int factorial = 1;
        if (a > 0 && a < 10) {
            for (int i = a; i > 0; i--) {
                factorial = factorial * i;
            }
            System.out.println(factorial);
        } else {
            System.out.println("Ошибка неверные входные данные");
        }
    }
}
