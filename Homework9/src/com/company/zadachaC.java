package com.company;

import java.util.Random;

public class zadachaC {

    public static void main(String[] args) {
        printarray();
    }

    static void printarray() {
        Random random = new Random();
        int min = 1;
        int max = 100;
        int[] array = new int[6];
        System.out.print("Массив содержит: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt((max - min) + 1) + min;

            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("Вторая половина массива: ");
        for (int i = (array.length / 2); i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}