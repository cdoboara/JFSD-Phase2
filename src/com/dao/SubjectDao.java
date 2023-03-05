package com.dao;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.entity.Subject;
import com.entity.Teacher;
import com.resource.DbResource;

public class SubjectDao {
	public int addSubject (Subject subiect) {
		SessionFactory sf= DbResource.getSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.getTransaction();
		tran.begin();
		try {
		session.save(subiect);
		tran.commit();}catch(Exception e) {return 0;}
		return 1;
		
	}
	
	public List<Subject> viewSubjects() {
		SessionFactory sf= DbResource.getSessionFactory();
		Session session = sf.openSession();
		TypedQuery tq = session.createQuery("From Subject");
		List<Subject> listaSubiecte = tq.getResultList();
		return listaSubiecte;
	}
	public List<Subject> SelectSubject (int id) {
		SessionFactory sf= DbResource.getSessionFactory();
		Session session = sf.openSession();
		TypedQuery tq = session.createQuery("From Subject where sid="+id);
		List<Subject> listaSubiecte = tq.getResultList();
		return listaSubiecte;
	}

}
