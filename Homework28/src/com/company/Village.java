package com.company;

public class Village extends Locality {
    int numberOfMunicipalGovernments;

    public Village(String title, String location, Head head, int numberofcitizens, double size, int numberOfMunicipalGovernments) {
        super(title, location, head, numberofcitizens, size);
        this.numberOfMunicipalGovernments = numberOfMunicipalGovernments;
    }

    @Override
    public String toString() {
        return "Village{" +
                "title='" + title + '\'' +
                ", head=" + head +
                '}';
    }

    public int getNumberOfMunicipalGovernments() {
        return numberOfMunicipalGovernments;
    }

    public void setNumberOfMunicipalGovernments(int numberOfMunicipalGovernments) {
        this.numberOfMunicipalGovernments = numberOfMunicipalGovernments;
    }
}
