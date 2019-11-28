package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Student student1=new Student("24/04/1990","Asanov","Uson","m",29);
        Student student2=new Student("13/05/1995","Talantov","Aktan","m",24);
        Student student3=new Student("22/11//1990","Toktogulova","Asel","f",29);
        Student student4=new Student();
       Course course1=new Course("Java","30/10/2019",1,"Serikov Askat");
        Course course2=new Course("Python","01/01/2020",2,"Serikov Azamat");
        Course course3= new Course();
        Student[]students={student1,student2,student3, student4};
        Group group = new Group(students,course1,"03/11/2019",3.5);
        student4.setlName("Akyl uulu");
        student4.setName("Eles");
        student4.setDateofbirth("13/05/2000");
        student4.setGender("m");
        student4.setAge(19);
        course3.setName("Front-End");
        course3.setDate("11/11/2019");
        course3.setId(3);
        course3.setFlname("Akynov Azat");
        group.setDuration(9);
        group.setDateofstart("17/09/2019");

        printStudent(student1);
        printStudent(student2);
        printStudent(student3);
        printStudent(student4);
        printCourse(course1);
        printCourse(course2);
        printCourse(course3);
        group.printInfo();

      }
    static void printStudent(Student s){
		System.out.println(s.getlName());
		System.out.println(s.getName());
		System.out.println(s.getDateofbirth());
		System.out.println(s.getGender());
		System.out.println(s.getAge());
	}
    static void printCourse(Course s){
        System.out.println(s.getName());
        System.out.println(s.getDate());
        System.out.println(s.getId());
        System.out.println(s.getFlname());
    }
}
