package com.company;

import java.util.Scanner;

public class zadachaA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean proverka1 = false;
        String valuta = "";
        System.out.print("Введите какую валюту вы хотите поменять (usd,eur):");

        while (!proverka1) {
            valuta = sc.nextLine();
            if (!valuta.equals("usd")&&!valuta.equals("eur")) {
                System.out.println("У нас принимаются только Евро и доллары ");
                System.out.print("Введите какую валюту вы хотите поменять (usd,eur):");
            } else
                proverka1 = true;
        }
        System.out.print("Введите сумму, которую вы хотите поменять :");

        int summa = sc.nextInt();
        System.out.print("Введите тип операции (покупка:1 продажа: 2)");
        int tipop = sc.nextInt();

        double convertedCash = convertCash(valuta, summa, tipop);
        if(convertedCash>200000){
            double otkaz=convertedCash-200000;
            System.out.printf("Вы превысили лимит в: %.1f ",otkaz);
        }
        else
        System.out.printf("%.1f", convertedCash);
    }

        static double convertCash(String currency, int sum, int operation){

            double[] massivpokupok = new double[2];
            double[] massivprodaj = new double[2];
            massivpokupok[0] = 68.71;
            massivpokupok[1] = 76.77;
            massivprodaj[0] = 69.77;
            massivprodaj[1] = 77.77;

        if (operation == 1) {
            double sum1 = sum * massivpokupok[0];
            double sum2 = sum * massivpokupok[1];
            if (currency.equals("usd")) {
                return sum1;
            } else if (currency.equals("eur")) {
                return sum2;
            }
        }
        else if(operation==2){
            double sum1 = sum * massivprodaj[0];
            double sum2 = sum * massivprodaj[1];
            if (currency.equals("usd")) {
                return sum1;
            } else if (currency.equals("eur")) {
                return sum2;
            }
        }
        return sum;
    }
}