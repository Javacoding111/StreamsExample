package com.test.dao;

import java.util.ArrayList;
import java.util.List;

import com.test.Employee;

public class EmployeeDao {
	
	public static List<Employee> getEmployees() {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(1, "Swarupa", 35, "Female", "Development", 2014, 50000));
		employeeList.add(new Employee(2, "Mahesh", 40, "Male", "Development", 2012, 30000));
		employeeList.add(new Employee(3, "Sandhya", 37, "Female", "Development", 2016, 60000));
		employeeList.add(new Employee(4, "Sanjeev", 42, "Male", "UX", 2017, 100000));
		employeeList.add(new Employee(5, "Fayaz", 35, "Male", "UX", 2018, 20000));
		employeeList.add(new Employee(6, "Sai", 35, "Female", "Testing", 2010, 50000));
		employeeList.add(new Employee(7, "Mounica", 35, "Female", "Testing", 2021, 25000));
		employeeList.add(new Employee(8, "Revathi", 35, "Female", "Development", 2021, 20000));
		
		return employeeList;
		
	}

}
