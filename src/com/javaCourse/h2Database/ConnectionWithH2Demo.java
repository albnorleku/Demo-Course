package com.javaCourse.h2Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionWithH2Demo {
    private static final String JDBC_DRIVER = "org.h2.Driver";
    private static final String DB_URL = "jdbc:h2:tcp://localhost/~/courseDemo";
    private static final String USER = "sa";
    private static final String PASSWORD = "";

    public static void main(String [] args) {
        Connection connection = null;
        Statement statement = null;

        try {
            Class.forName(JDBC_DRIVER);
            System.out.println("Connecting with database...");

            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            statement = connection.createStatement();
            System.out.println("Successfully connected with database...");

            statement.execute(getCreateUserTable());

            //statement.execute("ALTER TABLE course_users ADD COLUMN email VARCHAR(255);");
            /*statement.execute("INSERT INTO course_users (first_name, last_name, age, email) " +
                    "VALUES ('Filan', 'Fisteku', '34', 'filan@email.com')");*/

            System.out.println("Created table successfully!");


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    private static String getCreateUserTable() {
        String createTable = "CREATE TABLE course_users " +
                "(id INTEGER auto_increment not NULL, " +
                " first_name VARCHAR(255), " +
                " last_name VARCHAR(255), " +
                " age INTEGER, " +
                " PRIMARY KEY ( id ))";
        return createTable;
    }
}
