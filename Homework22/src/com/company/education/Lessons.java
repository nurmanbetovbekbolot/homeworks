package com.company.education;

import com.company.education.Course;
import com.company.person.Student;
import com.company.person.Teacher;

import java.util.Arrays;

public class Lessons {
    String dateoflesson;
    Student[] attendingstundents;
    Course course;
    String starttime;
    Teacher teacher;
    boolean hasHw;
    boolean wasExam;

    public Lessons(String dateoflesson, Student[] attendingstundents, Course course, String starttime, Teacher teacher, boolean hasHw, boolean wasExam) {
        this.dateoflesson = dateoflesson;
        this.attendingstundents = attendingstundents;
        this.course = course;
        this.starttime = starttime;
        this.teacher = teacher;
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

    public Teacher getTeacher() {
        return teacher;
    }

    private void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getDateoflesson() {
        return dateoflesson;
    }

    private void setDateoflesson(String dateoflesson) {
        this.dateoflesson = dateoflesson;
    }

    public Student[] getAttendingstundents() {
        return attendingstundents;
    }

    private void setAttendingstundents(Student[] attendingstundents) {
        this.attendingstundents = attendingstundents;
    }

    public Course getCourse() {
        return course;
    }

    private void setCourse(Course course) {
        this.course = course;
    }

    public String getStarttime() {
        return starttime;
    }

    private void setStarttime(String starttime) {
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
