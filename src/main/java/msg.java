import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class msg extends HttpServlet {
    @Override
    protected void service( HttpServletRequest req, HttpServletResponse res)
            throws IOException , ServletException {
       String n1=req.getParameter("name");
       PrintWriter out=res.getWriter();
       boolean userVisit=false;
       Cookie[] cookies= req.getCookies();
       if(cookies!=null){
           for(int i=0;i<cookies.length;i++){
               Cookie c=cookies[i];
               String name=c.getName();
               String value=c.getValue();
               if(name.equals("k") && value.equals("123")){
                   out.print("welcome back "+n1);
                   userVisit=true;
                   break;
               }
           }
       }
       if(userVisit==false){
           Cookie c1=new Cookie("k","123");
           res.addCookie(c1);
           out.print("welcome "+ n1);

       }

    }

}
