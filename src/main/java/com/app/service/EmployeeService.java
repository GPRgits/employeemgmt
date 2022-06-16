
package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Employee;
import com.app.repository.EmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService {
	
	
	@Autowired
	private EmployeeRepository repo;

	@Override
	public List<Employee> getAllEmployees() {
		
		return repo.findAll();
		
	}
	

	@Override
	public void save(Employee e) {
		 repo.save(e);
	}


	@Override
	public Employee editEmployee(Integer id) {
		Optional<Employee> findById=repo.findById(id);
    	if(findById.isPresent()){
    		Employee empObj=findById.get();
    		
    		return empObj;
    	}	

	   return null;

	}


	 


	@Override
	public void deleteEmployee(Integer id) {
		repo.deleteById(id);
		
	}
	
	
	
	
	
	
	
	
	
}