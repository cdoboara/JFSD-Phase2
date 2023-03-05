package com.controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Class;
import com.service.Service;
/**
 * Servlet implementation class ClassController
 */
@WebServlet("/ClassController")
public class ClassController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClassController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
		Service cs = new Service();
		List<Class> listOfClasses = cs.viewClasses();
		
		Iterator<Class> ii = listOfClasses.iterator();
		pw.println("<div>");
		pw.println("<span>Class Id  Class Name</span>");
		pw.println("</div>");
		while(ii.hasNext()) {
			Class c = ii.next();
			pw.println("<div>");
			pw.println("<span>"+c.getCid()+" "+c.getCname()+"</span>");
			pw.println("</div>");
		}
		//request.setAttribute("listOfProduct", listOfClasses);
		RequestDispatcher rd = request.getRequestDispatcher("viewClass.jsp");
		rd.include(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		
		response.setContentType("text/html");
		
		int cid = Integer.parseInt(request.getParameter("cid"));
		String cname = request.getParameter("cname");
		
		Class c = new Class();
		c.setCid(cid);
		c.setCname(cname);
		
		
		
		Service cs = new Service();
		String result  = cs.newClass(c);
		
		pw.println(result);
		
		RequestDispatcher rd = request.getRequestDispatcher("addClass.jsp");
		rd.include(request, response);
		//doGet(request, response);
	}

}
