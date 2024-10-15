package sessionManagement.hiddenFormField;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hff1")
public class FileA extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String un = req.getParameter("un");
		String pwd = req.getParameter("pwd");

		PrintWriter pw = resp.getWriter();
		pw.print("<html><body>");
		pw.print("<form action='fileb'>");

		// managing the state of the user using hidden form field
		pw.print("<input type='hidden' name='username' value='" + un + "'>");
		pw.print("Email: <input type='email' name='email'>");
		pw.print("<input type='submit' value='Submit' >");
		pw.print("</form></body></html>");
	}
}