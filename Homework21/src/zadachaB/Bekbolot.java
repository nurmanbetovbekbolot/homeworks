package zadachaB;

import java.util.Arrays;

public class Bekbolot extends Person {
    double height;
    double weight;
    String[] hobbies;
    Work[] works;
    Study[] studies;
    public Bekbolot(String dateofbirth, String placeofbirth, String lName, String name, String gender, int numberoflessons) {
        super(dateofbirth, placeofbirth, lName, name, gender, numberoflessons);
    }

    @Override
    public String toString() {
        return "Bekbolot{" +
                " works=" + Arrays.toString(works) +
                " studies=" + Arrays.toString(studies) +
                '}';
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public Work[] getWorks() {
        return works;
    }

    public void setWorks(Work[] works) {
        this.works = works;
    }

    public Study[] getStudies() {
        return studies;
    }

    public void setStudies(Study[] studies) {
        this.studies = studies;
    }
}
