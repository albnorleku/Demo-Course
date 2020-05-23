package com.javaCourse.h2Database.repository;

import com.javaCourse.h2Database.model.CourseUsers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CourseUsersRepository extends BaseRepoImpl {
    public CourseUsersRepository() {
    }

    public CourseUsers createCourseUsers(CourseUsers courseUsers) throws SQLException, ClassNotFoundException {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("INSERT INTO course_users (first_name, last_name, age, email) VALUES ");
        stringBuilder.append("('").append(courseUsers.getFirstName()).append("'");
        stringBuilder.append(", '").append(courseUsers.getLastName()).append("'");
        stringBuilder.append(", '").append(courseUsers.getAge()).append("'");
        stringBuilder.append(", '").append(courseUsers.getEmail()).append("');");

        this.create(stringBuilder.toString());
        return getUsersByName(courseUsers.getFirstName());
    }

    public CourseUsers getUsersByName(String name) throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM course_users WHERE first_name = '" + name + "'";
        ResultSet rs = this.read(query);
        CourseUsers courseUsers = null;
        if(rs.next()) {
            courseUsers = mapFromResultSet(rs);
        }
        return courseUsers;
    }

    private CourseUsers mapFromResultSet(ResultSet rs) throws SQLException {
        return new CourseUsers(
                rs.getInt("id"),
                rs.getString("first_name"),
                rs.getString("last_name"),
                rs.getInt("age"),
                rs.getString("email"));
    }

    public List<CourseUsers> readAllUsers() throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM course_users";
        ResultSet resultSet = this.read(query);
        List<CourseUsers> courseUsers = new ArrayList<>();
        while(resultSet.next()) {
            CourseUsers cu = this.mapFromResultSet(resultSet);
            courseUsers.add(cu);
        }
        return courseUsers;
    }

    public List<CourseUsers> readAllUsersYoungerThen(int age) throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM course_users WHERE age < " + age;
        ResultSet resultSet = this.read(query);
        List<CourseUsers> courseUsers = new ArrayList<>();
        while (resultSet.next()) {
            CourseUsers cu = this.mapFromResultSet(resultSet);
            courseUsers.add(cu);
        }
        return courseUsers;
    }

    public Optional<CourseUsers> updateUsers(CourseUsers courseUsers) throws SQLException, ClassNotFoundException {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UPDATE course_users SET")
                .append(" first_name = '").append(courseUsers.getFirstName()).append("'")
                .append(", last_name = '").append(courseUsers.getLastName()).append("'")
                .append(", age = '").append(courseUsers.getAge()).append("'")
                .append(", email = '").append(courseUsers.getEmail()).append("'")
                .append(" WHERE id = ").append(courseUsers.getId());
        this.update(stringBuilder.toString());
        return getUsersById(courseUsers.getId());
    }

    public Optional<CourseUsers> getUsersById(int id) throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM course_users WHERE id =" + id;
        ResultSet rs = this.read(query);
        CourseUsers courseUsers;
        if (rs.next()) {
            courseUsers = this.mapFromResultSet(rs);
            return Optional.of(courseUsers);
        }
        return Optional.empty();
    }

    public void deleteUserById(int id) throws SQLException, ClassNotFoundException {
        this.deleteById("course_users", id);
    }
}
