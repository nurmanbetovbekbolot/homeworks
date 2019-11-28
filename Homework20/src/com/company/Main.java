package com.company;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("24/04/1990", "Asanov", "Uson", "m", 29);
        Student student2 = new Student("13/05/1995", "Talantov", "Aktan", "m", 24);
        Student student3 = new Student("22/11//1990", "Toktogulova", "Asel", "f", 29);
        Student student4 = new Student();
        Course course1 = new Course("Java", "30/10/2019", 1, "Serikov Askat");
        Course course2 = new Course("Python", "01/01/2020", 2, "Serikov Azamat");
        Course course3 = new Course();
        Student[] students = {student1, student2, student3, student4};
        Student[] students2 = { student2, student3, student4};
        Group group1 = new Group(students, course1, "03/11/2019", 3.5);
        Group group2 = new Group(students, course3, "03/11/2019", 9);
        student4.setlName("Akyl uulu");
        student4.setName("Eles");
        student4.setDateofbirth("13/05/2000");
        student4.setGender("m");
        student4.setAge(19);
        course3.setName("Front-End");
        course3.setDate("11/11/2019");
        course3.setId(3);
        course3.setFlname("Akynov Azat");
        group1.setDuration(9);
        group1.setDateofstart("17/09/2019");
        Lessons lesson = new Lessons("09/09/2019", students, course1, "12:00", true, true);
        Lessons lesson2 = new Lessons("11/09/2019", students2, course2, "19:00", false, true);
        System.out.println(student1);
        System.out.println(course1);
        System.out.println(group1);
    }
}
