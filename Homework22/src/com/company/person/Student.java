package com.company.person;

import com.company.education.Course;

public class Student extends Person {
    int grades;
    Course[] attendingcourse;
    int amountofexams;
    public Student(String dateofbirth, String placeofbirth, String lName, String name, String gender, int numberoflessons) {
        super(dateofbirth, placeofbirth, lName, name, gender, numberoflessons);
    }

    public Student(String dateofbirth, String placeofbirth, String lName, String name, String gender, int numberoflessons, int grades, Course[] attendingcourse, int amountofexams) {
        super(dateofbirth, placeofbirth, lName, name, gender, numberoflessons);
        this.grades = grades;
        this.attendingcourse = attendingcourse;
        this.amountofexams = amountofexams;
    }

    @Override
    public String toString() {
        return lName +
                " "+name;}

    public int getGrades() {
        return grades;
    }

    public void setGrades(int grades) {
        this.grades = grades;
    }

    public Course[] getAttendingcourse() {
        return attendingcourse;
    }

    public void setAttendingcourse(Course[] attendingcourse) {
        this.attendingcourse = attendingcourse;
    }

    public int getAmountofexams() {
        return amountofexams;
    }

    public void setAmountofexams(int amountofexams) {
        this.amountofexams = amountofexams;
    }
}
