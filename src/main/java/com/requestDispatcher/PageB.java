package com.requestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/disp")
public class PageB extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Object area = req.getAttribute("area");

		PrintWriter pw = resp.getWriter();
		pw.print("<html><body>");
		pw.print("<h1>Area of Circle in Page B : " + area + "<h1>");
		pw.print("</body></html>");

	}
}
