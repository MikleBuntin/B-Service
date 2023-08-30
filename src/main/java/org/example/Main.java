package org.example;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        System.out.println("Hello world!");
        Class.forName("org.postgresql.postgresql-42.6.0.jar");
        Connection connection = DriverManager.getConnection("jdbc:postgresql://hostname:port/dbname","username", "password");
        connection.close();
    }
}