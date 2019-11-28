package com.company;

import java.util.Scanner;

public class zadachaE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            int temp = i;
            boolean result = true;
            while (temp > 0) {

                if (temp % 10 == 0 || i % (temp % 10) != 0) {
                    result = false;
                    break;
                }
                temp = temp / 10;
            }
            if (result)
                System.out.print(i + " ");


        }
    }
}