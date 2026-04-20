package com.cookie;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("username");

        Cookie cookies[] = request.getCookies();

        int visitCount = 1;
        boolean userFound = false;

        if (cookies != null) {
            for (Cookie c : cookies) {

                if (c.getName().equals("username")) {
                    name = c.getValue();
                    userFound = true;
                }

                if (c.getName().equals("visitCount")) {
                    visitCount = Integer.parseInt(c.getValue());
                    visitCount++;
                }
            }
        }

        // Create/Update Cookies
        Cookie nameCookie = new Cookie("username", name);
        Cookie countCookie = new Cookie("visitCount", String.valueOf(visitCount));

        // Set expiry time (30 seconds for demo)
        nameCookie.setMaxAge(30);
        countCookie.setMaxAge(30);

        response.addCookie(nameCookie);
        response.addCookie(countCookie);

        // Output
        out.println("<html><body>");

        if (userFound) {
            out.println("<h2>Welcome back " + name + "!</h2>");
            out.println("<h3>You have visited this page " + visitCount + " times.</h3>");
        } else {
            out.println("<h2>Welcome " + name + "!</h2>");
            out.println("<h3>This is your first visit.</h3>");
        }

        out.println("<br><p><b>Note:</b> Cookie will expire in 30 seconds.</p>");
        out.println("<a href='index.html'>Go Back</a>");

        out.println("</body></html>");
    }
}