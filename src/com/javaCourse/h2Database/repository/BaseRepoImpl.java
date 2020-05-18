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
        this.executeStatement(query);
    }

    @Override
    public void delete(String query) throws SQLException, ClassNotFoundException {
        this.executeStatement(query);
    }

    private ResultSet executeStatement(String query) throws SQLException, ClassNotFoundException {
        Statement statement = databaseConnection.getDbConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        return resultSet;
    }
}
