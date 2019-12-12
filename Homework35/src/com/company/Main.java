package com.company;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<Animal> animals=new LinkedList<Animal>();
        LinkedList<Animal> animals2=new LinkedList<Animal>();
        for (int i = 1; i <51; i++) {

                animals.add(new Cat("cat",i));
                animals.add(new Dog("dog",i));
        }
        System.out.println(animals);
        System.out.println(animals.size());
        int counter=0;
            for (int i = 0; i <animals.size() ; i++) {


            if(animals.get(i) instanceof Cat) {
                counter += 1;
                if (counter==5){
                    animals.remove(i);
                    counter=0;
                }
            }
        }
        System.out.println(animals);
        System.out.println(animals.size());
        ArrayList<Animal> animals3=new ArrayList<>();
        Mouse mouse=new Mouse("mouse",1);
        counter=0;
        for (int i = 0; i < animals.size(); i++) {

            if (animals.get(i) instanceof Dog){
                counter+=1;
                if (counter==3){
                    animals.add(i+1,mouse);
                    counter=0;

                }
            }

        }

        System.out.println(animals);
        System.out.println(animals.size());

        animals3.addAll(animals);

        System.out.println(animals3);
        System.out.println(animals3.size());

        for (int i = 0; i <animals.size() ; i++) {
            if (animals.get(i) instanceof Cat&&animals.get(i+1) instanceof Mouse||animals.get(i) instanceof Mouse&&animals.get(i+1) instanceof Cat){

                    animals2.add(animals.get(i));
                    animals2.add(animals.get(i+1));
                    animals.remove(i);
                    animals.remove(i+1);
            }  }
        System.out.println(animals);
        System.out.println(animals.size());
            System.out.println(animals2);
        System.out.println(animals2.size());
        int countCatsAge=0;
        int countDogsAge=0;
        int countMiceAge=0;
        for (int i = 0; i <animals.size(); i++) {
            if (animals.get(i) instanceof Cat){
                countCatsAge=countCatsAge+animals.get(i).getAge();
            } else if(animals.get(i) instanceof Dog){
                countDogsAge=countDogsAge+animals.get(i).getAge();
            }else
                countMiceAge=countMiceAge+animals.get(i).getAge();
        }
        System.out.println(countCatsAge);
        System.out.println(countDogsAge);
        System.out.println(countMiceAge);
        LinkedList<Animal> animals4 = new LinkedList<>();
            for(Animal c:animals) {


                if(c instanceof Dog){
                animals4.add(c);
            }
                if (c instanceof Cat){
                    animals4.addFirst(c);}
            }
        for(Animal c:animals) {
            if(c instanceof Mouse)
                animals4.addLast(c);
            }
        System.out.println(animals4);
    }
}