package com.test;

import java.util.Comparator;
import java.util.List;

import com.test.dao.EmployeeDao;

public class MostExperienceInOrgnization {
	public static void main(String[] args) {
		List<Employee> employeeList = EmployeeDao.getEmployees();
		Employee emp = employeeList.stream().sorted(Comparator.comparing(Employee::getYearOfJoining)).findFirst().get();
		System.out.println(emp);
	}

}
