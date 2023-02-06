package com.axis;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.axis.entity.Employee;
import com.axis.repository.EmployeeRepository;

@SpringBootApplication
public class SpringdatajpaApplication implements CommandLineRunner{
	EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringdatajpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Employee employee= new Employee();
		employee.setId(1);
		employee.setName("Sarvesh");
		employee.setDept("hr");
		employee.setAge(24);
		employee.setSalary(7000000);
		
		employeeRepository.save(employee);
		
		
		
		
	}
	
	
	

}


