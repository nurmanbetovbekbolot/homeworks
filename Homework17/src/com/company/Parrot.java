package com.company;

public class Parrot {
    String nickname;
    String color;
    int age;

    public Parrot(String nickname, String color, int age) {
        this.nickname = nickname;
        this.color = color;
        if (age <= 0)
            return;
        else
            this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }
}
