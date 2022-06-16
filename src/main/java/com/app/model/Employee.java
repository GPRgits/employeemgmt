package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Employee {

	   @Id
	@GeneratedValue
	 private Integer id;
	   
	   private String name;
	    private float salary;
	    
	    public Employee() {
	    	super();
	    }
	    
	    
	    
	   public Employee(Integer id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	   
	   
	   
	  
	    
	   public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public float getSalary() {
		return salary;
	}



	public void setSalary(float salary) {
		this.salary = salary;
	}



	
}
