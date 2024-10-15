package com.requestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("uname");
		String password = req.getParameter("upwd");

		if (username.equals("admin") && password.equals("root")) {
			RequestDispatcher rd = req.getRequestDispatcher("home.html");
			rd.forward(req, resp);
		} 
		else {
			RequestDispatcher rd = req.getRequestDispatcher("login.html");
			PrintWriter pw = resp.getWriter();
			pw.print("<html><body> <h1> Invalid Credentials </h1> </body></html>");
			rd.include(req, resp);
		}
	}
}
