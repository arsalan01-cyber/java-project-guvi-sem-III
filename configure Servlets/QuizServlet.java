package com.quizgame.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class QuizServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String action = request.getParameter("action");

        if (action != null && action.equals("submit")) {
            // Handle quiz submission logic (you can process user answers here)
            String answer = request.getParameter("answer");
            out.println("<h3>Your answer: " + answer + "</h3>");
        } else {
            // Display quiz question
            out.println("<html><body>");
            out.println("<form method='get' action='/quiz?action=submit'>");
            out.println("<h3>What is 2 + 2?</h3>");
            out.println("<input type='radio' name='answer' value='3'> 3 <br>");
            out.println("<input type='radio' name='answer' value='4'> 4 <br>");
            out.println("<input type='radio' name='answer' value='5'> 5 <br>");
            out.println("<input type='submit' value='Submit Answer'>");
            out.println("</form>");
            out.println("</body></html>");
        }
    }
}
