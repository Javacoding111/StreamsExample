package com.test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.test.dao.EmployeeDao;

public class MaleAndFemaleCountInOrganization {
	public static void main(String[] args) {
		List<Employee> employeeList = EmployeeDao.getEmployees();
		
		Map<String, Long> genderCountMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(genderCountMap);
	}

}
