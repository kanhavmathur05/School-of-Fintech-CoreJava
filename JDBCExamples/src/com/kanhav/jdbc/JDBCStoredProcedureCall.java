package com.kanhav.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCStoredProcedureCall {
    static final String DB_URL = "jdbc:mysql://localhost:3306/world";

    static final String USERNAME = "root";
    static final String PASSWORD = "Root@1234";

    public static void main(String args[]) throws SQLException{

     JDBCStoredProcedureCall jdbcStoredProcedureCall=new JDBCStoredProcedureCall();
        jdbcStoredProcedureCall.callStoredProcedure();

    }

    private void callStoredProcedure() throws SQLException {
        Connection connection = null;
        Statement statement=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            System.out.println("Connected to database...");

//            String sql="call createEmployees()";
//            statement=connection.createStatement();
//            ResultSet resultSet=statement.executeQuery(sql);
//
//            System.out.println("Data Inserted");
            
            String sql2="call getAllEmployees()";
            statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery(sql2);
            while(resultSet.next()) {
                System.out.println("ID: "+resultSet.getString("id")+" Name: "+resultSet.getString("name")+" ");
            }

            connection.close();
        } catch (Exception e) {
            System.out.println("Error in connection");
            e.printStackTrace();
        }
    }
}
