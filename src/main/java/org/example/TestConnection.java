//package org.example;
//
//import java.lang.invoke.TypeDescriptor;
//import java.sql.Connection;
//import java.sql.Statement;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.*;
//
//public class TestConnection {
//
//
//    public static final String UserName = "root";
//    public static final String Password = "root";
//    public static final String URL = "jdbc:postgresql://localhost:5432/postgres";
//    public static Statement statment;
//    public static Connection connection;
//    static {
//        try {
//            connection = DriverManager.getConnection(URL, UserName, Password);
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//            throw new RuntimeException();
//        }
//    }
//    static {
//        try {
//            statment = connection.createStatement();
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//            throw new RuntimeException();
//        }
//    }
//
//}
