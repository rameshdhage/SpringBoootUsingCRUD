package com.demo.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Employee;
import com.demo.repo.EmployeeRepo;

@Service
public class EmployeeServiceImple implements EmployeeService {
	
	private static final Logger logs=LoggerFactory.getLogger(EmployeeServiceImple.class);
	
	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public Employee saveEmployee(Employee emp) {
		logs.info("InsideEmployeeServiceImple method of save employee");
		Employee employee=employeeRepo.save(emp);
		
		logs.info("EmployeeServiceImple call is completed"+employee);
		return employee;
	}

	@Override
	public List<Employee> fechAll() {
		logs.info("ImployeeServiceImple method of fechAll employee");
		List<Employee> list=employeeRepo.findAll();
		logs.info("EmployeeServiceImple call is completed"+list);
		return list;
	}

	@Override
	public List<Employee> employeeByCity(String city) {
		
		logs.info("EmployeeServiceImple method of employeeByCity");
		List<Employee> listcity=employeeRepo.getByCity(city);
		logs.info("EmployeeServiceImple call is completed"+listcity);
		
				return listcity;
	}

	@Override
	public List<Employee> employeeByCountry(String country) {
		logs.info("EmployeeServiceImple method of employeeByCountry");
		
		List<Employee> listcountry=employeeRepo.getByCountry(country);
		
		logs.info("EmployeeServiceImple call is completed"+listcountry);
		
		return listcountry;
	}

	@Override
	public List<Employee> employeeByName(String name) {
		logs.info("EmployeeServiceImple method of employeeByName");
	List<Employee> namel=employeeRepo.getByName(name);
	
	logs.info("EmployeeServiceImple call is completed"+namel);
		return namel;
	}

	@Override
	public Employee fetchById(int id) {
		logs.info("EmployeeServiceImple method of fetchById");
		Employee emp=employeeRepo.findById(id);
		logs.info("EmployeeServiceImple call is completed"+emp);
		return emp;
	}

	@Override
	public void delete(int id) {
		logs.info("EmployeeServiceImple method of delete " );
		employeeRepo.deleteById(id);
		
		logs.info("EmployeeServiceImple call is completed");
	
	}

	@Override
	public List<Employee> empCity(String city) {
      List<Employee> list=employeeRepo.getEmpByCity(city);
		return list;
	}

	
	
}
