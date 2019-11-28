package com.company;

import java.awt.*;
import java.util.Random;

public class Circles {
    double radius;
    String color;
    double circumference;
    final double Pi=3.14;
    int x;
    int y;
    static String[] colors={"RED","GREEN","BLUE"};
    Random random=new Random();

    public Circles(double radius, int x, int y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public Circles(double radius) {
        this.radius = radius;
        color=colors[random.nextInt(3)];
    }
    double findArea(){
        return Pi*radius*radius;
    }

    double findCircumference(){
        circumference=2*Pi*radius;
        return circumference;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return  "Color : "+color+
                "\n"+"Area : "+findArea()+
                "\n"+"Circumference : "+findCircumference();
    }



    public void draw(Graphics graphics){
        graphics.setColor(Color.BLACK);
        graphics.fillOval(x,y, (int) (radius*7), (int) (radius*7));
    }
}
