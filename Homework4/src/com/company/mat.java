package com.company;
import java.util.Scanner;
public class mat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        int b = (int) (a+1);
        int c = (int) a;
        double e=b-a;
        if(e>0.5)
            System.out.println(c);
       else
            System.out.println(b);
    }
}