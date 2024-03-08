package com.jdbc.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreUpdate {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String username = "root";
        String password = "root";

        String sql = "Update cab set driver_name=? where cab_number=?;";
        try (Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
             Scanner sc = new Scanner(System.in);){

            System.out.println("Enter driver name : ");
            String name = sc.next();
            System.out.println("Enter cab number : ");
            int number = sc.nextInt();

            preparedStatement.setString(1,name);
            preparedStatement.setInt(2,number);
            boolean result = preparedStatement.execute();
            System.out.println("updated "+ result);
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
