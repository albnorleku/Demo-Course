package com.javaCourse.h2Database.Service;

import com.javaCourse.h2Database.exception.CourseUserException;
import com.javaCourse.h2Database.model.CourseUsers;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

/**
 * Course User Service Class.
 */
public interface CourseUsersService {
    /**
     * Create Course User.
     *
     * @param courseUsers {@link CourseUsers}
     * @return {@link CourseUsers} from db.
     * @throws CourseUserException
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    CourseUsers createCourseUsers(CourseUsers courseUsers) throws CourseUserException, SQLException, ClassNotFoundException;

    List<CourseUsers> getAllUsers() throws SQLException, ClassNotFoundException;

    List<CourseUsers> getAllUsersYoungerThenProvidedAge(int age) throws SQLException, ClassNotFoundException, CourseUserException;

    Optional<CourseUsers> getCourseUserById(int courseUserId) throws SQLException, ClassNotFoundException, CourseUserException;

    Optional<CourseUsers> updateCourseUsers(CourseUsers courseUsers) throws SQLException, ClassNotFoundException;

    void deleteUserById(int id) throws SQLException, ClassNotFoundException;
}
