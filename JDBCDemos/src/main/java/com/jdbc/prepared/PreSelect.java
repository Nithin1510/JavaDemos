package com.jdbc.prepared;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class PreSelect {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String username = "root";
        String password = "root";

        String sql = "SELECT * FROM cab;";
        try (Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
             Scanner sc = new Scanner(System.in);){

            ResultSet resultSet = preparedStatement.executeQuery(sql);

            System.out.println("cabNumber\tdropLoc\tpickupLoc\tpickupDate\t pickupTime\tdriverName");

            while (resultSet.next()){
                int cabNumber = resultSet.getInt("cab_number");
                String dropLoc = resultSet.getString("drop_loc");
                String pickupLoc = resultSet.getString("pickup_loc");
                LocalDate pickupDate = LocalDate.parse(resultSet.getDate("pickup_date").toString());
                Time time = resultSet.getTime("pickup_time");
                LocalTime pickupTime = LocalTime.parse(time.toString());
                String driverName = resultSet.getString("driver_name");
                System.out.println(cabNumber+"\t"+dropLoc+"\t"+pickupLoc+"\t"+pickupDate+"\t"+pickupTime+"\t"+driverName);
            }
            preparedStatement.execute();
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
