package com.masai.usecase;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class GiveBonusToEmployee {

	public static void main(String[] args) {
	
		EmployeeDao ed=new EmployeeDaoImpl();
		
		String s=ed.giveBonusToEmployee(3,360);
		
		if(s!=null)
			System.out.println(s);
		else
			System.out.println("employee does not exists");

	}

}
