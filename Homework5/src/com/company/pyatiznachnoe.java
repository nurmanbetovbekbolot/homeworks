package com.company;

public class pyatiznachnoe {
    public static void main(String[] args) {
           int a=10000;
        while (a<=99999) {

           if(a%133==125&&a%134==111) {
               System.out.println(a);
           }
           a++;
        }
    }
}