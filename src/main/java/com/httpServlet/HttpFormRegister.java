package com.httpServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HttpForm")
public class HttpFormRegister extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("uname");
		String email = req.getParameter("uemail");
		
		PrintWriter pw = resp.getWriter();
		pw.print("<html><body>"
				+ "<h1>Name : " + name + "</h1>"
				+ "<h1>Email : " + email + "</h1>"
				+ "</body></html>");		
	}
}
