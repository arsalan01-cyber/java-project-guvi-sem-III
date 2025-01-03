package com.example.servlet;

import com.example.model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Creating a list of users
        List<User> users = new ArrayList<>();
        users.add(new User("john_doe", "john@example.com"));
        users.add(new User("jane_doe", "jane@example.com"));
        users.add(new User("mark_smith", "mark@example.com"));
        
        // Set users list as request attribute
        request.setAttribute("users", users);

        // Forward to user-list.jsp
        request.getRequestDispatcher("/user-list.jsp").forward(request, response);
    }
}
