package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Srvlet2")
public class Srvlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String user=request.getParameter("user");
		HttpSession session=request.getSession();
		session.setAttribute("info",user);
		ServletContext ctx=getServletContext();
		int total=(int)ctx.getAttribute("total");
		int current=(int)ctx.getAttribute("current");
		out.println("current users:"+user);
		out.println("<br>total users:"+total);
		out.println("<br>current users:"+current);
		out.println("<a href='Servlet'>log out here</a>");
		}
	}


