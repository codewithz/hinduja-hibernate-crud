package com.hinduja;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StoreEmployee {

	
	public static void main(String[] args) {
		
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory sf=meta.getSessionFactoryBuilder().build();
		
		Session s=sf.openSession();
		
		Transaction tx=s.beginTransaction();
		
		Employee e=new Employee();
		e.setId(1000);
		e.setName("Tom");
		e.setDept("Ops");
		e.setDesignation("Dev");
		e.setSalary(234556.09f);
		e.setDoj("2021-09-09");
		
		s.save(e);
		
		tx.commit();
		System.out.println("Saved");
		s.close();
		
		
	}
}
