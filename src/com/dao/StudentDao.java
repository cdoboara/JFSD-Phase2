package com.dao;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.entity.Student;
import com.resource.DbResource;

public class StudentDao {
	public int addStudent (Student stud) {
		SessionFactory sf= DbResource.getSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.getTransaction();
		tran.begin();
		session.save(stud);
		tran.commit();
		return 1;
		
	}
	
	public List<Student> viewStudents () {
		SessionFactory sf= DbResource.getSessionFactory();
		Session session = sf.openSession();
		TypedQuery tq = session.createQuery("From Student");
		List<Student> listaStudenti = tq.getResultList();
		return listaStudenti;
	}
	public List<Student> selectStudents (int id) {
		SessionFactory sf= DbResource.getSessionFactory();
		Session session = sf.openSession();
		TypedQuery tq = session.createQuery("From Student where cid="+id);
		List<Student> listaStudenti = tq.getResultList();
		return listaStudenti;
	}

}
