package com.vision.mongodb.application.service;

import java.util.List;

import com.vision.mongodb.application.documents.Employee;

public interface IEmployeeService {

	  public List<Employee> getAllEmployees();
	  public void saveEmployee(Employee employee);
	  public void updateEmployee(Employee employee);
	  public void deleteEmployee(String employeeId);
	
}
