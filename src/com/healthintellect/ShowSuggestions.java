package com.healthintellect;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class ShowSuggestions extends HttpServlet {

public void service(HttpServletRequest req, HttpServletResponse res) throws IOException{	

	String name  = req.getParameter("first");

		PrintWriter out = res.getWriter();
		out.print("Thanks "+name+" For Providing Us your Informations");
	    
	
   }
}