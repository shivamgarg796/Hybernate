package com.masai.usecase;

import java.util.List;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.entity.Employee;

public class GetAllEmployee {

	public static void main(String[] args) {
	
		EmployeeDao ed=new EmployeeDaoImpl();
		
		List<Employee> ls=ed.getAllEmployee();
		if(ls!=null) {
			for(Employee e:ls) {
				System.out.println("emp id :"+e.getEmpId());
				System.out.println("emp name :"+e.getName());
				System.out.println("emp address:"+e.getAddress());
				System.out.println("emp salary"+e.getSalary());
				
				System.out.println("================================");
				
			}
		}
		else {
			System.out.println("no any employee found");
		}

	}

}
