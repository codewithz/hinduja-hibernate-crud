package com.hinduja;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class LoadEmployeeById {
	public static void main(String[] args) {
		
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory sf=meta.getSessionFactoryBuilder().build();
		
		Session s=sf.openSession();
		
		Transaction tx=s.beginTransaction();
		
		
		Employee e=s.load(Employee.class, new Integer(7));
		
		System.out.println(e);
		
		tx.commit();
		System.out.println("Loaded");
		s.close();
		
		
	}
}
