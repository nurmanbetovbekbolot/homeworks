package com.company;

        import java.util.Scanner;

public class zadachaD {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a==b&&b==c) {
            System.out.println("3");
        }
        else if (a==b&&b!=c||a!=b&&b==c||a==c&&a!=b){
            System.out.println("2");
        }
        else if (a!=b&&b!=c&&a!=c){
            System.out.println("1");
        }
    }
}
