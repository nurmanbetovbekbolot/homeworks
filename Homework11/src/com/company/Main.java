package com.company;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int min = 1;
        int max = 5;
        int[] A = new int[6];
        boolean isFound=false;

        for (int i = 0; i < A.length; i++) {
            A[i] = random.nextInt((max - min) + 1) + min;
            System.out.print(A[i] + " ");
        }
        for(int i=0;i<A.length;i++){
        if(getCount(A,A[i])==2)
            isFound=true;
    }
        if(isFound){
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }

    static int getCount(int[] a, int X){
        int counter1 = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == X) {
                counter1++;
            }
        }
        return counter1;
    }
}
