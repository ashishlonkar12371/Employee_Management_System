package com.ashish.SpringBoot_Angular.service;

import java.util.HashMap;
import java.util.List;

import com.ashish.SpringBoot_Angular.entity.City;
import com.ashish.SpringBoot_Angular.entity.Employee;
import com.ashish.SpringBoot_Angular.entity.Register;

public interface EmployeeService_i {
	
	public boolean saveEmployee(Employee employee);
	public String deleteEmployee(int id);
	public String updateEmployee(Employee employee);
	public Employee getProfile(int id);
	public List<Employee> listOfEmployee();
	public HashMap loginValidation(Register register);
	public List<City> getAllCountries();
}
