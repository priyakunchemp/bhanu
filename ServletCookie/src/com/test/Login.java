package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Login")
public class Login extends HttpServlet 
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String pass=request.getParameter("pwd");
		Cookie ck=new Cookie("info",name);
		response.addCookie(ck);
		/*HttpSession session=request.getSession();
		session.setAttribute("info",name);*/
		out.println("from servlet1:"+name);
		out.println("<a href='Servlet1'>next page</a>");
		}
	}
	


