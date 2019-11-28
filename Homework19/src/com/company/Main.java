package com.company;
public class Main {

    public static void main(String[] args) {

        Farm farm1= new Farm("Pod str",Cow.createCows(5),Sheep.createSheep(3),Horse.createHorses(2),"Kanatova");
        Farm farm2= new Farm("Kulatov str",Cow.createCows(1),Sheep.createSheep(1),Horse.createHorses(1),"Asanov");
        System.out.println(farm1.toString());
        System.out.println();
        System.out.println(farm2.toString());
    }
    }