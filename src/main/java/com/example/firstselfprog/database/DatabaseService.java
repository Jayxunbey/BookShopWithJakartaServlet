package com.example.firstselfprog.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseService {

    private static Connection connection;

    static {
        try {
            connection = DataBaseUtil.getConnection();
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean addUser(String userName, String email, String password)  {


        System.out.println("\n\n In USER");
        System.out.println("userName = " + userName);
        System.out.println("email = " + email);
        System.out.println("password = " + password);

        Statement statement = null;
        try {
            statement = connection.createStatement();



            String sql = String.format("INSERT INTO users(username, email, password)"+
                    "VALUES ('%s','%s','%s')",userName,email,password) ;
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println("e = " + e);
            return false;
        }

        return true;

    }


    public static boolean checkUser(String email, String password) {

        try {
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(String.format("select * from users where email = '%s' and password = '%s'", email, password));

            boolean next = resultSet.next();
            System.out.println("resultSet.next() = " + next);

            if (next){
                return true;
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return false;
    }

    public static String getUserName(String email, String password){

        try {
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(String.format("select * from users where email = '%s' and password = '%s'", email, password));

            resultSet.next();
            return resultSet.getString(2);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}

