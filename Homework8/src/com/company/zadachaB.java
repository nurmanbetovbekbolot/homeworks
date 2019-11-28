package com.company;

import java.util.Random;

public class zadachaB {
    public static void main(String[] args) {
        Random random = new Random();
        int min = 0;
        int max = 20;
        int N = 10;
        int counter1 = 0;
        int counter2 = 0;
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
                counter1=1;
            } else if (A[i] == A[minelem])
                counter1++;
        }

        for (int i = 0; i < N; i++) {
            if (A[i] > A[maxelem]) {
                maxelem = i;
                counter2=1;
            } else if (A[i] == A[maxelem])
                counter2++;
        }


        System.out.println("Минимальный элемент: " + A[minelem] + ", количество: " + counter1);
        System.out.println("Максимальный элемент: " + A[maxelem] + ", количество: " + counter2);


    }
}

