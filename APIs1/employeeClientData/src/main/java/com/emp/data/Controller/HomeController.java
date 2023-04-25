package com.emp.data.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.emp.data.model.Employee;
import com.emp.data.service.EmployeeService;


@Controller
public class HomeController {
	@Autowired
	private EmployeeService empservice;
	
	/*
	 * @RequestMapping("/login")
	 * 
	 * public String loginjsp() { return "login";
	 * 
	 * }
	 */
	
	@RequestMapping(value ="/login", method = RequestMethod.GET)
	public String LoginPage() {

		return "login";

	}

	@RequestMapping(value ="/login", method = RequestMethod.POST)
	public String welcomePage( @RequestParam int employeeId,
	 @RequestParam String employeeName,@RequestParam int salary,
	 @RequestParam int experience, ModelMap model) {

		
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
		
		
		
		  System.out.println("================>"+salary);
		  System.out.println("================>"+increment);
		  
		 
		    model.put("employeeId", employeeId);
	        model.put("employeeName", employeeName);
	        model.put("salary", salary);
	        model.put("experience", experience);
	        Employee employee = new Employee(employeeId, employeeName, salary, experience);
	        empservice.addEmployee(employee);

		 return "welcome";
	  }


	
	
	
	
	  
	 
}
