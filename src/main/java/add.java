import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/add")
public class add extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
        HttpSession session=req.getSession();
        int n=(int)session.getAttribute("k");
        int sq=n*n;
        PrintWriter out=res.getWriter();
        out.print("square of the number: "+sq);

    }
}
