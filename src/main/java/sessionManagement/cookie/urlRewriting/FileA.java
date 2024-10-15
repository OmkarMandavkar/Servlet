package sessionManagement.urlRewriting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/urlFilea")
public class FileA extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String un = req.getParameter("un");
		String pwd = req.getParameter("pwd");
		PrintWriter pw = resp.getWriter();
		pw.print("<html><body>");
		pw.print("<a href='urlFileb?username=" + un + "'>Click here!!!</a>");

		pw.print("</form></body></html>");
	}
}
