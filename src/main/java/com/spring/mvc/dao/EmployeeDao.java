package com.spring.mvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.mvc.model.Employee;

@Repository
public class EmployeeDao {
	
	@Autowired
    private final HibernateTemplate hibernateTemplate;

    public EmployeeDao(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    
    
    public void saveEmployee(Employee emp) {
		// TODO Auto-generated method stub
		System.out.println("EmployeeDao.saveEmployee()");

		hibernateTemplate.save(emp);
		
	}
	

}
