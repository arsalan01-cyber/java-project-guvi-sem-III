package com.quizgame.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class QuizServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Here you can display a question and choices from a database or list.
        // Just as an example:
        request.setAttribute("question", "What is 2 + 2?");
        request.setAttribute("choices", new String[]{"3", "4", "5", "6"});
        request.getRequestDispatcher("quiz.jsp").forward(request, response);
    }

    // Add logic to process quiz answers via POST request
}
