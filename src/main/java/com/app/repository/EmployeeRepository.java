package com.app.repository;
import org.springframework.data.jpa.repository.*;

import com.app.model.Employee;
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
