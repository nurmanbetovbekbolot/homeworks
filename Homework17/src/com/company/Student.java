package com.company;

public class Student {
    String dateofbirth;
    String lName;
    String name;
    String gender;
    int age;

    public Student(String dateofbirth, String lName, String name, String gender, int age) {
        this.dateofbirth = dateofbirth;
        this.lName = lName;
        this.name = name;
        this.gender = gender;
        if (age <= 0) return;
        else
            this.age = age;
    }

    public Student() {

    }
    public void printInfoByStundent(){
        System.out.printf("%s %s %s %s %s",dateofbirth,lName,name,gender,age);
        System.out.println();
    }

    void setDateofbirth(String dateof) {
        dateofbirth = dateof;
    }

    void setlName(String lN) {
        lName = lN;
    }

    void setGender(String g) {
        gender = g;
    }

    void setAge(int a) {
        if (a <= 0) return;
        else
            age = a;
    }

    void setName(String n) {
        name = n;
    }

    String getDateofbirth() {
        return dateofbirth;
    }

    String getlName() {
        return lName;
    }

    String getName() {
        return name;
    }

    String getGender() {
        return gender;
    }

    int getAge() {
        return age;
    }


}
