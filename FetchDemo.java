package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
		
		//get , load
		Configuration cfg=new Configuration();
		cfg.configure("hibern.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
		//get-student.104
		Student student=session.load(Student.class, 104);
		System.out.println(student);
		
		Address ad=session.get(Address.class, 1);
		System.out.println(ad);
		session.close();
		
	}

}
