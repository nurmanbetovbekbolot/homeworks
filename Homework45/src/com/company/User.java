package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
    private Integer id;
    private String login;
    private String mail;
    private String password;
    private Date date_registr;

    public User() {
    }


    public User(String login, String mail, String password) {
        this.login = login;
        this.mail = mail;
        this.password = password;
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDate_registr() {
        return date_registr;
    }

    public void setDate_registr(Date date_registr) {
        this.date_registr = date_registr;
    }

    @Override
    public String toString() {
        return id + " " + login + " " + mail + " " + password + " " + date_registr;
    }
}
