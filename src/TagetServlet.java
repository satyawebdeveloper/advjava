import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/target")
public class TagetServlet extends HttpServlet {

	public void doGet(HttpServletRequest req,HttpServletResponse resp)throws IOException{
		HttpSession s420=req.getSession();
		String username=(String)s420.getAttribute("user");
		
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		pw.println("Username"+username);
		
		
	}
}
