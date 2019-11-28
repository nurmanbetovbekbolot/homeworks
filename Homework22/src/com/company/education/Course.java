package com.company.education;

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

    public Course() {
    }

    @Override
    public String toString() {
        return  name;
    }

    private void setName(String n) {
        name = n;
    }

    private void setDate(String d) {
        date = d;
    }

    private  void setId(int i) {
        id = i;
    }

    private void setFlname(String Fl) {
        Flname = Fl;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public int getId() {
        return id;
    }

    public String getFlname() {
        return Flname;
    }
}
