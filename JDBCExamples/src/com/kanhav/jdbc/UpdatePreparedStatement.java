package com.kanhav.jdbc;

import java.sql.*;

public class UpdatePreparedStatement {
    static final String DB_URL = "jdbc:mysql://localhost:3306/world";

    static final String USERNAME = "root";
    static final String PASSWORD = "Root@1234";

    public static void main(String args[]) throws SQLException {

        UpdatePreparedStatement updatePreparedStatement=new UpdatePreparedStatement();
        updatePreparedStatement.updateCity();

    }

    private void updateCity() throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            System.out.println("Connected to database...");

            preparedStatement = connection.prepareStatement("update Emp set name=? where id=?");
            preparedStatement.setString(1, "Ravi");
            preparedStatement.setInt(2,1);
            int i = preparedStatement.executeUpdate();

            System.out.println(i + " records updated");

            preparedStatement=connection.prepareStatement("select * from Emp");

            ResultSet rs=preparedStatement.executeQuery();

            while(rs.next()) {
                System.out.println("ID: "+rs.getString("id")+" : "+rs.getString("name"));
            }


            connection.close();
        } catch (Exception e) {
            System.out.println("Error in connection");
            e.printStackTrace();
        }
    }
}
