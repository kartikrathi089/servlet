import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class add extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
        int num=Integer.parseInt(req.getParameter("k"));
        //this technique nis known as url redirecting in we get parameter from url
        int sq=num*num;
        PrintWriter out=res.getWriter();
        out.print("Square ="+sq);



    }
}
