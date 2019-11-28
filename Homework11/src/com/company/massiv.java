package com.company;

import java.util.Scanner;

public class massiv {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum = getsum(num);
        int sum2 = getsum(1234);
        System.out.println(sum+" ");
    }
    static int getsum(int a){
        int sum=0;
        while (a>0){
            sum=sum+a%10;

            a=a/10;
        }

        return sum;
    }
}