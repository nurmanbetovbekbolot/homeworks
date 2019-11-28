package com.company;

public class Person{
    String dateofbirth;
    String placeofbirth;
    String lName;
    String name;
    String gender;
    int numberoflessons;

    public Person(String dateofbirth, String placeofbirth, String lName, String name, String gender, int numberoflessons) {
        this.dateofbirth = dateofbirth;
        this.placeofbirth = placeofbirth;
        this.lName = lName;
        this.name = name;
        this.gender = gender;
        this.numberoflessons = numberoflessons;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getPlaceofbirth() {
        return placeofbirth;
    }

    public void setPlaceofbirth(String placeofbirth) {
        this.placeofbirth = placeofbirth;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getNumberoflessons() {
        return numberoflessons;
    }

    public void setNumberoflessons(int numberoflessons) {
        this.numberoflessons = numberoflessons;
    }
}
