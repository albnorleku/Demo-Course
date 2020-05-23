package com.javaCourse.restEndpoint;

import com.javaCourse.h2Database.Service.CourseUsersService;
import com.javaCourse.h2Database.Service.CourseUsersServiceImpl;
import com.javaCourse.h2Database.model.CourseUsers;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.sql.SQLException;
import java.util.Optional;

public class RestApp {
    private static String readUserPath = "/api/read/user";
    private static String readAllUsers = "/api/read/allUsers";

    public static void main(String [] arg) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8001), 0);

        server.createContext(readUserPath, (exchange -> {
            CourseUsersService courseUsersService = new CourseUsersServiceImpl();
            try {
                int userId = getUserId(exchange.getRequestURI().getRawPath());

                Optional<CourseUsers> courseUsers = courseUsersService.getCourseUserById(userId);
                if ( courseUsers.isPresent() ) {
                    exchange.sendResponseHeaders(200, courseUsers.get().toString().getBytes().length);
                    OutputStream outputStream = exchange.getResponseBody();
                    outputStream.write(courseUsers.get().toString().getBytes());
                    outputStream.flush();
                } else {
                    String notFound = "User not Found!";
                    exchange.sendResponseHeaders(404, notFound.getBytes().length);
                    OutputStream outputStream = exchange.getResponseBody();
                    outputStream.write(notFound.getBytes());
                    outputStream.flush();
                }
            } catch (SQLException throwables) {
                System.out.println("test");
                throwables.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            exchange.close();
        }));
        server.setExecutor(null);
        server.start();
    }

    private static int getUserId(String path) {
        String id = path.substring(readUserPath.length()+1);
        return Integer.parseInt(id);
    }
}
