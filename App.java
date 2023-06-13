package com.tut;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
        Configuration cfg=new Configuration();
        cfg.configure("hibern.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        
        //creating student
        Student st=new Student();
        st.setId(109);
        st.setName("Pranju");
        st.setCity("Pune");
        System.out.println(st);
        
        //creating object of address class
        Address ad=new Address();
        ad.setStreet("Street1");
        ad.setCity("Pune");
        ad.setOpen(true);
        ad.setAddDate(new Date());
        ad.setX(123456.897);
        
        Session session=factory.openSession();
        
        Transaction tx = session.beginTransaction();
        
        session.save(st);
        session.save(ad);
        tx.commit();
        
        session.close();
        System.out.println("done");
    }
}
