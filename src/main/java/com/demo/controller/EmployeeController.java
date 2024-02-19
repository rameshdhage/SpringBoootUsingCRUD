package com.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Employee;
import com.demo.service.EmployeeServiceImple;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceImple employeeServiceImple;
	
	private static final Logger logs=LoggerFactory.getLogger(EmployeeController.class);
	
	
	@PostMapping("/save")
	public ResponseEntity<Employee>saveEmp(@RequestBody Employee emp){
		logs.info("Inside EmployeeController method of saveEmp" );
		Employee emp1=employeeServiceImple.saveEmployee(emp);
		
		logs.info("EmployeeController call is completed"+emp1);
		return ResponseEntity.ok().body(emp1);
		
		
	}
	
	
	@GetMapping("/getallemployee")
	public  List<Employee>getAllEmployee(){
		logs.info("Inside EmployeeController method of getAllEmployee");
		
		List<Employee>  empList=employeeServiceImple.fechAll();

		logs.info("EmployeeController call is completed"+empList);
		
		return empList;
	}
	
	@GetMapping("/empbycity/{city}")
	public List<Employee> empByCityList(@PathVariable String city){
		logs.info("Inside EmployeeController method of empByCityList");
		List<Employee> empListcity=employeeServiceImple.employeeByCity(city);
		

		logs.info("EmployeeController call is completed"+empListcity);
		return empListcity;
	}
	
	
	@GetMapping("/empbycountry/{country}")
	public List<Employee> empByCountryList(@PathVariable String country){
		logs.info("Inside EmployeeController method of empByCountryList");
		List<Employee> empListcountry=employeeServiceImple.employeeByCountry(country);
		

		logs.info("EmployeeController call is completed"+empListcountry);
		return empListcountry;
	}
	
	
	@GetMapping("/empbyname/{name}")
	public List<Employee>empByNameList(@PathVariable String name){
		logs.info("Inside EmployeeController method of empByName");
		
		List<Employee> empName=employeeServiceImple.employeeByName(name);
		

		logs.info("EmployeeController call is completed"+empName);
		return empName;
	}
	
	@GetMapping("/empbyid/{id}")
	public Employee getById(@PathVariable int id) {
		logs.info("Inside EmployeeController method of getById" );
		
		Employee emp1=employeeServiceImple.fetchById(id);

		logs.info("EmployeeController call is completed"+emp1);
		return emp1;
	}
	
	@GetMapping("/deleteById/{id}")
	public String deleteById(@PathVariable int id) {
		logs.info("Inside EmployeeController method of deleteById" );
		employeeServiceImple.delete(id);
		

		logs.info("EmployeeController call is completed");
		return "Employee deleted succesfully";
	}

	
	
}














