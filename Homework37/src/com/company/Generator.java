package com.company;

import java.util.Random;

public class Generator {

    private static Random rand = new Random();
    private static String[] nickNames = { "Kr", "Ca", "Ra", "Mrok", "Cru",
            "Ray", "Bre", "Zed", "Drak", "Mor", "Jag", "Mer", "Jar", "Mjol",
            "Zork", "Mad", "Cry", "Zur", "Creo", "Azak", "Azur", "Rei", "Cro",
            "Mar", "Luk" };


    protected static Integer generateAges(){
            int min=1;
            int max=25;
            int age=rand.nextInt((max-min)+min)+1;
            return age;
    }


   protected static String generateName() {

        return nickNames[rand.nextInt(nickNames.length)] ;

    }
}
