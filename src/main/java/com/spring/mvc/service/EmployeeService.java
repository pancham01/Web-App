package com.spring.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.mvc.dao.EmployeeDao;

import javax.sql.DataSource;
import com.spring.mvc.model.Employee;

@Service
@Transactional
public class EmployeeService {

	
	@Autowired
	EmployeeDao employeeDao;
	
	
	public void saveEmployee(Employee emp) {
		System.out.println("EmployeeService.saveEmployee()");
		employeeDao.saveEmployee(emp);
	}
	
	
	
	

}
