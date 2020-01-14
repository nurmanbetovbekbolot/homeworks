package com.company;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws SQLException {
        DB db = new DB();
        Random random = new Random();

        String[] citiesName = {"Bishkek", "Osh", "Pekin", "Tashkent", "Nur-Sultan", "Almaty", "Tokyo"};
        List<City> listCity1 = new ArrayList<>();
        List<City> listCity2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listCity1.add(i, new City(i, citiesName[random.nextInt(7)]));
        }

        for (int i = 0; i < 8; i++) {
            listCity2.add(i, new City(i, citiesName[random.nextInt(7)]));
        }
        System.out.println(listCity1);
        System.out.println(listCity2);

        for (int i = 0; i < listCity1.size(); i++) {
            db.addCity(i, listCity1.get(i));
        }
        List<City> cityList = db.getCity();
        System.out.println(cityList);

        for (int i = 0; i < listCity2.size(); i++) {
            for (int j = 0; j < cityList.size(); j++) {
                if (cityList.get(j).getId() == listCity2.get(i).getId()) {
                    db.updateCities(listCity2.get(i));
                } else {
                    db.addCity(i + 1, listCity2.get(i));
                }
            }
        }
        System.out.println(db.getCity());
    }
}