package com.company;
public class zadachaC {
    public static void main(String[] args) {

       int umnoj=0;
        for (int i = 1; i <= 10; i++) {
            for (int j=1;j<=10;j++){
                umnoj=i*j;
                System.out.printf("%d * %d = %d\n",i,j,umnoj);
            }
        }
    }
}
