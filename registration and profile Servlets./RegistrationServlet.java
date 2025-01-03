package com.quizgame.servlet;

import com.quizgame.model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class RegistrationServlet extends HttpServlet {

    // Simulating an in-memory database (Map) to store users
    private static Map<String, User> userDatabase = new HashMap<>();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");

        // Check if the user already exists
        if (userDatabase.containsKey(username)) {
            response.getWriter().println("<h3>Username already exists. Please choose another one.</h3>");
            return;
        }

        // Create a new user and store in the database
        User newUser = new User(username, password, email);
        userDatabase.put(username, newUser);

        response.getWriter().println("<h3>Registration successful! You can now <a href='/quizgame/login'>log in</a>.</h3>");
    }
}
