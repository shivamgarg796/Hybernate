package com.masai.dao;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;

import com.masai.entity.Employee;
import com.masai.utility.EMUtil;

public class EmployeeDaoImpl implements EmployeeDao {
	
	@Override
	public boolean insertEmployee(Employee employee) {
       
		boolean flag= false;
		
		EntityManager em= EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(employee);
		
		flag=true;
		
		em.getTransaction().commit();
		
		
		em.close();
		
		return flag;
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		
		EntityManager em= EMUtil.provideEntityManager();
		
		CriteriaQuery<Employee> criteria = em.getCriteriaBuilder().createQuery(Employee.class);
		
	    criteria.select(criteria.from(Employee.class));
	    
	    List<Employee> ListOfEmployee = em.createQuery(criteria).getResultList();
	   
	    return ListOfEmployee;

	
	}

	@Override
	public String getAddressOfEmployee(int empId) {
		  String s="employee does not found";
		
		 EntityManager em=EMUtil.provideEntityManager();
			
		 
		 	Employee e = em.find(Employee.class, empId);
			
			return e.getAddress();
			
//			return EMUtil.provideEntityManager().find(Account.class, accno);
				
	}

	@Override
	public String giveBonusToEmployee(int empId, int bonus) {
		Scanner sc=new Scanner(System.in);
		String s="employee does not exist";
		
		 EntityManager em=EMUtil.provideEntityManager();
		 Employee e=em.find(Employee.class, empId);
		 
		 if(e == null){
				s="Employee does not exist..";
			}
			else
			{
				
				em.getTransaction().begin();
				
				e.setSalary(e.getSalary()+bonus);
				
				em.getTransaction().commit();
				
				s="Bonus is graced...";
				
			}
			em.close();
		
		return s;
	}

	@Override
	public boolean deleteEmployee(int empId) {
	
      boolean flag=false;
		
		
		EntityManager em= EMUtil.provideEntityManager();
		
		Employee e1=em.find(Employee.class, empId);
		
		if(e1 != null){
			
			em.getTransaction().begin();
			
			em.remove(e1);
			flag=true;
			
			em.getTransaction().commit();
		}
		
		em.close();
		
		
		
		return flag;
	}

	@Override
	public String[] getNameAndAddress(int empId) {
	
		String[] str=new String[2];
		
		 EntityManager em=EMUtil.provideEntityManager();
		 Employee e=em.find(Employee.class, empId);
		 
		 if(e!=null) {
			 str[0]=e.getName();
			 str[1]=e.getAddress();
		 }
	  
		 return str;
	}

	

}
