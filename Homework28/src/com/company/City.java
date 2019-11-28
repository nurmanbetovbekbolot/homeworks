package com.company;

public class City extends Locality {
    Region[] regions;
    boolean existenceOfSubway;

    public City(String title, String location, Head head, int numberofcitizens, double size, Region[] regions, boolean existenceOfSubway) {
        super(title, location, head, numberofcitizens, size);
        this.regions = regions;
        this.existenceOfSubway = existenceOfSubway;
    }

    @Override
    public String toString() {
        return "City{" +
                "title='" + title + '\'' +
                ", head=" + head +
                '}';
    }

    public Region[] getRegions() {
        return regions;
    }

    public void setRegions(Region[] regions) {
        this.regions = regions;
    }

    public boolean isExistenceOfSubway() {
        return existenceOfSubway;
    }

    public void setExistenceOfSubway(boolean existenceOfSubway) {
        this.existenceOfSubway = existenceOfSubway;
    }
}
