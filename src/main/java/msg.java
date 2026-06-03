import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/message")
public class msg extends HttpServlet {
    @Override
    protected void service( HttpServletRequest req, HttpServletResponse res)
            throws IOException , ServletException {
       int n1= Integer.parseInt(req.getParameter("name"));
        HttpSession session=req.getSession();
        session.setAttribute("k",n1);
        res.sendRedirect("add");


    }

}
