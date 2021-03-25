package com.kanhav.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test {
    static final String DB_URL = "jdbc:mysql://localhost:3306/world";

    static final String USERNAME = "root";
    static final String PASSWORD = "Root@1234";

    public static void main(String args[]) {
        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            System.out.println("Connected to database...");
        } catch (Exception e) {
            System.out.println("Error in connection");
            e.printStackTrace();
        }
    }
//Comment Test
}
