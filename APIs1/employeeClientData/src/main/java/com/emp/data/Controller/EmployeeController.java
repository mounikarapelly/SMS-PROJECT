package com.emp.data.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.data.Repo.EmployeeRepo;
import com.emp.data.model.Employee;
import com.emp.data.service.EmployeeService;
import com.employee.exception.EmployeeRequestException;


@RestController

public class EmployeeController {
	
	@Autowired
	private EmployeeRepo  empRepository;
	
	@Autowired
	private EmployeeService empservice;
	
	 @PostMapping("/addEmployee")
	  public String saveEmployee(@RequestBody Employee emp){ 
		 int employeeId = emp.getEmployeeId();
		 String employeeName = emp.getEmployeeName();
		 int salary = emp.getSalary();
		 int experience = emp.getExperience();
		 System.out.println("===>"+salary);
		 
		 int increment=0;
			if ((experience >=1) && (experience <=5)) {
				  //incrementing salary 15%
				    increment = (salary * 15)/100;
					  
				   salary =  (salary+increment); 
			
			}
			else if ((experience>=6) && (experience <=10)){
			    // incrementing salary  30%
				  increment = (salary * 30)/100;
				salary = salary+increment;

				 }
				  else if ((experience >=11) && (experience <=15)){
					  //incrementing salary 40%
					   increment =(salary * 40)/100;
					  salary = salary+increment;
				  }
		 
		 
		 
		 
		 Employee employee = new Employee(employeeId, employeeName, salary, experience);
		 
		 //empRepository.save(employee);
		 empservice.addEmployee(employee);
		 
		 
		  return "Added Employee with id :" + employeeId;
	  
		  }
	 
	 @GetMapping("/findAllEmployees") 
	 public List<Employee> getEmployees(@RequestBody Employee emp) { 
		
		return empservice.getEmployee(); 
		 }
	  
	  @GetMapping("/findAllEmployees/{id}") 
	  public Optional<Employee> getEmployee(@PathVariable int id)
	   { 
		  return empservice.getEmployeeById(id) ;
		  }
	  
	  @DeleteMapping("/deleteEmployee/{id}") 
	  public String deleteEmp(@PathVariable int id)
	   { 
		  empservice.deleteEmployee(id);
		  return "employee delete with id :" +id;
	   }
	  
	  
	  @GetMapping("emp/{id}")
	    public ResponseEntity getEmployeById(@PathVariable("id") int id) throws EmployeeRequestException{
	        return new ResponseEntity(empservice.getEmployeeById(id), HttpStatus.OK);
	    }
	 
	  @GetMapping("/employee/{id}")
	  public Optional<Employee> getEmployeeById(@PathVariable("id") int id) throws EmployeeRequestException {
			/*
			 * Optional<Employee> emp; if (emprepository.findById(id).isEmpty()) {
			 * System.out.println("service test"); throw new
			 * EmployeeRequestException("employee is not found"); } else { //emp =
			 * emprepository.findById(id).get(); emp = emprepository.findById(id); } return
			 * emp;
			 */
		 return empservice.getEmployeeById(id);
		    }
	  
	  
}