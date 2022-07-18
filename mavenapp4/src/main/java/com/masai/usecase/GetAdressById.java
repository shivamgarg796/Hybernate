package com.masai.usecase;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class GetAdressById {

	public static void main(String[] args) {
		
		EmployeeDao ed=new EmployeeDaoImpl();
		
		String address=ed.getAddressOfEmployee(4);
		    
		    if(address!=null)
			System.out.println(address);
			else
			System.out.println("Employee does not exist");

	}

}
