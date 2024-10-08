package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstGenericServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		String name = req.getParameter("user_name");
		String email = req.getParameter("user_email");
		String address = req.getParameter("user_address");

		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("Address: " + address);

		PrintWriter pw = res.getWriter();
		pw.print("<html><body>"
				+ "<h1>Name : " + name + "</h1>"
				+ "<h1>Email : " + email + "</h1>"
				+ "<h1>Address : " + address + "</h1>"
				+ "</body></html>");
	}
}