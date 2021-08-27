package com.ashish.SpringBoot_Angular.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ashish.SpringBoot_Angular.entity.City;
import com.ashish.SpringBoot_Angular.entity.Employee;
import com.ashish.SpringBoot_Angular.entity.Register;
import com.ashish.SpringBoot_Angular.service.EmployeeService_i;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeService_i service;

	@PostMapping(value = "/saveEmployee") // save Employee in the table:/saveEmployee -->create json id body and post it
											// (as id is primary so no passing req in json)
	public boolean saveEmployee(@RequestBody Employee employee) {
		boolean b = service.saveEmployee(employee);
		return b;

	}

	/*
	 * @DeleteMapping(value="/deleteEmployee") //delete employee from the
	 * table:/deleteEmployee?id=3 -->pass id which we want to del public boolean
	 * deleteEmployee(@RequestParam int id) { boolean b= service.deleteEmployee(id);
	 * return b;
	 * 
	 * }
	 */

	@DeleteMapping(value = "/deleteEmp/{id}")
	public String deleteEmployee(@PathVariable int id) {

		
		String msg = service.deleteEmployee(id);

		return msg;

	}

	@PutMapping(value = "/updateEmployee") // update employee from the table:/updateEmployee -->in boody update json
											// according it id which we want to update
	public String updateEmployee(@RequestBody Employee employee) {

		String msg = service.updateEmployee(employee);
		return msg;
	}

	@GetMapping(value = "/getemployeebyid/{id}") // get Employee from id:/get/2 -->get Employee acc to id
	public Employee getEmployee(@PathVariable("id") int id) {

		Employee employee = service.getProfile(id);
		return employee;
	}

	@GetMapping(value = "/listOfEmployee") // get list of Employee --->get total list
	public List<Employee> listOfEmployee() {
		List<Employee> list = service.listOfEmployee();

		return list;
	}

	@PostMapping(value = "/loginvalidation") // Login Validation from register db
	public HashMap loginValidation(@RequestBody Register register) {
		HashMap map = service.loginValidation(register);

		return map;
	}

	@GetMapping(value = "/listOfCountries") // get list of All Countries ---> get total list of Countries
	public List<City> getAllCountries() {
		List<City> list = service.getAllCountries();

		return list;
	}

}
