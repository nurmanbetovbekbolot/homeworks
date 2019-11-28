package com.company;

import java.util.Scanner;

public class zadachaAA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        printchars(N);
    }

    static void printchars(int N) {
        for (int i = 0; i <= N + 2; i = i++) {
            int x = N % 10;
            N = N / 10;
            System.out.println(x);

        }
    }
}