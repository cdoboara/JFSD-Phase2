package com.dao;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.entity.CTS;
import com.resource.DbResource;

public class CTSDao {
	public int addCTS (CTS p1) {
		SessionFactory sf= DbResource.getSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.getTransaction();
		tran.begin();
		session.save(p1);
		tran.commit();
		return 1;
		
	}
	
	public List<CTS> viewCTS () {
		SessionFactory sf= DbResource.getSessionFactory();
		Session session = sf.openSession();
		TypedQuery tq = session.createQuery("From CTS");
		List<CTS> lista = tq.getResultList();
		return lista;
	}

}
