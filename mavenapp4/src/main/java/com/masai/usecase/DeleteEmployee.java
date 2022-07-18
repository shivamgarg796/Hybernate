package com.masai.usecase;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class DeleteEmployee {

	public static void main(String[] args) {
//		Scanner sc =new Scanner(System.in);
//		int empId=sc.nextInt();
		
		EmployeeDao ed=new EmployeeDaoImpl();
		boolean b=ed.deleteEmployee(2);
		    
		    if(b)
			System.out.println("employee succesfully deleted");
			else
			System.out.println("Employee does not exist");
	}
}
