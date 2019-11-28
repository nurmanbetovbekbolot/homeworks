package com.company;

import java.util.Random;
import java.util.Scanner;

public class zadachaC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int min = 0;
        int max = 100;
        float avg1 = 0;
        float avg2 = 0;
        float avg3 = 0;
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        System.out.print("- Введите размер массива: ");
        int z = sc.nextInt();
        int[] A = new int[z];
        System.out.println("- Ваш массив = ");
        System.out.print("- ");

        for (int i = 0; i < z; i++) {
            A[i] = random.nextInt((max - min) + 1) + min;
            System.out.print(A[i] + " ");
        }

        for (int i = 0; i < z; i++) {
            if (A[i] <= 30) {
                counter1++;
                avg1 = avg1 + A[i];
            } else if (A[i] > 30 && A[i] <= 60) {
                counter2++;
                avg2 = avg2 + A[i];
            } else if (A[i] > 60) {
                counter3++;
                avg3 = avg3 + A[i];
            }
        }
        System.out.println();
        System.out.printf("-от 1 до 30 " + "%.1f", avg1 / counter1);
        System.out.print(" , количество " + counter1);
        System.out.println();
        System.out.printf("-от 31 до 60 " + "%.1f", avg2 / counter2);
        System.out.print(" , количество " + counter2);
        System.out.println();
        System.out.printf("-от 61 до 100 " + "%.1f", avg3 / counter3);
        System.out.print(" , количество " + counter3);
    }
}
