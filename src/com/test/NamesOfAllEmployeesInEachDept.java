package com.test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.test.dao.EmployeeDao;

public class NamesOfAllEmployeesInEachDept {
	public static void main(String[] args) {
		List<Employee> employeeList = EmployeeDao.getEmployees();
		Map<String, List<Employee>> map = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		Map<Object, Object> namesList = map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().stream().map(Employee::getName).collect(Collectors.toList())));
		System.out.println(namesList);
		
	}

}
