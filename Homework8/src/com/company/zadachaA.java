package com.company;

import java.util.Random;

public class zadachaA {
    public static void main(String[] args) {
        Random random = new Random();
        int min = 0;
        int max = 20;
        int N = 10;
        int[] A = new int[N];
        System.out.println("Массив:");
        int minelem = 0;
        int maxelem = 0;
        for (int i = 0; i < N; i++) {
            A[i] = random.nextInt((max - min) + 1) + min;
            System.out.print(A[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < N; i++) {
            if (A[minelem] > A[i]) {
                minelem = i;
            }
            if (A[i] > A[maxelem]) {
                maxelem = i;
            }
        }

        System.out.printf("Минимальный элемент A[%d] = %d", minelem, A[minelem]);
        System.out.println();
        System.out.printf("Максимальный элемент A[%d] = %d", maxelem, A[maxelem]);

    }
}