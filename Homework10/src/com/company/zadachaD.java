package com.company;

public class zadachaD {
    public static void main(String[] args) {
        int N = 101;
        int[] A = new int[N];
        System.out.println("Массив:");
        for (int i = 1; i < N; i++) {
            A[i] = i;
            System.out.print(A[i] + " ");
        }
        System.out.println();

        int sum= printsum(A,3);
        int sum2= printsum(A,4);
        int difference=sum-sum2;
        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(difference);
    }

    static int printsum(int[] a,int number) {
        int summakratnyh=0;
        for (int i = 0; i < a.length; i++) {

            if (a[i] % number == 0) {
                summakratnyh = summakratnyh + a[i];
            }
        }
            return summakratnyh;
        }

}
