import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.*;
@WebServlet("/Login")

public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username=request.getParameter("username");
        String password=request.getParameter("password");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if(username.contentEquals("1") && password.contentEquals("1")) {
            response.setContentType("text/html");
            out.print("Hello "+ username);
            out.close();
        }
        else{
            response.setContentType("text/html");
            out.print("Login or password is wrong ");
            out.close();
        }
    }
}