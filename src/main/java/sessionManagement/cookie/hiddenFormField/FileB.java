package sessionManagement.hiddenFormField;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fileb")
public class FileB extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String un = req.getParameter("username");
		String email = req.getParameter("email");

		PrintWriter pw = resp.getWriter();
		pw.print("<h1> Username: " + un + "</h1>");
	}
}
