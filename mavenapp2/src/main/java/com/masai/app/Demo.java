package com.masai.app;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.masai.entities.Student;

public class Demo {

	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("studentUnit1");
		
	    EntityManager em=emf.createEntityManager();
	    
//	    Student student=em.find(Student.class,10);
//	    
//	    if(student!=null)
//	    	System.out.println(student);
//	    else
//	    	System.out.println("student does not exists");
//	
//	    
//	    em.close();
	    
//	    Student s1=new Student(30,"mukesh","kolkata",760);
//	    
//	    em.getTransaction().begin();
//	    em.persist(s1);
//	    
//	    em.getTransaction().commit();
//	    em.close();
	    
//	    Scanner sc=new Scanner(System.in);
//	    System.out.println("Enter roll to delete");
//	    int roll=sc.nextInt();
//	    
//	    Student st=em.find(Student.class, roll);
//	    
//	    if(st!=null) {
//	    	em.getTransaction().begin();
//	    	em.remove(st);
//	    	em.getTransaction().commit();
//	    	
//	    	
//	    	System.out.println("Student removed...");
//	    }
//	    else
//	    	System.out.println("student not fount");
//	    
//	    em.close();
	    
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter roll to give grace marks ");
		int roll=sc.nextInt();
		
		Student student=em.find(Student.class, roll); //if it returns the obj then the obj will be in p.state
		
		
		if(student == null){
			System.out.println("Student does not exist..");
		}
		else
		{
			
			System.out.println("Enter the grace marks");
			int marks=sc.nextInt();
			
			em.getTransaction().begin();
			
			student.setMarks(student.getMarks()+marks);
			
			em.getTransaction().commit();
			
			System.out.println("Marks is graced...");
			
		}
		em.close();
	    
	    System.out.println("done...");
	    
	    
	    
	}
}
