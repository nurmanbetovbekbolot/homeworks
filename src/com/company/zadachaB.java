package com.company;

import java.util.ArrayList;

public class zadachaB {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            int a = (int) (Math.random() * 100 + 1);
            list.add(a);
        }
        for (int i = 0; i < list.size(); i++) {

            if (i % 2 == 0) {
                list2.add(i);
            } else {
                list3.add(i);
            }
        }

        System.out.println(list);
        System.out.println(list.size());

        System.out.println(list2.size());
        System.out.println(list2);

        System.out.println(list3.size());
        System.out.println(list3);
    }
}
