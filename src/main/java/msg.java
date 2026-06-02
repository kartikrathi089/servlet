import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class msg extends HttpServlet {
    @Override
    protected void service( HttpServletRequest req, HttpServletResponse res)
            throws IOException , ServletException {
        int n1 =Integer.parseInt(req.getParameter("num1"));
        int n2=Integer.parseInt(req.getParameter("num2"));
        int add=n1+n2;
        res.sendRedirect("add?k="+add);
    }

}
