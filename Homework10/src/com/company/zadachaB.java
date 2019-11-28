package com.company;

import java.util.Random;

public class zadachaB {
    public static void main(String[] args) {
        Random random = new Random();
        int min = 0;
        int max = 20;
        int N = 5;
        int[] A = new int[N];
        System.out.println("Массив:");
        for (int i = 0; i < N; i++) {
            A[i] = random.nextInt((max - min) + 1) + min;
            System.out.print(A[i] + " ");
        }

        int elem = printminelem(A);
        System.out.println();
        System.out.print("Минимальный элемент A["+elem+"] = "+A[elem]);
    }
    static int printminelem(int[] a) {
        int minelem = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[minelem] > a[i]) {
                minelem = i;
            }
        }


        return minelem;
    }
}