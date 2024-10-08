package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/httpServlet")
public class FirstHttpServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("HttpServlet Executed");

		PrintWriter pw = resp.getWriter();
		pw.print("<html><body>" 
				+ "<h1>	HttpServlet Executed </h1>" 
				+ "</body></html>");
	}
}
