package com.company;

import java.util.Random;

public class zadachaD {

    public static void main(String[] args) {
        printaverage();
    }

    static void printaverage() {
        Random random = new Random();
        int min = 5;
        int max = 10;
        double sum = 0;
        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                matrix[i][j] = random.nextInt((max - min) + 1) + min;
                sum = sum + matrix[i][j];
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        double avg = sum / (matrix.length * matrix.length);
        System.out.print("Среднее арифметическое = ");
        System.out.printf("%.1f", avg);
    }
}