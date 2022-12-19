package com.test;

import java.util.List;

import com.test.dao.EmployeeDao;

public class AverageAndTotalSalaryOfTheOrganization {
	public static void main(String[] args) {
		List<Employee> employeeList = EmployeeDao.getEmployees();
		Double averageSalary = employeeList.stream().map(Employee::getSalary).mapToDouble(Double::valueOf).average().getAsDouble();
		Double totalSalary = employeeList.stream().map(Employee::getSalary).mapToDouble(Double::valueOf).sum();
		System.out.println(averageSalary);
		System.out.println(totalSalary);
	}

}
