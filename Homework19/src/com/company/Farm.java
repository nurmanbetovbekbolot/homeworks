package com.company;

import java.util.Arrays;

public class Farm {
    String address;
    Cow[] cows;
    Sheep[] sheep;
    Horse[] horses;
    String owner;

    public Farm(String address, Cow[] cows, Sheep[] sheep, Horse[] horses, String owner) {
        this.address = address;
        this.cows = cows;
        this.sheep = sheep;
        this.horses = horses;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "address='" + address + '\'' +
                ", cows=" + cows.length +
                ", sheep=" + sheep.length +
                ", horses=" + horses.length +
                ", owner='" + owner + '\'' +
                '}';
    }

    public Farm() {

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
