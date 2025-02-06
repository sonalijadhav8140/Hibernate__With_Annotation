package com.sit.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sit.model.Employee;

public class TestEmployee {
    
	public static void main(String[] args) {
		
		
		    Configuration cfg = new Configuration();
		                 cfg.configure("hibernate.cfg.xml");
		  SessionFactory sessionFactory = cfg.buildSessionFactory();
		  
		  Session session = sessionFactory.openSession();
		  Transaction tx = session.beginTransaction();
		  
		  Employee emp=new Employee();
		   
		  emp.setEpmid(101);
		  emp.setEmpName("Sonali");
		  emp.setEmpsalary(40000.00);
		  emp.setEmail("sonali@gmail.com");
         
		  session.save(emp);
		  tx.commit();
		  session.close();
		
	}
}
