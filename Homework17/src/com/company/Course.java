package com.company;

public class Course {

    String name;
    String date;
    int id;
    String Flname;

    public Course(String name, String date, int id, String flname) {
        this.name = name;
        this.date = date;
        this.id = id;
        Flname = flname;
    }
    public void printInfoByCourse(){
        System.out.printf("%s %s %s %s",name,date,id,Flname);
        System.out.println();
    }
    public Course() {
    }

    void setName(String n) {
        name = n;
    }

    void setDate(String d) {
        date = d;
    }

    void setId(int i) {
        id = i;
    }

    void setFlname(String Fl) {
        Flname = Fl;
    }

    String getName() {
        return name;
    }

    String getDate() {
        return date;
    }


    int getId() {
        return id;
    }

    String getFlname() {
        return Flname;
    }
}
