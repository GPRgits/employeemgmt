package com.app.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Employee;
import com.app.service.IEmployeeService;




@RestController
public class EmployeeController {
	
	
	@Autowired
	private IEmployeeService service;
  
	
	
	@GetMapping("/employees")
	public List<Employee> list() {
	    return service.getAllEmployees();
	}

	
	@PostMapping("/addingemployee")
	public void addEmployee(@RequestBody Employee e) {
	    service.save(e);
	}
	
	@GetMapping("/editemployee/{id}")
	public Employee editEmployee(@PathVariable Integer id) {
		

		return service.editEmployee(id);
	}
	
	@DeleteMapping("/deleteemployee/{id}")
	public void delete(@PathVariable Integer id) {
	    service.deleteEmployee(id);
	}
	
	
	
}
