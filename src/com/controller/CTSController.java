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
import com.entity.CTS;
import com.entity.Teacher;
import com.entity.Subject;
import com.entity.Student;
import com.service.Service;


/**
 * Servlet implementation class CTSController
 */
@WebServlet("/CTSController")
public class CTSController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CTSController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
		Service cs = new Service();
		
		int cid = Integer.parseInt(request.getParameter("cid"));
		
		List<CTS> listOfCTS = cs.viewCTS();
		Iterator<CTS> ii = listOfCTS.iterator();
		
		List<Student> listOfStudents = cs.selectStudents(cid);
		Iterator<Student> i2 = listOfStudents.iterator();
		
		Subject sub  = new Subject();
		Teacher t = new Teacher();
		Student s= new Student();
		
		//Get class name
		Class clasa =new Class();
		List<Class> listOfClasses = cs.selectClass(cid);
		clasa = listOfClasses.get(0);
		pw.println("<div>");
		pw.println("<span>Class name is</span>");
		pw.println("</div>");
		pw.println("<div>");
		pw.println("<span>"+clasa.getCname()+"</span>");
		pw.println("</div>");
		
		pw.println("<div>");
		pw.println("<span>Class has the following subjects and teachers </span>");
		pw.println("</div>");
		
		while(ii.hasNext()) {
			CTS c1 = ii.next();
			int classid= c1.getCid();
			if(classid==cid) {
				List<Subject> lists = cs.selectSubject(c1.getSid());
				sub=lists.get(0);
				List<Teacher> listt = cs.selectTeacher(c1.getTid());
				t=listt.get(0);
				pw.println("<div>");
				pw.println("<span>"+sub.getSname()+"       "+t.getTname()+"</span>");
				pw.println("</div>");	
			}
		}
		pw.println("<div>");
		pw.println("<span>Class has the following students </span>");
		pw.println("</div>");
		
		while(i2.hasNext()) {
			s = i2.next();
				pw.println("<div>");
				pw.println("<span>"+s.getSname()+" "+"</span>");
				pw.println("</div>");	
			
		}
			
//			String class_name="";
//			//Get the students class name
//			while(ic.hasNext()) {
//				Class cl=ic.next();
//				if(classid==cl.getCid())class_name=cl.getCname();
//			}
//			
//			pw.println("<div>");
//			pw.println("<span>"+c.getSid()+"       "+c.getSname()+"  "+class_name+"</span>");
//			pw.println("</div>");
//		}
//		//request.setAttribute("listOfProduct", listOfClasses);*/
		RequestDispatcher rd = request.getRequestDispatcher("viewCTS.jsp");
		rd.include(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		
		response.setContentType("text/html");
		
		int sid = Integer.parseInt(request.getParameter("sid"));
		int cid = Integer.parseInt(request.getParameter("cid"));
		int tid = Integer.parseInt(request.getParameter("tid"));
		
		CTS cts1 = new CTS();
		cts1.setSid(sid);
		cts1.setTid(tid);
		cts1.setCid(cid);
		
		Service cs = new Service();
		String result  = cs.newCTS(cts1);
		
		pw.println(result);
		
		RequestDispatcher rd = request.getRequestDispatcher("addCTS.jsp");
		rd.include(request, response);
		//doGet(request, response);
	}

}
