package com.company;

public class Sheep {
    String nickname;
    double age;
    String gender;
    double weight;

    public Sheep(String nickname, double age, String gender, double weight) {
        this.nickname = nickname;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }

    public Sheep() {

    }

    @Override
    public String toString() {
        return "Sheep{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", weight=" + weight +
                '}';
    }

    static Sheep[] createSheep(int amount) {
        Sheep[] objects = new Sheep[amount];
        for (int i = 0; i < objects.length; i++) {
            objects[i] = new Sheep();
        }
        return objects;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setAge(double age) {
        if (age < 0) {
            return;
        } else {
            this.age = age;
        }
    }


    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getNickname() {
        return nickname;
    }

    public double getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public double getWeight() {
        return weight;
    }

}
