package com.quizgame.servlet;

import com.quizgame.model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ProfileServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        
        // If user is not logged in, redirect to login page
        if (session == null || session.getAttribute("user") == null) {
            response.sendRedirect("/quizgame/login");
            return;
        }
        
        // Get the user from the session
        User user = (User) session.getAttribute("user");
        
        // Display user profile
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Welcome, " + user.getUsername() + "</h2>");
        out.println("<p>Email: " + user.getEmail() + "</p>");
        out.println("<a href='/quizgame/logout'>Logout</a>");
        out.println("</body></html>");
    }
}
