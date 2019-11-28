package com.company;

import java.util.Arrays;

public class Teacher extends Person {
    int salary;
    String position;
    Course[] teachingcourse;
    public Teacher(String dateofbirth, String placeofbirth, String lName, String name, String gender, int numberoflessons) {
        super(dateofbirth, placeofbirth, lName, name, gender, numberoflessons);
    }

    public Teacher(String dateofbirth, String placeofbirth, String lName, String name, String gender, int numberoflessons, int salary, String position, Course[] teachingcourse) {
        super(dateofbirth, placeofbirth, lName, name, gender, numberoflessons);
        this.salary = salary;
        this.position = position;
        this.teachingcourse = teachingcourse;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "salary=" + salary +
                ", position='" + position + '\'' +
                ", teachingcourse=" + Arrays.toString(teachingcourse) +
                ", dateofbirth='" + dateofbirth + '\'' +
                ", placeofbirth='" + placeofbirth + '\'' +
                ", lName='" + lName + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", numberoflessons=" + numberoflessons +
                '}';
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Course[] getTeachingcourse() {
        return teachingcourse;
    }

    public void setTeachingcourse(Course[] teachingcourse) {
        this.teachingcourse = teachingcourse;
    }
}
