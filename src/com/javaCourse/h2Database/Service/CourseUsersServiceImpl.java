package com.javaCourse.h2Database.Service;

import com.javaCourse.h2Database.exception.CourseUserException;
import com.javaCourse.h2Database.model.CourseUsers;
import com.javaCourse.h2Database.repository.CourseUsersRepository;

import java.sql.SQLException;
import java.util.List;

public class CourseUsersServiceImpl implements CourseUsersService {
    private CourseUsersRepository courseUsersRepository;

    public CourseUsersServiceImpl() {
        courseUsersRepository = new CourseUsersRepository();
    }

    @Override
    public CourseUsers createCourseUsers(CourseUsers courseUsers) throws CourseUserException, SQLException, ClassNotFoundException {
        if (courseUsers == null) {
            throw new CourseUserException("Course user can't be null");
        }
        return courseUsersRepository.createCourseUsers(courseUsers);
    }

    @Override
    public List<CourseUsers> getAllUsers() throws SQLException, ClassNotFoundException {
        return courseUsersRepository.readAllUsers();
    }
}
