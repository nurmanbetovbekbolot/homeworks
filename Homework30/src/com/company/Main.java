package com.company;

public class Main {

    public static void main(String[] args) {
        Koala koala= new Koala(2,200.0);
        Edible fruit= new Fruits("Banana","Yellow");
	Monkey monkey = new Monkey(2,320.0,"Martin");
	monkey.setAble(koala);
        System.out.println(monkey);
        monkey.canEat(fruit);
    }
}
