package com.company;

import java.util.Scanner;

public class summachisel {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=n*(n+1)/2;
        if(n==0){
            System.out.println(1);
        }
        else
        System.out.println(sum);
    }
}
