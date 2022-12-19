package com.test;

import java.util.List;
import java.util.stream.Collectors;

import com.test.dao.EmployeeDao;

public class NameOfEmployeesJoinedAfter2015 {

	public static void main(String[] args) {
		List<Employee> employeeList = EmployeeDao.getEmployees();
		List<String> namesList = employeeList.stream().filter(employee -> employee.getYearOfJoining() > 2015).map(Employee::getName).collect(Collectors.toList());
		System.out.println(namesList);
	}

}
