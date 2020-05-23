package com.javaCourse.h2Database.repository;

import com.javaCourse.h2Database.dbConnection.DatabaseConnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseRepoImpl implements BaseRepo {
    private DatabaseConnection databaseConnection;

    public BaseRepoImpl() {
        databaseConnection = DatabaseConnection.initialize();
    }

    @Override
    public ResultSet read(String query) throws SQLException, ClassNotFoundException {
        return this.executeStatement(query);
    }

    @Override
    public void create(String query) throws SQLException, ClassNotFoundException {
        Statement statement = databaseConnection.getDbConnection().createStatement();
        statement.execute(query);
    }

    @Override
    public void update(String query) throws SQLException, ClassNotFoundException {
        Statement statement = databaseConnection.getDbConnection().createStatement();
        statement.execute(query);
    }

    @Override
    public void delete(String query) throws SQLException, ClassNotFoundException {
        this.executeStatement2(query);
    }

    public void deleteById(String tableName, int id) throws SQLException, ClassNotFoundException {
        String query = "DELETE FROM " + tableName + " WHERE id = " + id;
        this.executeStatement2(query);
    }

    private ResultSet executeStatement(String query) throws SQLException, ClassNotFoundException {
        Statement statement = databaseConnection.getDbConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        return resultSet;
    }

    private void executeStatement2(String query) throws SQLException, ClassNotFoundException {
        Statement statement = databaseConnection.getDbConnection().createStatement();
        statement.execute(query);
    }
}
