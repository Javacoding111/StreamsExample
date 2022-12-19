package com.test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.test.dao.EmployeeDao;

public class AverageAgeOfFemaleAndMaleEmployees {
	public static void main(String[] args) {
		List<Employee> employeeList = EmployeeDao.getEmployees();
//		Map<String, List<Employee>> genderMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender));
//		Map<Object, Object> avgSalaryMap = genderMap.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().stream().map(Employee::getAge).mapToDouble(Double::valueOf).average().getAsDouble()));
//		System.out.println(avgSalaryMap);
		
		//approach2
		Map<String, Double> map = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println(map);
	}

}
