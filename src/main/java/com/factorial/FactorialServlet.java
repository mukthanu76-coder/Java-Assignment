package com.factorial;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/factorial")
public class FactorialServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            int number = Integer.parseInt(request.getParameter("number"));

            // Validation
            if (number < 0) {
                throw new IllegalArgumentException("Number cannot be negative");
            }
            if (number > 20) {
                throw new IllegalArgumentException("Maximum allowed is 20");
            }

            // Factorial logic
            long factorial = 1;
            String steps = "";

            for (int i = number; i >= 1; i--) {
                factorial *= i;
                steps += i;
                if (i > 1) steps += " × ";
            }

            if (number == 0) {
                factorial = 1;
                steps = "0! = 1";
            } else {
                steps = number + "! = " + steps + " = " + factorial;
            }

            // Output HTML
            out.println("<html><head><title>Result</title></head><body>");
            out.println("<h2>Factorial Result</h2>");
            out.println("<p>Number: " + number + "</p>");
            out.println("<p>Factorial: " + factorial + "</p>");
            out.println("<p>" + steps + "</p>");
            out.println("<a href='index.html'>Back</a>");
            out.println("</body></html>");

        } catch (Exception e) {
            out.println("<html><body style='color:red'>");
            out.println("<h3>Error: " + e.getMessage() + "</h3>");
            out.println("<a href='index.html'>Try Again</a>");
            out.println("</body></html>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("index.html");
    }
}