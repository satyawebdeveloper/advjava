import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/source")
public class SourceServlet extends HttpServlet{
public void doGet(HttpServletRequest req,HttpServletResponse resp)throws IOException{
	
	String username=req.getParameter("uname");
	
	HttpSession sd=req.getSession();
	sd.setAttribute("user", username);
	//sd.setMaxInactiveInterval(5);
	
	
	resp.setContentType("text/html");
	PrintWriter pw=resp.getWriter();
	
	pw.println("check username <a href="+resp.encodeURL("./target")+"> get username </a>");
	
}
}
