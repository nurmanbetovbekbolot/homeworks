package com.company;

public class Group {
    Student[] students;
    Course course;
    String dateofstart;
    double duration;

    public Group(Student[] students, Course courses, String dateofstart, double duration) {
        this.students = students;
        this.course = courses;
        this.dateofstart = dateofstart;
        this.duration = duration;
    }
    void printInfo(){
        for (int i = 0; i <students.length ; i++) {
            students[i].printInfoByStundent();
        }
        course.printInfoByCourse();
        System.out.println(dateofstart);
        System.out.println(duration);
    }

    public Student[] getStudents() {
        return students;
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
