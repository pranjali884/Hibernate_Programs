package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {	

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibern.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		//creating question
				Question q1=new Question();
				q1.setQuestionId(1212);
				q1.setQuestion("what is java");
				
				
				//creating answer
				Answer ans=new Answer();
				ans.setAnswerId(343);
				ans.setAnswer("is a programming language");
				ans.setQuestion(q1);
		
		//creating question
				Question q=new Question();
				q.setQuestionId(12);
				q.setQuestion("what is collection");
				
				
				
				//creating answer
				Answer ans1=new Answer();
				ans1.setAnswerId(34);
				ans1.setAnswer("is a framework");
				ans1.setQuestion(q);
		
		q1.setAnswer(ans);
		q.setAnswer(ans1);
		
		//session
		
		Session s=factory.openSession();
		
		Transaction tx=s.beginTransaction();
		
		
		//save
		s.save(q1);
		s.save(q);
		s.save(ans);
		s.save(ans1);
		tx.commit();
		
		
		
		s.close();
		
	
	}

}
