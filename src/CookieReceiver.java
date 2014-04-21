import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/tgt")
public class CookieReceiver extends HttpServlet {

	public void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
		Cookie c[]=req.getCookies();
		
		String color=null;
		for(int i=0;i<c.length;i++){
			String name=c[i].getName();
			if(name.equals("bc")){
				color=c[i].getValue();
				
			}
		}
		
		PrintWriter pw=resp.getWriter();
		pw.println("<body bgcolor="+color+">");
	}
}
