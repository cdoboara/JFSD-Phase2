package com.dao;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.entity.Class;
import com.resource.DbResource;

public class ClassDao {
	public int addClass (Class clasa) {
		SessionFactory sf= DbResource.getSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.getTransaction();
		tran.begin();
		session.save(clasa);
		tran.commit();
		return 1;
		
	}
	
	public List<Class> viewClasses () {
		SessionFactory sf= DbResource.getSessionFactory();
		Session session = sf.openSession();
		TypedQuery tq = session.createQuery("From Class");
		List<Class> listaClase = tq.getResultList();
		return listaClase;
	}
	public List<Class> selectClass (int id){
		SessionFactory sf= DbResource.getSessionFactory();
		Session session = sf.openSession();
		TypedQuery tq = session.createQuery("From Class where cid="+id);
		List<Class> listaClase = tq.getResultList();
		return listaClase;
	}

}
