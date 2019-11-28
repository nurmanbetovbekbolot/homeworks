package com.company;

        import java.util.Scanner;

public class zadachaA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        printnumber(N);
    }

    static void printnumber(int N) {

        int i = 0;
        for (i = N; i >= 10; i = i / 10) {
            System.out.println(i % 10);

        }
        System.out.println(i);
    }
}