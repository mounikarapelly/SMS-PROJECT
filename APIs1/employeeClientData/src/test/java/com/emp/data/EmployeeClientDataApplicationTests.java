package com.emp.data;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.emp.data.Repo.EmployeeRepo;
import com.emp.data.model.Employee;
import com.emp.data.service.EmployeeService;


@SpringBootTest
class EmployeeClientDataApplicationTests {
	
	@Autowired
	private EmployeeService empService;

	@MockBean
	private EmployeeRepo  empRepository;
	
	
	 @Test
	 void contextLoads() { 
		 
	 }
	 
	//@SuppressWarnings("static-access")
	@Test
	public void saveEmployee () {
		Employee e = new Employee(1, "sasi", 15, 1000000);
		e.setEmployeeId(1);
		e.setEmployeeName("mmm");
		e.setSalary(12000);
		e.setExperience(1);
		empRepository.save(e);
		
	}
	
	/*
	 * @Test
	 * 
	 * @Order(2) public void getEmployee() { List<Employee> list
	 * =empRepository.findAll(); assertThat(list).size().isGreaterThan(0); }
	 */
	
	 @Test
	  public void saveEmployeeTest() { 
	  Employee employee = new Employee(1,"aa",12000,1);
	  
	  when(empRepository.save(employee)).thenReturn(employee);
	  assertEquals(employee, empService.addEmployee(employee));
	  
	  }
	 
	
}
