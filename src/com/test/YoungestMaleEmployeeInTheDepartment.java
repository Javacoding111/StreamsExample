package com.test;

import java.util.Comparator;
import java.util.List;

import com.test.dao.EmployeeDao;

public class YoungestMaleEmployeeInTheDepartment {
	public static void main(String[] args) {
		List<Employee> employeeList = EmployeeDao.getEmployees();
//		Employee emp = employeeList.stream().filter(employee -> employee.getGender().equalsIgnoreCase("Male")).sorted(Comparator.comparing(Employee::getAge)).findFirst().get();
//		System.out.println(emp);
		
		//alternate approach
		Employee emp = employeeList.stream().filter(employee -> employee.getGender().equalsIgnoreCase("Male") && employee.getDepartment().equalsIgnoreCase("UX")).min(Comparator.comparing(Employee::getAge)).get();
		System.out.println(emp);
	}

}
