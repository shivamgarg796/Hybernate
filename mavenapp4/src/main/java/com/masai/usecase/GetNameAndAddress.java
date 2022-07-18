package com.masai.usecase;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class GetNameAndAddress {

	public static void main(String[] args) {
		
		EmployeeDao ed=new EmployeeDaoImpl();
		String[] str=ed.getNameAndAddress(3);
		
		if(str!=null) {
			for(String s:str) {
				System.out.println(s);
			}
		}
		else
			System.out.println("employee does not exists");

	}

}
