package com.company;

        import java.util.Scanner;

public class summacifr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int z = 0;
        while (a > 0 && a < 1000000) {
            z = z + a % 10;
            a = a / 10;
        }
        System.out.println(z);
    }
}