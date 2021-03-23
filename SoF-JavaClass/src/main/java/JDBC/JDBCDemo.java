package com.kanhav.jdbc;

import java.sql.*;

public class JDBCDemo {
    static final String DB_URL = "jdbc:mysql://localhost:3306/world";

    static final String USERNAME = "root";
    static final String PASSWORD = "Root@1234";

    public static void main(String args[]) throws SQLException{

        JDBCDemo jdbcDemo=new JDBCDemo();
        jdbcDemo.getCityInformation();

    }

    private void getCityInformation() throws SQLException {
        Connection connection = null;
        Statement statement=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            System.out.println("Connected to database...");

            String sql="select id,city_name from cities";
            statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery(sql);

            while(resultSet.next()) {
                System.out.println("ID: "+resultSet.getString("id")+" City: "+resultSet.getString("city_name")+" ");
            }

            connection.close();
        } catch (Exception e) {
            System.out.println("Error in connection");
            e.printStackTrace();
        }
    }
}
