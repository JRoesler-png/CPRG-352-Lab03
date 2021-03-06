
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jeramie R
 */
public class AgeCalculatorServlet extends HttpServlet {

   

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //this will have the servlet call upon a jsp to be loaded by the client's browser
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        String age = request.getParameter("age");
        request.setAttribute("age", age);
        if (age == null || age.equals("")){
            request.setAttribute("message","You must give your current age." );
             getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
             return;
        }
        
        try{
            int newAge = Integer.parseInt(age);
            newAge++;
            request.setAttribute("message","Your age next birthday will be " + newAge );
        }
        catch(NumberFormatException e){
            request.setAttribute("message","You must enter a number" );
        }
        finally{
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        }
    }

    

}
