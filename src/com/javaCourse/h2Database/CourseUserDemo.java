package com.javaCourse.h2Database;

import com.javaCourse.h2Database.Service.CourseUsersService;
import com.javaCourse.h2Database.Service.CourseUsersServiceImpl;
import com.javaCourse.h2Database.exception.CourseUserException;
import com.javaCourse.h2Database.model.CourseUsers;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class CourseUserDemo {

    public static void main(String [] args) {
        CourseUsersService courseUsersService = new CourseUsersServiceImpl();

        //CourseUsers courseUsers = new CourseUsers("Jack2", "Smith2", 50, "jac@smith.com");

        try {
            //CourseUsers courseUserFromDB = courseUsersService.createCourseUsers(courseUsers);

            //System.out.println(courseUserFromDB.toString());

            //List<CourseUsers> courseUsersList = courseUsersService.getAllUsers();

            //List<CourseUsers> courseUsersYoungerThen28 = courseUsersService.getAllUsersYoungerThenProvidedAge(28);

            /*for (CourseUsers users : courseUsersYoungerThen28) {
                System.out.println(users.toString());
            }*/

            //Update user
            /*Optional<CourseUsers> opCourseUser = courseUsersService.getCourseUserById(1);
            opCourseUser.ifPresent(user -> System.out.println(user));

            if(opCourseUser.isPresent()) {
                CourseUsers userToUpdate = opCourseUser.get();
                userToUpdate.setAge(25);
                opCourseUser = courseUsersService.updateCourseUsers(userToUpdate);

                opCourseUser.ifPresent(user -> System.out.println(user));
            }*/
            courseUsersService.deleteUserById(5);

        } catch (CourseUserException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
