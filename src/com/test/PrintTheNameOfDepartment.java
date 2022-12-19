package com.test;

import java.util.List;
import java.util.stream.Collectors;

import com.test.dao.EmployeeDao;

public class PrintTheNameOfDepartment {
	
	public static void main(String[] args) {
		List<Employee> employeeList = EmployeeDao.getEmployees();
		List<String> deptNamesList = employeeList.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());
		System.out.println(deptNamesList);
	}

}
