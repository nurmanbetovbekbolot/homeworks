package com.company;


public class MyException extends Exception {
    public MyException(String msg) {
        System.out.println(msg);
    }
}
