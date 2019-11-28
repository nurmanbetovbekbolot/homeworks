package com.company;

public class Cow {
    String nickname;
    double age;
    String gender;
    double weight;

    public Cow(String nickname, double age, String gender, double weight) {
        this.nickname = nickname;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }

    public Cow() {

    }

    @Override
    public String toString() {
        return "Cow{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", weight=" + weight +
                '}';
    }

    static Cow[] createCows(int amount) {
        Cow[] objects = new Cow[amount];
        for (int i = 0; i < objects.length; i++) {
            objects[i] = new Cow();
        }
        return objects;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }


    public void setAge(double age) {
        if(age<0){
            return;}
        else{
        this.age = age;}
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
