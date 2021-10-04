
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
public class ArithmeticCalculatorServlet extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("message","Result: ---" );
        
       getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String first = request.getParameter("first");
         String second = request.getParameter("second");
         
            
        request.setAttribute("first", first);
        request.setAttribute("second", second);
        if (first == null || first.equals("") || second == null || second.equals("")){
            request.setAttribute("message","Result: invalid" );
             getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
             return;
        }

        try{
            int firstNum = Integer.parseInt(first);
            int secondNum = Integer.parseInt(second);
            int result=0;
            boolean button1 = request.getParameter("add") != null;
            boolean button2 = request.getParameter("substract") != null;
            boolean button3 = request.getParameter("multiply") != null;
            boolean button4 = request.getParameter("remainder") != null;
            if (button1){
                result = firstNum + secondNum;
                request.setAttribute("message","Result: " + result);
            }
            else
            if (button2){
                result = firstNum - secondNum;
                request.setAttribute("message","Result: " + result);
            }
            else
            if (button3){
                result = firstNum * secondNum;
                request.setAttribute("message","Result: " + result);
            }
            else
            if (button4){
                result = firstNum % secondNum;
                request.setAttribute("message","Result: " + result);
            }
        }
        catch(NumberFormatException e){
            request.setAttribute("message","Result: invalid" );
        }
        finally{
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        }
    }

}
