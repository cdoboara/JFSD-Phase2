package com.service;

import java.util.List;

import com.dao.CTSDao;
import com.dao.ClassDao;
import com.entity.CTS;
import com.entity.Class;
import com.dao.StudentDao;
import com.entity.Student;
import com.dao.TeacherDao;
import com.entity.Teacher;
import com.dao.SubjectDao;
import com.entity.Subject;


public class Service {
	
ClassDao cd  = new ClassDao();
StudentDao sd  = new StudentDao();
TeacherDao td  = new TeacherDao();
SubjectDao sud = new SubjectDao();
CTSDao cts1 = new CTSDao();
	//Class
	public String newClass(Class clasa) {
		if(cd.addClass(clasa)>0) {
			return "Class data stored successfully";
		}else {
			return "Class details didn't store";
		}
	}
	
	public List<Class> viewClasses() {
		return cd.viewClasses();
	}
	
	//Student
	public String newStudent(Student stud) {
		if(sd.addStudent(stud)>0) {
			return "Student data stored successfully";
		}else {
			return "Student details didn't store";
		}
	}
	
	public List<Student> viewStudents() {
		return sd.viewStudents();
	}
	
	//teacher
	public String newTeacher(Teacher t) {
		if(td.addTeacher(t)>0) {
			return "Teacher data stored successfully";
		}else {
			return "Teacher details didn't store";
		}
	}
	
	public List<Teacher> viewTeachers() {
		return td.viewTeachers();
	}
	
	//Subject
	public String newSubject(Subject subj) {
		if(sud.addSubject(subj)>0) {
			return "Subject data stored successfully";
		}else {
			return "Subject details didn't store";
		}
	}
	
	public List<Subject> viewSubjects() {
		return sud.viewSubjects();
	}
	//CTS

	public String newCTS(CTS p1) {
		if(cts1.addCTS(p1)>0) {
			return "Subject data stored successfully";
		}else {
			return "Subject details didn't store";
		}
	}
	
	public List<CTS> viewCTS() {
		return cts1.viewCTS();
	} 
	
	public List<Student> selectStudents(int cid) {
		return sd.selectStudents(cid);
	}
	public List<Teacher> selectTeacher(int cid) {
		return td.selectTeacher(cid);
	}
	public List<Subject> selectSubject(int cid) {
		return sud.SelectSubject(cid);
	}
	public List<Class> selectClass(int cid) {
		return cd.selectClass(cid);
	}
	
	
}
