/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 752814
 */

public class AgeCalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/AgeCalculatorJSP.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String age = request.getParameter("age");
        
        
        
        if (age == null || age.equals("")) {
            request.setAttribute("message", "You must enter your age");
            getServletContext().getRequestDispatcher("/WEB-INF/AgeCalculatorJSP.jsp").forward(request, response);
            return;
        }
        if (Integer.parseInt(age) >= 0) {
            request.setAttribute("message", "Your age next year will be: ");
            request.setAttribute("age", (Integer.parseInt(age) + 1));
            getServletContext().getRequestDispatcher("/WEB-INF/AgeCalculatorJSP.jsp").forward(request, response);

            return;
        }
            request.setAttribute("message", "You must enter your age as a positive number");
            getServletContext().getRequestDispatcher("/WEB-INF/AgeCalculatorJSP.jsp").forward(request, response);
    }
}
