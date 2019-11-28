package com.company;

public class Dog {
    String nickname;
    String color;
    int age;
    String size;
    String gender;

    public Dog(String nickname, String color, int age, String size, String gender) {
        this.nickname = nickname;
        this.color = color;
        if (age <= 0)
            return;
        else
            this.age = age;
        this.size = size;
        this.gender = gender;
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

    public String getSize() {
        return size;
    }

    public String getGender() {
        return gender;
    }
}
