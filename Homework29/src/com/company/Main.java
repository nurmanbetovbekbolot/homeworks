package com.company;

public class Main {

    public static void main(String[] args) {
	Bread bread =new Bread("Bulka",20,350);
	Circle circle= new Circle(4);
        System.out.println(bread);
	bread.Bake();
        System.out.println(circle);
	circle.draw();
    }
}
