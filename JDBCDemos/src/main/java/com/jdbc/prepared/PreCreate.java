package com.jdbc.prepared;

import java.sql.*;

public class PreCreate {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String username = "root";
        String password = "root";

        String sql = "create table cab(cab_number int primary key, drop_loc varchar(20), pickup_loc varchar(20), pickup_date date, pickup_time time, driver_name varchar(20))";
        try (Connection connection = DriverManager.getConnection(url, username, password);
                PreparedStatement statement = connection.prepareStatement(sql);){
            boolean result = statement.execute();
            System.out.println("Table created "+ result);
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
