package com.rbs.backendspringboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rbs.backendspringboot.model.Employee;
import com.rbs.backendspringboot.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;
	  
	  
	  //Employee emp2 = new Employee("Chuck","Bruson");
	  
	
	/*private List<Employee> employees = new ArrayList <> ( 
			Arrays.asList(
		new Employee(5,"Ahmed","ALSALIH","Mooresvile","123456789"),
		new Employee(1,"Mae","Forbes","Charlotte","123456789"),
		new Employee(2,"Sean","Fallmann","somwhere","123456789"),
		new Employee(3,"Aaron","Broom","Concord","123456789"),
		new Employee(4,"Brian","Lindner","Mooresvile","123456789")
		
			));*/
	
	public List<Employee> getAllEmployees(){
		// return this.employees;
		return (List<Employee>) employeeRepository.findAll();
		}
		

}
