package com.company;

        import java.util.Scanner;

public class zadachaC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if (0 < A && A < B) {
            for (int i = A; i <= B; i++) {
                if (i % 3 == 0)
                    System.out.print(i+" ");
                else if(B-A==1&&A % 3 != 0&&B%3!=0)
                    System.out.println();
            }
        } else
            System.out.println("Error");
    }
}
