package com.javaCourse.h2Database.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface BaseRepo {
     ResultSet read(String query) throws SQLException, ClassNotFoundException;

     void create(String query) throws SQLException, ClassNotFoundException;

     void update(String query) throws SQLException, ClassNotFoundException;

     void delete(String query) throws SQLException, ClassNotFoundException;

     void deleteById(String tableName, int id) throws SQLException, ClassNotFoundException;
}
