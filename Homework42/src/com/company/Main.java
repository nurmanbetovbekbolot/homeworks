package com.company;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        DB db = new DB();
        System.out.println("ЗАДАЧА А:");
        db.getTrainersSalary();
        System.out.println("Итоговая зарплата всех тренеров " + db.getTotalSalary());
        db.checkTrainersName();
        System.out.println();
        System.out.println("ЗАДАЧА Б:");
        db.getStudentsInGroups();
        System.out.println("Спислк всех групп:");
        db.getGroups();
        System.out.println();

    }
}
