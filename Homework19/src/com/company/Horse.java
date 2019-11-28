package com.company;

public class Horse {
    String nickname;
    double age;
    String gender;
    double weight;

    public Horse(String nickname, double age, String gender, double weight) {
        this.nickname = nickname;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }

    public Horse() {

    }

    @Override
    public String toString() {
        return "Horse{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", weight=" + weight +
                '}';
    }

    static Horse[] createHorses(int amount) {
        Horse[] objects = new Horse[amount];
        for (int i = 0; i < objects.length; i++) {
            objects[i] = new Horse();
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
