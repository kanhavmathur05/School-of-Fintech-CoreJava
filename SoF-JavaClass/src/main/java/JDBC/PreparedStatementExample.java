package com.kanhav.jdbc;

import java.sql.*;

public class PreparedStatementExample {
    static final String DB_URL = "jdbc:mysql://localhost:3306/world";

    static final String USERNAME = "root";
    static final String PASSWORD = "Root@1234";

    public static void main(String args[]) throws SQLException {

        PreparedStatementExample preparedStatementExample = new PreparedStatementExample();
        preparedStatementExample.addCityInfo();

    }

    private void addCityInfo() throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            System.out.println("Connected to database...");

            preparedStatement = connection.prepareStatement("insert into Emp(id,name) VALUES (?,?)");
            preparedStatement.setInt(1, 2);
            preparedStatement.setString(2, "Shyam");
            int i = preparedStatement.executeUpdate();

            System.out.println(i + " records inserted");
            connection.close();
        } catch (Exception e) {
            System.out.println("Error in connection");
            e.printStackTrace();
        }
    }
}
