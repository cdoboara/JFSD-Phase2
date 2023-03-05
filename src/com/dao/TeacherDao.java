package com.dao;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.entity.Teacher;
import com.resource.DbResource;

public class TeacherDao {
	public int addTeacher (Teacher teach) {
		SessionFactory sf= DbResource.getSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.getTransaction();
		tran.begin();
		try {
		session.save(teach);
		tran.commit();}catch(Exception e) {return 0;}
		return 1;
		
	}
	
	public List<Teacher> viewTeachers () {
		SessionFactory sf= DbResource.getSessionFactory();
		Session session = sf.openSession();
		TypedQuery tq = session.createQuery("From Teacher");
		List<Teacher> listaProfesori = tq.getResultList();
		return listaProfesori;
	}
	//Select teacher by id
	public List<Teacher> selectTeacher (int id) {
		SessionFactory sf= DbResource.getSessionFactory();
		Session session = sf.openSession();
		TypedQuery tq = session.createQuery("From Teacher where tid="+id);
		List<Teacher> listaProfesori = tq.getResultList();
		return listaProfesori;
	}

}
