package com.example.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/etudiants_db";
    private static final String USER = "root"; // remplacez par votre nom d'utilisateur MySQL
    private static final String PASSWORD = ""; // remplacez par votre mot de passe MySQL

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // pour les versions récentes de MySQL
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
