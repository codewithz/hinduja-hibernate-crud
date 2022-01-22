package com.hinduja;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

public class ParametersnHQL {

public static void main(String[] args) {
		
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory sf=meta.getSessionFactoryBuilder().build();
		
		Session s=sf.openSession();
		
		
		Transaction tx=s.beginTransaction();
		
		Query<Employee> q=s.createQuery("Update Employee set name=:n where id=:i");
		
		q.setParameter("n","CWZ");
		q.setParameter("i", 12);
		
		int status=q.executeUpdate();
		
		System.out.println("Employee Updated");
		
		tx.commit();
	}
}
