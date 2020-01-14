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
            System.out.println("Connected successfully");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }


    public void addCity(int i, City c) {
        String SQL = "INSERT INTO cities_3 (id,name) values(?,?)";
        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement(SQL)) {
            statement.setObject(1, i);
            statement.setObject(2, c.getName());
            statement.executeUpdate();
            System.out.println("Success");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<City> getCity() {
        List<City> cities = new ArrayList<>();
        String SQL = "SELECT * FROM cities_3 order by id asc";
        try (Connection connection = connect();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(SQL)) {
            while (resultSet.next()) {
                City city = new City();
                city.setId(resultSet.getInt("id"));
                city.setName(resultSet.getString("name"));
                cities.add(city);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return cities;
    }

    public void updateCities(City c) {
        String SQL = "UPDATE cities_3 SET id = ?, name = ? where id=?";
        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement(SQL)) {
            statement.setInt(1, c.getId());
            statement.setString(2, c.getName());
            statement.setInt(3, c.getId());
            statement.executeUpdate();
            System.out.println("Success");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}