package com.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.entity.Employee;
import com.demo.repo.EmployeeRepo;
import com.demo.service.EmployeeServiceImple;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class EmployeeServiceImpleTest {
	
	@InjectMocks
	EmployeeServiceImple employeeService;
	
	@Mock
	EmployeeRepo employeeRepo;
	
	@Test
	public void saveEmployee() {
		Employee employee=new Employee(20,"tirupati","buldhana",20777, "shreelanka");
		
		when(employeeRepo.save(employee)).thenReturn(employee);
		
	Employee	actualEmployee=employeeService.saveEmployee(employee);
	
	assertEquals(employee, actualEmployee);
	}

}
