package com.spring.mvc.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.mvc.model.Employee;

@Controller
@ResponseBody // @RestController
public class EmployeeController {
	
	private static int empId = 0;
	
	
	static Map<Integer,Employee> employeeMap = new HashMap<>();
	
	static {
		
		employeeMap.put(++empId, new Employee(empId, "Ashish", "Java", "Noida"));
		employeeMap.put(++empId, new Employee(empId, "Vikas", "Java", "Noida"));
		employeeMap.put(++empId, new Employee(empId, "Anoop", "Java", "Noida"));
		employeeMap.put(++empId, new Employee(empId, "Ashish", "Java", "Noida"));
		employeeMap.put(++empId, new Employee(empId, "Dheeraj", "Java", "Noida"));
		employeeMap.put(++empId, new Employee(empId, "Kunal", "Java", "Noida"));
	}
	
	
	
	
	@GetMapping("/")
	public String getData()
	{
		System.out.println("EmployeeController.getData()");
		
		return "Hello This is my first RestApi";
	}
	
	
	@GetMapping("/getEmp")
	public Employee getDummyObj()
	{
		System.out.println("EmployeeController.getDummyObj()");
		Employee e = new Employee(1,"Dummy", "CS","NOIDA");
		
		return e;
	}
	
	
	@GetMapping("/getEmpById/{id}")
	public Employee getEmpById(@PathVariable("id") int id)
	{
		System.out.println("EmployeeController.getEmpById()");
		
		
		
		return employeeMap.get(id);
	}
	
	
	@GetMapping("/getAllEmp")
	public Map<Integer,Employee> getAllEmp()
	{
		System.out.println("EmployeeController.getAllEmp()");
		return employeeMap;
	}
	
	@PostMapping("/createEmp")
	public Employee createEmployee(@RequestBody Employee employee) {
		
		employee.setId(++empId);
		
		employeeMap.put(employee.getId(), employee);
		
		System.out.println("EmployeeController.createEmployee()");
		
		return employee;
		
	}
	
	
}
