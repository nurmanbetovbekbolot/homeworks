package com.company;

public class armstrong {
    public static void main(String[] args) {
        int a = 999;
        while (a >= 100) {
            int x = a / 100;
            int y = (a / 10) % 10;
            int z = a % 10;
            int sum = (int) (Math.pow(x, 3) + Math.pow(y, 3) + Math.pow(z, 3));
            if (a == sum){
            System.out.println(a);}
        a--;}
    }
}