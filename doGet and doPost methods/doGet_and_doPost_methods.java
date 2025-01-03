package com.quizgame.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class QuizServlet extends HttpServlet {

    // Handles GET requests to display the quiz form
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Display the quiz form
        out.println("<html><body>");
        out.println("<h2>Simple Quiz Game</h2>");
        
        // Display the question and options
        out.println("<form method='post' action='/quizgame/quiz'>");
        out.println("<h3>What is 5 + 3?</h3>");
        out.println("<input type='radio' name='answer' value='6'> 6 <br>");
        out.println("<input type='radio' name='answer' value='7'> 7 <br>");
        out.println("<input type='radio' name='answer' value='8'> 8 <br>");
        out.println("<input type='radio' name='answer' value='9'> 9 <br>");
        out.println("<input type='submit' value='Submit Answer'>");
        out.println("</form>");
        out.println("</body></html>");
    }

    // Handles POST requests to process the form submission (checking the answer)
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Retrieve the selected answer from the form
        String selectedAnswer = request.getParameter("answer");

        // Check if the answer is correct
        String correctAnswer = "8";  // Correct answer is 8

        out.println("<html><body>");
        out.println("<h2>Quiz Result</h2>");

        // Display the result
        if (selectedAnswer != null && selectedAnswer.equals(correctAnswer)) {
            out.println("<h3>Correct! Well done.</h3>");
        } else {
            out.println("<h3>Incorrect. Try again!</h3>");
        }

        // Provide a link to return to the quiz form
        out.println("<br><a href='/quizgame/quiz'>Try another question</a>");
        out.println("</body></html>");
    }
}
