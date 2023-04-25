package com.emp.data.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.emp.data.Repo.EmployeeRepo;
import com.emp.data.model.Employee;
import com.employee.exception.EmployeeRequestException;


@Service
public class EmployeeService {
	
	
	@Autowired
	private EmployeeRepo emprepository;
	
	
	 public Employee addEmployee (Employee employee ) {
	         Employee save = emprepository.save(employee);
	         return save;
	    }

	
	public List<Employee> getEmployee() {
		List<Employee> employee = emprepository.findAll();
		System.out.println("Getting data from DB : " + employee);
		return employee;
	}

	public Optional<Employee> getEmployeebyId(Integer id) {
		// Retrieving all the employees of a particular emp
		return emprepository.findById(id);
	}

	public void deleteEmployee(int id) {
		emprepository.deleteById(id);
	}
	
	
	public Optional<Employee> getEmployeeById(int id) throws EmployeeRequestException {
		/*
		 * Optional<Employee> emp; if (emprepository.findById(id).isEmpty()) {
		 * System.out.println("service test"); throw new
		 * EmployeeRequestException("employee is not found"); } else { //emp =
		 * emprepository.findById(id).get(); emp = emprepository.findById(id); } return
		 * emp;
		 */
	 return emprepository.findById(id);
	    }



}
