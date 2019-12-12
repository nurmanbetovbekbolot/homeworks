package com.company;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;

public class zadacha_A {
    public static void main(String[] args) {
        ArrayList<Cat> cats1 = new ArrayList<>();
        LinkedList<Cat> cats2= new LinkedList<>();
        for (int i = 0; i <1000000 ; i++) {
            cats1.add(new Cat("cat1",2));
            cats2.add(new Cat("cat2",3));
        }
        long start=System.currentTimeMillis();
        for (int i = 500000; i <500100 ; i++) {
            cats1.add(i,new Cat("cat3",4));
        }
        long end=System.currentTimeMillis();

        long start2=System.currentTimeMillis();
        for (int i = 500000; i <500100 ; i++) {
            cats2.add(i,new Cat("cat4",4));
        }
        long end2=System.currentTimeMillis();

        long start3=System.currentTimeMillis();
        for (int i = 0; i <100 ; i++) {
            cats1.add(i,new Cat("cat3",4));
        }
        long end3=System.currentTimeMillis();


        long start4=System.currentTimeMillis();
        for (int i = 0; i <100 ; i++) {
            cats2.add(i,new Cat("cat3",4));
        }
        long end4=System.currentTimeMillis();

        long start5=System.currentTimeMillis();
        for (int i = 1000000; i <1000100 ; i++) {
            cats1.add(i,new Cat("cat3",4));
        }
        long end5=System.currentTimeMillis();

        long start6=System.currentTimeMillis();
        for (int i = 1000000; i <1000100 ; i++) {
            cats2.add(i,new Cat("cat3",4));
        }
        long end6=System.currentTimeMillis();

        System.out.print("Время работы для ArrayList в середине(в милисекундах) = ");
        System.out.println(end-start);

        System.out.print("Время работы для LinkedList в середине(в милисекундах) = ");
        System.out.println(end2-start2);
        System.out.print("Время работы для ArrayList в начале(в милисекундах) = ");
        System.out.println(end3-start3);
        System.out.print("Время работы для LinkedList в начале(в милисекундах) = " + (System.currentTimeMillis()-start4));
        System.out.println(end4-start4);
        System.out.print("Время работы для ArrayList в конце(в милисекундах) = " + (System.currentTimeMillis()-start5));
        System.out.println(end5-start5);
        System.out.print("Время работы для LinkedList в конце (в милисекундах) = " + (System.currentTimeMillis()-start6));
        System.out.println(end6-start6);
        long start7=System.currentTimeMillis();
        cats1.get(500000);
        long end7=System.currentTimeMillis();
        System.out.print("Время работы для ArrayList при считывании с середины (в милисекундах) = ");
        System.out.println(end7-start7);
        long start8=System.currentTimeMillis();
        cats2.get(500000);
        long end8=System.currentTimeMillis();
        System.out.print("Время работы для LinkedList при считывании с середины (в милисекундах) = ");
        System.out.println(end8-start8);

        long start9=System.currentTimeMillis();
        cats1.get(1000299);
        long end9=System.currentTimeMillis();
        System.out.print("Время работы для ArrayList при считывании с конца (в милисекундах) = ");
        System.out.println(end9-start9);
        long start10=System.currentTimeMillis();
        cats2.get(1000299);
        long end10=System.currentTimeMillis();
        System.out.print("Время работы для LinkedList при считывании с конца (в милисекундах) = ");
        System.out.println(end10-start10);


        long start11=System.currentTimeMillis();
        cats1.remove(500000);
        long end11=System.currentTimeMillis();
        System.out.print("Время работы для ArrayList при удалении с середины (в милисекундах) = ");
        System.out.println(end11-start11);
        long start12=System.currentTimeMillis();
        cats2.remove(500000);
        long end12=System.currentTimeMillis();
        System.out.print("Время работы для LinkedList при удалении с середины (в милисекундах) = ");
        System.out.println(end12-start12);

        long start13=System.currentTimeMillis();
        cats1.remove(1);
        long end13=System.currentTimeMillis();
        System.out.print("Время работы для ArrayList при удалении в начале (в милисекундах) = ");
        System.out.println(end13-start13);
        long start14=System.currentTimeMillis();
        cats2.remove(1);
        long end14=System.currentTimeMillis();
        System.out.print("Время работы для LinkedList при удалении в начале (в милисекундах) = ");
        System.out.println(end14-start14);
        System.out.println("При добавлении в середину ArrayList быстрее\nПри добавлении в начало LinkedList быстрее\nПри добавлении в конец LinkedList быстрее\nПри считывании с середины ArrayList быстрее\nПри считывании с конца LinkedList быстрее\nПри удалении с середины ArrayList быстрее\nПри удалении в начале LinkedList быстрее");
    }
}