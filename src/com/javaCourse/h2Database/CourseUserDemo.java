package com.javaCourse.h2Database;

import com.javaCourse.h2Database.Service.CourseUsersService;
import com.javaCourse.h2Database.Service.CourseUsersServiceImpl;
import com.javaCourse.h2Database.exception.CourseUserException;
import com.javaCourse.h2Database.model.CourseUsers;

import java.sql.SQLException;
import java.util.List;

public class CourseUserDemo {

    public static void main(String [] args) {
        CourseUsersService courseUsersService = new CourseUsersServiceImpl();

        CourseUsers courseUsers = new CourseUsers("Jack2", "Smith2", 50, "jac@smith.com");

        try {
            //CourseUsers courseUserFromDB = courseUsersService.createCourseUsers(courseUsers);

            //System.out.println(courseUserFromDB.toString());

            List<CourseUsers> courseUsersList = courseUsersService.getAllUsers();

            for (CourseUsers users : courseUsersList) {
                System.out.println(users.toString());
            }
        /*} catch (CourseUserException e) {
            e.printStackTrace();*/
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
