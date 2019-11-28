package com.company;

import java.util.Arrays;

public class Lessons {
    String dateoflesson;
    Student[] attendingstundents;
    Course course;
    String starttime;
    boolean hasHw;
    boolean wasExam;

    public Lessons(String dateoflesson, Student[] attendingstundents, Course course, String starttime, boolean hasHw, boolean wasExam) {
        this.dateoflesson = dateoflesson;
        this.attendingstundents = attendingstundents;
        this.course = course;
        this.starttime = starttime;
        this.hasHw = hasHw;
        this.wasExam = wasExam;
    }
    public Lessons(){

    }

    @Override
    public String toString() {
        return "Lessons{" +
                "dateoflesson='" + dateoflesson + '\'' +
                ", attendingstundents=" + Arrays.toString(attendingstundents) +
                ", course=" + course +
                ", starttime='" + starttime + '\'' +
                ", hasHw=" + hasHw +
                ", wasExam=" + wasExam +
                '}';
    }

    public String getDateoflesson() {
        return dateoflesson;
    }

    public void setDateoflesson(String dateoflesson) {
        this.dateoflesson = dateoflesson;
    }

    public Student[] getAttendingstundents() {
        return attendingstundents;
    }

    public void setAttendingstundents(Student[] attendingstundents) {
        this.attendingstundents = attendingstundents;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public boolean isHasHw() {
        return hasHw;
    }

    public void setHasHw(boolean hasHw) {
        this.hasHw = hasHw;
    }

    public boolean isWasExam() {
        return wasExam;
    }

    public void setWasExam(boolean wasExam) {
        this.wasExam = wasExam;
    }
}
