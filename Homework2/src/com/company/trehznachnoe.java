package com.company;

import java.util.Scanner;

public class trehznachnoe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=a/100;
        int c=a%100/10;
        int d=a%10;
        System.out.println(b+", "+c+", "+d);
    }
}
