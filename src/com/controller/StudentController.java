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

import com.entity.Student;
import com.entity.Class;
import com.service.Service;
/**
 * Servlet implementation class ClassController
 */
@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
		Service cs = new Service();
		List<Student> listOfStudents = cs.viewStudents();
		List<Class> listOfClasses = cs.viewClasses();
		
		Iterator<Student> ii = listOfStudents.iterator();
		
		pw.println("<div>");
		pw.println("<span>Student Id  Student Name   Class</span>");
		pw.println("</div>");
		while(ii.hasNext()) {
			Iterator<Class> ic = listOfClasses.iterator();
			Student c = ii.next();
			int classid= c.getCid();
			String class_name="";
			//Get the students class name
			while(ic.hasNext()) {
				Class cl=ic.next();
				if(classid==cl.getCid())class_name=cl.getCname();
			}
			
			pw.println("<div>");
			pw.println("<span>"+c.getSid()+"       "+c.getSname()+"  "+class_name+"</span>");
			pw.println("</div>");
		}
		//request.setAttribute("listOfProduct", listOfClasses);
		RequestDispatcher rd = request.getRequestDispatcher("viewStudent.jsp");
		rd.include(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		
		response.setContentType("text/html");
		
		int sid = Integer.parseInt(request.getParameter("sid"));
		String sname = request.getParameter("sname");
		int cid = Integer.parseInt(request.getParameter("cid"));
		
		Student s = new Student();
		s.setSid(sid);
		s.setSname(sname);
		s.setCid(cid);
		
		
		
		Service cs = new Service();
		String result  = cs.newStudent(s);
		
		pw.println(result);
		
		RequestDispatcher rd = request.getRequestDispatcher("addStudent.jsp");
		rd.include(request, response);
		//doGet(request, response);
	}

}
