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
public class ArithmeticCalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculatorJSP.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String submit = request.getParameter("submit");
        
        request.setAttribute("first", first);
        request.setAttribute("second", second);
        
        if (first == null || first.equals("") || second == null || second.equals("")) {
            request.setAttribute("message", "Invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculatorJSP.jsp").forward(request, response);
            return;
        }

        try{
            int calcFirst = Integer.parseInt(first);
            int calcSecond = Integer.parseInt(second);

            if (first.equals(Integer.toString(calcFirst)) && second.equals(Integer.toString(calcSecond))){
                int answer;
                switch (submit) {
                    case "+":
                        answer = calcFirst + calcSecond;
                        break;
                    case "-":
                        answer = calcFirst - calcSecond;
                        break;
                    case "*":
                        answer = calcFirst * calcSecond;
                        break;
                    case "/":
                        answer = calcFirst / calcSecond;
                        break;
                    default:
                        request.setAttribute("message", "---");
                        return;
                }
                request.setAttribute("message", answer);
                getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculatorJSP.jsp").forward(request, response);
            }
        }catch (NumberFormatException e){
            request.setAttribute("message", "Enter numbers only");
            getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculatorJSP.jsp").forward(request, response);
        }
    }
}
