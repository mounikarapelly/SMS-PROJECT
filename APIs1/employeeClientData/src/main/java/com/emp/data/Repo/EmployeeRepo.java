package com.emp.data.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.emp.data.model.Employee;


@Repository
public interface EmployeeRepo extends MongoRepository<Employee, Integer>{

	/*
	 * default void saveEmployee(Employee employee) {
	 * 
	 * 
	 * }
	 * 
	 * static Object findAll(int i) {
	 * 
	 * return null; }
	 */

}
