package com.company;

import java.util.Random;

public class zadachaC {
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
        int elem = printmaxelem(A);
        System.out.println();
        System.out.print("Максимальный элемент A["+elem+"] = "+A[elem]);
    }
    static int printmaxelem(int[] a) {
        int maxelem = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > a[maxelem]) {
                maxelem = i;
            }
        }

        return maxelem;
    }
}