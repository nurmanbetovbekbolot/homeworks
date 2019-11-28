package com.company;

public abstract class Locality {
    String title;
    String location;
    Head head;
    int numberofcitizens;
    double size;

    public Locality(String title, String location, Head head, int numberofcitizens, double size) {
        this.title = title;
        this.location = location;
        this.head = head;
        this.numberofcitizens = numberofcitizens;
        this.size = size;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public int getNumberofcitizens() {
        return numberofcitizens;
    }

    public void setNumberofcitizens(int numberofcitizens) {
        this.numberofcitizens = numberofcitizens;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
