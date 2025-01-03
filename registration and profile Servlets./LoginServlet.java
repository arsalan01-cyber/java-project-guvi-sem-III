package com.quizgame.servlet;

import com.quizgame.model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.Map;

public class LoginServlet extends HttpServlet {

    // Simulating the user database
    private static Map<String, User> userDatabase = RegistrationServlet.userDatabase;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Check if the user exists and password matches
        User user = userDatabase.get(username);
        if (user != null && user.getPassword().equals(password)) {
            // Create session and set user attributes
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            response.sendRedirect("/quizgame/profile");
        } else {
            response.getWriter().println("<h3>Invalid username or password. Please try again.</h3>");
        }
    }
}
