package com.company;

import java.util.ArrayList;

public class Variant2 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list.add("Ветер с моря дул");
        list.add("Нагонял беду");
        list.add("И сказал ты мне");
        list.add("Больше не приду");

        list.set(0,list.get(0)+" "+list.get(0));
        list.set(1,list.get(1)+" "+list.get(1));
        list.set(2,list.get(2)+" "+list.get(2));
        list.set(3,list.get(3)+" "+list.get(3));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)+" "+i);
        }
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() >= 20) {
                list2.add(list.get(i));

            }
             list2.remove("И сказал ты мне И сказал ты мне");
        }
           System.out.println(list2);

    }
}