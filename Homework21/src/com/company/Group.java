package com.company;

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

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getDateofstart() {
        return dateofstart;
    }

    public void setDateofstart(String dateofstart) {
        this.dateofstart = dateofstart;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
}
