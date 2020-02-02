package com.company;

public class Main {


    public static void main(String[] args)  {
        DB db = new DB();
        User user = new User("bakayks", "bakayks@gmail.com", "123" );
        User user2 = new User("bakayks2", "bakayk2@gmail.com", "1233" );
        User user3 = new User("bakayks3", "bakayk2@gmail.com", "1234" );
        try {
            db.register(user3);
        } catch (MyException e) {
            e.getMessage();
        }
        db.authorize("bakayks2","33211" );
    }
}