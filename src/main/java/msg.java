import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class msg extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String n=req.getParameter("name");
           PrintWriter out = res.getWriter();
           out.print("hello"+n);


    }

}
