import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/src")
public class CookieCreate extends HttpServlet {

	public void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
		String clr=req.getParameter("opt");
		Cookie c1= new Cookie("bc",clr);
		c1.setMaxAge(300);
		
		PrintWriter pw=resp.getWriter();
		pw.println("<a href=./tgt>Check preferences </a>");
	}
}
