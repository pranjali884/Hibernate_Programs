package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibern.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Student student1=new Student();
		student1.setId(1234);
		student1.setName("sangita");
		student1.setCity("karad");
		
		Certificate certificate=new Certificate();
		certificate.setCourse("java");
		certificate.setDuration("2 months");
		student1.setCerti(certificate);
		
		Student student2=new Student();
		student1.setId(1235);
		student1.setName("sanu");
		student1.setCity("goa");
		
		Certificate certificate1=new Certificate();
		certificate.setCourse("sql");
		certificate.setDuration("1 months");
		student1.setCerti(certificate);
		
		
		Session ses=factory.openSession();
		
		Transaction tx=ses.beginTransaction();
		
		//objects save
		ses.save(student1);
		ses.save(student2);
		
		tx.commit();
		ses.close();
		
	}

}
