package com.masai.usecase;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.entity.Employee;

public class InsertEmployee {

	public static void main(String[] args) {
		
		EmployeeDao ed=new EmployeeDaoImpl();
		
		Employee e1=new Employee();
		e1.setEmpId(4);
		e1.setName("dheeraj");
		e1.setAddress("panipati");
		e1.setSalary(3650);
		
		Boolean b=ed.insertEmployee(e1);
		
		if(b)
			System.out.println("employee details inserted successfully");
		else
			System.out.println("not inserted");
		
	    

	}

}
