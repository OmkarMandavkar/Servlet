package com.requestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calc")
public class PageA extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		double radius = Double.parseDouble(req.getParameter("rad"));

		double area = 3.142 * radius * radius;

		req.setAttribute("area", area);

		PrintWriter pw = resp.getWriter();
		pw.print("<html><body>");
		pw.print("<h1>Area of Circle in Page A : " + area + "<h1>");
		pw.print("</body></html>");

		RequestDispatcher rd = req.getRequestDispatcher("disp");
		rd.forward(req, resp);

	}
}
