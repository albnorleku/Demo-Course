package com.javaCourse.h2Database.Service;

import com.javaCourse.h2Database.exception.CourseUserException;
import com.javaCourse.h2Database.model.CourseUsers;
import com.javaCourse.h2Database.repository.CourseUsersRepository;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

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

    @Override
    public List<CourseUsers> getAllUsersYoungerThenProvidedAge(int age) throws SQLException, ClassNotFoundException, CourseUserException {
        if (age > 0) {
            throw new CourseUserException("Age can not be negative!");
        }
        return courseUsersRepository.readAllUsersYoungerThen(age);
    }

    @Override
    public Optional<CourseUsers> getCourseUserById(int courseUserId) throws SQLException, ClassNotFoundException {
        if (courseUserId <= 0) {
            throw new CourseUserException("Id is invalid!");
        }
        return courseUsersRepository.getUsersById(courseUserId);
    }

    @Override
    public Optional<CourseUsers> updateCourseUsers(CourseUsers courseUsers) throws SQLException, ClassNotFoundException {
        if (courseUsers == null) {
            throw new CourseUserException("Course user is not initialized!");
        }
        return courseUsersRepository.updateUsers(courseUsers);
    }

    public void deleteUserById(int id) throws SQLException, ClassNotFoundException {
        this.courseUsersRepository.deleteUserById(id);
    }
}
