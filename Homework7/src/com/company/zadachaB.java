package com.company;

import java.util.Random;
import java.util.Scanner;

public class zadachaB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int min = 1;
        int max = 12;

        System.out.print("- Введите размер массива: ");
        int z = sc.nextInt();
        int[] A = new int[z];
        System.out.println("- Ваш массив = ");
        System.out.print("- ");

        for (int i = 0; i < z; i++) {
            A[i] = random.nextInt((max - min) + 1) + min;
            System.out.print(A[i] + " ");
        }
        System.out.println();
        System.out.print("- ");
        for (int i = 0; i < z; i++) {
            if (A[i] == 1)
                System.out.print("Январь ");
            else if (A[i] == 2)
                System.out.print("Февраль ");
            else if (A[i] == 3)
                System.out.print("Март ");
            else if (A[i] == 4)
                System.out.print("Апрель ");
            else if (A[i] == 5)
                System.out.print("Май ");
            else if (A[i] == 6)
                System.out.print("Июнь ");
            else if (A[i] == 7)
                System.out.print("Июль ");
            else if (A[i] == 8)
                System.out.print("Август ");
            else if (A[i] == 9)
                System.out.print("Сентябрь ");
            else if (A[i] == 10)
                System.out.print("Октябрь ");
            else if (A[i] == 11)
                System.out.print("Ноябрь ");
            else if (A[i] == 12)
                System.out.print("Декабрь ");
        }
    }
}