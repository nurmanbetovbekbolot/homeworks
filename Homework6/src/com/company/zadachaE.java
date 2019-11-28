package com.company;

        import java.util.Random;

public class zadachaE {
    public static void main(String[] args) {
        Random random= new Random();
        int min=0;
        int max = 100;
        int N = 101;
        double avg=0;
        int counter=0;
        int[] A = new int[N];
        for (int i = 0; i < 100; i++) {
            A[i]=random.nextInt((max-min)+1)+min;

            counter++;
            avg = avg + A[i];
        }
        System.out.printf("%.1f",avg/counter);
    }
}
