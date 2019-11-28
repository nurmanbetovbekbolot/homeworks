package com.company;

public class Region extends Locality{
    public Region(String title, String location, Head head, int numberofcitizens, double size) {
        super(title, location, head, numberofcitizens, size);
    }

    @Override
    public String toString() {
        return "Region{" +
                "title='" + title + '\'' +
                ", head=" + head +
                '}';
    }
}
