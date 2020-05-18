package com.javaCourse.h2Database.dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static DatabaseConnection instance;
    private static final String JDBC_DRIVER = "org.h2.Driver";
    private static final String DB_URL = "jdbc:h2:tcp://localhost/~/courseDemo";
    private static final String USER = "sa";
    private static final String PASSWORD = "";

    private DatabaseConnection() {}

    public static DatabaseConnection initialize() {
        if (instance == null) {
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }

    public Connection getDbConnection() throws ClassNotFoundException, SQLException {
        Connection connection = null;
        Class.forName(JDBC_DRIVER);
        connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
        return connection;
    }
}
