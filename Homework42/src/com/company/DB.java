package com.company;

import java.sql.*;

public class DB {
    private final String url = "jdbc:postgresql://localhost:5432/";
    private final String user = "postgres";
    private final String password = "123";

    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            //  System.out.println("Connected successfully");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public int getStudentsCount() {
        String SQL = "SELECT count(*) FROM students_2";
        int count = 0;
        try (
                Connection conn = connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(SQL)) {
            rs.next();
            count = rs.getInt(1);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return count;
    }

    public int getStudentsName(String letter) {
        int count = 0;
        String SQL = "SELECT count(*) FROM students_2 WHERE name LIKE '%" + letter + "%'";

        try (
                Connection conn = connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(SQL)) {
            rs.next();
            count = rs.getInt(1);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return count;
    }

    public void getTrainersSalary() {
        String SQL = "SELECT coaches.first_name,sport_types.salary FROM coaches join sport_types on coaches.sport_types=sport_types.id";
        System.out.println("Тренер  Зарплата");
        try (
                Connection conn = connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
                System.out.println(rs.getString("first_name")
                        + "\t" + rs.getString("salary"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public int getTotalSalary() {
        int count = 0;
        String SQL = "SELECT sum(sport_types.salary) FROM coaches join sport_types on coaches.sport_types = sport_types.id";
        try (
                Connection conn = connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(SQL)) {

            while (rs.next()) {
                count = rs.getInt(1);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return count;
    }

    public void checkTrainersName() {

        String SQL = "SELECT coaches.last_name FROM coaches ";
        try (
                Connection conn = connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
                if (rs.getString("last_name").length() >= 3)
                    System.out.println("Тренер " + rs.getString("last_name") + " Молодец");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void getStudentsInGroups() {
       String SQL="select groups_2.id,count(groups_2.id),groups_2.\"name\" from groups_2  \n" +
               "join students_2 ON groups_2.id=students_2.group_id \n" +
               "group by groups_2.id,students_2.group_id\n" +
               "having  groups_2.id=students_2.group_id;";
        try (
                Connection conn = connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
                System.out.println("В группе "+rs.getString("name")
                        + "\t" + rs.getString("count")+" студентов");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }



    public void getGroups() {
        String SQL = "SELECT id,name FROM groups_2 ";
        try (
                Connection conn = connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
                System.out.println(rs.getString("id")
                        + "\t" + rs.getString("name"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

//    public void addPerson(String name, int age) {
//        String SQL = "INSERT INTO people(name,age) values(?,?) ";
//        try (Connection conn = connect()){
//             PreparedStatement stmt = conn.prepareStatement(SQL);
//             stmt.setString(1, name);
//             stmt.setInt(2, age);
//             stmt.executeUpdate();
//            System.out.println("Success");
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        }
//    }


}