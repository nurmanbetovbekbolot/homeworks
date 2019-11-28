package com.company;

import java.util.Scanner;

public class zadachaD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if (0 < A && A < B) {
            for (int i = A; i <= B; i++) {
                if (i % C == 0) {

                    System.out.print(i + " ");
                }
            }
        } else
            System.out.println("Error");
    }
}
