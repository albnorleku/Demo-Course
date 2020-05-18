package com.javaCourse.h2Database.repository;

import com.javaCourse.h2Database.model.CourseUsers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

    /*public CourseUsers getUsersById(int id) {

    }*/

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
}
