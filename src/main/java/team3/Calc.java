package team3;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="Calc", urlPatterns="/JavaCalc")
public class Calc extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestCalc Calc = RequestCalc.fromRequestParameters(request);
        Calc.setAsRequestAttributesAndCalculate(request);

        request.getRequestDispatcher("/Results.jsp").forward(request, response);

    }

    private static class RequestCalc {
        private final String f_calc;
        private double result;

        private RequestCalc (String first) {
            this.f_calc = first;
        }

        public static RequestCalc fromRequestParameters(HttpServletRequest request) {
            return new RequestCalc(request.getParameter("rad"));
        }

        public void setAsRequestAttributesAndCalculate(HttpServletRequest request) {
            request.setAttribute("first_result", f_calc);
            double rad;
            try {
                rad=Double.parseDouble(f_calc);
            }
            catch (NumberFormatException e) {
                rad=0;
            }

            result=rad*rad*Math.PI;
            request.setAttribute("result", result);
        }
    }

}
