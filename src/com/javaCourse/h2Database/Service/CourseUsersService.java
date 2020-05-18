package com.javaCourse.h2Database.Service;

import com.javaCourse.h2Database.exception.CourseUserException;
import com.javaCourse.h2Database.model.CourseUsers;

import java.sql.SQLException;
import java.util.List;

public interface CourseUsersService {
    CourseUsers createCourseUsers(CourseUsers courseUsers) throws CourseUserException, SQLException, ClassNotFoundException;

    List<CourseUsers> getAllUsers() throws SQLException, ClassNotFoundException;
}
