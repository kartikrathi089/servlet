import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class add extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
       int a=(int) req.getAttribute("k");
        PrintWriter out=res.getWriter();
        out.print("second servlet"+" "+a);


    }
}
