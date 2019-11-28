package com.company;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter three numbers :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int summa=a+b+c;
        int proizvedenie=a*b*c;
        float sred= ((a+b+c)/3.0f);
        System.out.println(a+"+"+b+"+"+c+"="+summa);
        System.out.println(a+"*"+b+"*"+c+"="+proizvedenie);
        System.out.print("("+a+"+"+b+"+"+c+")"+"/3"+"=");
        System.out.printf("%.3f",sred);
    }
}
