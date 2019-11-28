package com.company.education;

import com.company.education.Course;
import com.company.person.Student;
import com.company.person.Teacher;

public class Group {
    Student[] students;
    Course course;
    String dateofstart;
    Teacher teacher;
    double duration;

    public Group(Student[] students, Course course, String dateofstart, Teacher teacher, double duration) {
        this.students = students;
        this.course = course;
        this.dateofstart = dateofstart;
        this.teacher = teacher;
        this.duration = duration;
    }

    public Student[] getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return  course.getName();

    }

    public Teacher getTeacher() {
        return teacher;
    }

    private void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    private void setStudents(Student[] students) {
        this.students = students;
    }

    public Course getCourse() {
        return course;
    }

    private void setCourse(Course course) {
        this.course = course;
    }

    public String getDateofstart() {
        return dateofstart;
    }

    private void setDateofstart(String dateofstart) {
        this.dateofstart = dateofstart;
    }

    public double getDuration() {
        return duration;
    }

    private void setDuration(double duration) {
        this.duration = duration;
    }
}
