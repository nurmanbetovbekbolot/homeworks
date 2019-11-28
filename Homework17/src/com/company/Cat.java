package com.company;

public class Cat {
    String nickname;
    String color;
    int age;
    String gender;

    public Cat(String nickname, String color, int age, String gender) {
        this.nickname = nickname;
        this.color = color;
        if(age<=0)
            return;
        else
            this.age = age;
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

    public String getGender() {
        return gender;
    }
}
