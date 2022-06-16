package com.app.service;

import java.util.List;


import com.app.model.Employee;

public interface IEmployeeService {
	
	
	
	 public List<Employee> getAllEmployees();

	 public void save(Employee e);
	 
	 
	 public Employee editEmployee(Integer id);
	
	
     public void deleteEmployee(Integer id);
     


}