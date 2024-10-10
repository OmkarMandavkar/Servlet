package sessionManagement.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/destroyCookie")
public class destroyCookie extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] cookies = req.getCookies();

		for (Cookie cookie : cookies) {
			if (cookie.getName().equals("username")) {
				cookie.setMaxAge(0); // setting max age for cookie in seconds
				resp.addCookie(cookie);

				PrintWriter pw = resp.getWriter();
				pw.print("<html><body> <h1> Cookie is Destroyed </h1> </html></body>");
			}
		}
	}
}