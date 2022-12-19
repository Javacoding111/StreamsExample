package com.test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.test.dao.EmployeeDao;

public class HighestPaidEmployeeInOrganization {
	
	public static void main(String[] args) {
		List<Employee> employeeList = EmployeeDao.getEmployees();
//		Employee emp = employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).findFirst().get();
//		System.out.println(emp);
		
		//approach 2
		Employee emp = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary))).get();
		System.out.println(emp);
	}

}
