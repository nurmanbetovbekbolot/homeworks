package com.company;

public class Monkey extends Animal implements AbleToClimb{
    String nickname;
    AbleToClimb able;


    public Monkey(int age, double weight, String nickname) {
        super(age, weight);
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        String message="I am "+nickname;
         if(able==null) {
             return message;
         }else
           { return message +", on me is "+able;
                }
    }

    @Override
    public void climb() {
        System.out.println("I can climb");
    }

    void canEat(Edible edible) {
        System.out.println("I eat "+edible);
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public AbleToClimb getAble() {
        return able;
    }

    public void setAble(AbleToClimb able) {
        this.able = able;
    }


}
