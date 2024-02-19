package com.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

	public List<Employee> getByCity(String city);
	
	public List<Employee> getByCountry(String country);
	
	public List<Employee> getByName(String name);
	
	public Employee findById(int id);
	
	
	
	
	
}


