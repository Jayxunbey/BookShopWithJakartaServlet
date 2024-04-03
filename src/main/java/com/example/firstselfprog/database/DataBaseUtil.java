package com.example.firstselfprog.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseUtil {
    private static final String URL = "jdbc:postgresql://localhost:5432/onlinebookstore";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "Jayxunbey2003";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);

    }

}
