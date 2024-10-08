package com.loadOnServer;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PageC extends HttpServlet {
	
	public PageC() {
		System.out.println("Object of packA is created");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("PageA is initialized");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Servlet of PageA is called");
	}
}