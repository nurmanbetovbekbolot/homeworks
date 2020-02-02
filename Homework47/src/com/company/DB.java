package com.company;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class DB {
    private final String url = "jdbc:postgresql://localhost:5432/";
    private final String user = "postgres";
    private final String password = "123";

    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            //    System.out.println("Connected");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void register(User user) throws MyException {

        String SQL = "Insert into users(login, email,password, date_registr) values (?,?,?, now())";
        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(SQL)) {
            stmt.setString(1, user.getLogin());
            stmt.setString(2, user.getMail());
            stmt.setString(3, Encrypt(user));
            stmt.executeUpdate();
            System.out.println("Success");
        } catch (Exception e) {
            throw new MyException("Такой аккаунт уже существует! ");
        }
    }


    public void authorize(String login, String password) {
        String SQL = "Insert into Userlogs(user_name, login_time, success) values (?, now() ,?)";
        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(SQL)) {

            stmt.setString(1, login);
            if (getUserByLogin(login) != null) {
                if (Encrypt(password).equals(getUserByLogin(login).getPassword())) {
                    stmt.setString(2, Success.OK.toString());
                    stmt.executeUpdate();
                    System.out.println("Вход успешен");
                    System.out.println("Привет, "+login);
                } else {
                    stmt.setString(2, Success.FAIL.toString());
                    stmt.executeUpdate();
                    System.out.println("Вход не успешен, введите правильный пароль");
                }
            } else {
                System.out.println("Неправильный логин");

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public User getUserByLogin(String login) {
        String SQL = "select * from users where login = ?";
        try (Connection conn = connect();
             PreparedStatement statement = conn.prepareStatement(SQL)) {
            statement.setString(1, login);
            try (ResultSet rs = statement.executeQuery()) {
                if (rs.next()) {
                    User user = new User();
                    user.setId(rs.getInt("ID"));
                    user.setLogin(rs.getString("LOGIN"));
                    user.setMail(rs.getString("EMAIL"));
                    user.setPassword(rs.getString("PASSWORD"));
                    user.setDate_registr(rs.getDate("date_registr"));
                    return user;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public List<UserLogs> getLogs() {
        List<UserLogs> logs = new ArrayList<>();

        String SQL = "select * from UserLogs ";
        try (Connection conn = connect();
             Statement statement = conn.createStatement();
             ResultSet resultSet = statement.executeQuery(SQL)) {
            while (resultSet.next()) {
                UserLogs log = new UserLogs();
                log.setId(resultSet.getInt("id"));
                log.setUserName(resultSet.getString("user_name"));
                log.setLoginTime(resultSet.getDate("login_time"));
                log.setSuccess(Success.valueOf(resultSet.getString("success")));
                logs.add(log);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return logs;
    }


    public String Encrypt(User user) {
        String encrypted = "";
        for (int i = user.getPassword().length() - 1; i >= 0; i--) {
            encrypted += user.getPassword().charAt(i);
        }
        encrypted += encrypted.charAt(encrypted.length() - 1);
        return encrypted;
    }

    public String Encrypt(String password) {
        String encrypted = "";
        for (int i = password.length() - 1; i >= 0; i--) {
            encrypted += password.charAt(i);
        }
        encrypted += encrypted.charAt(encrypted.length() - 1);
        return encrypted;
    }
}

