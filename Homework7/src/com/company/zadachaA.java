package com.company;

        import java.util.Random;

public class zadachaA {
    public static void main(String[] args) {
        Random random = new Random();
        int min = 0;
        int max = 5;
        int N = 6;
        int[] A = new int[N];
        boolean isFound = false;
        System.out.println("Массив:");

        for (int i = 0; i < N; i++) {
            A[i] = random.nextInt((max - min) + 1) + min;
            System.out.print(A[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < N-1; i++) {
            if (A[i] == A[i+1]) {
                isFound = true;
                System.out.println("Есть: " + A[i]);
                break;
            }
        }
        if (!isFound) {
            System.out.println("Нет ");
        }
    }
}
