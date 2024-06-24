package com.demo.service;

import java.util.List;

import com.demo.entity.Employee;

public interface EmployeeService  {
	
	public  Employee saveEmployee(Employee emp);
	
	public List<Employee> fechAll();
	
	
	public List<Employee> empCity(String city);
	public List<Employee> employeeByCity(String city);
	
	public List<Employee> employeeByCountry(String country);
	
	public List<Employee> employeeByName(String name);
	
	
	public Employee fetchById(int id);
	
	public void delete(int id);
	
	

}
