package com.hibernate.HibernateMapping;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class App 
{
    public static void main( String[] args )
    {
       Laptop l=new Laptop();
       l.setLid(102);
       l.setLname("Dell");
       
       
       Student stu=new Student();
       stu.setRollno(2);
       stu.setName("Sahasra");
       stu.setMarks(86);
       stu.getL().add(l);
       
       l.getStu().add(stu);
       
       
       Configuration con=new Configuration().configure("Mapping.cfg.xml");
       SessionFactory sf=con.buildSessionFactory();
       Session session=sf.openSession();
       session.beginTransaction();
       session.save(l);
       session.save(stu);
       session.getTransaction().commit();
       session.close();
       sf.close();
    }
}
