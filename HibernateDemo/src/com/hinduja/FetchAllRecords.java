package com.hinduja;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

public class FetchAllRecords {
	
public static void main(String[] args) {
		
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory sf=meta.getSessionFactoryBuilder().build();
		
		Session s=sf.openSession();
		
		Transaction tx=s.beginTransaction();
		
		Query<Employee> query=s.createQuery("from Employee");
	//	query.setFirstResult(2);
	//	query.setMaxResults(6);
		List<Employee> list=query.list();
		
		for(Employee e:list) {
			System.out.println(e);
		}
		
		
 }
		

}
