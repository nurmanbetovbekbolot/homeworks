package com.company;

import java.util.Scanner;

public class treugolnik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double sum = (a+b+c);
        if(sum==180&&a>0&&b>0&&c>0){
            System.out.println("ДА");
        }
        else {
            System.out.println("НЕТ");
        }
    }
}
