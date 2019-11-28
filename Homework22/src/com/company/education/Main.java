package com.company.education;

import com.company.education.Course;
import com.company.education.Group;
import com.company.education.Lessons;
import com.company.person.Student;
import com.company.person.Teacher;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("24/04/1990","Bishkek" ,"Asanov", "Uson", "m", 2);
        Student student2 = new Student("13/05/1995", "Osh","Talantov", "Aktan", "m", 5);
        Student student3 = new Student("22/11//1990", "Batken","Toktogulova", "Asel", "f", 7);

        Course course1 = new Course("Java", "30/10/2019", 1, "Serikov Askat");
        Course course2 = new Course("Python", "01/01/2020", 2, "Serikov Azamat");
        Teacher teacher1= new Teacher("12/06/1980","Naryn","Azatov","Uzat","m",3);
        Teacher teacher2= new Teacher("02/08/1970","Bishkek","Baryshev","Bakyt","m",4);
        Course course3 = new Course();
        Student[] students = {student1, student2, student3};
        Student[] students2 = { student2, student3};
        Group group1 = new Group(students, course1, "03/11/2019", teacher2,7);
        Group group2 = new Group(students, course3, "03/11/2019", teacher1,9);
        Lessons lesson = new Lessons("09/09/2019", students, course1,"12:00",teacher1, true, true);
        Lessons lesson2 = new Lessons("11/09/2019", students2, course2, "19:00",teacher2, false, true);
        System.out.println(lesson);
    }
}
