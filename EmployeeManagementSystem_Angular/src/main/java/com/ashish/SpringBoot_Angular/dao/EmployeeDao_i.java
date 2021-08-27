package com.ashish.SpringBoot_Angular.dao;

import java.util.List;

import com.ashish.SpringBoot_Angular.entity.City;
import com.ashish.SpringBoot_Angular.entity.Employee;
import com.ashish.SpringBoot_Angular.entity.Register;

public interface EmployeeDao_i {

	public boolean saveEmployee(Employee employee);
	public String deleteEmployee(int id);
	public String updateEmployee(Employee employee);
	public Employee getProfile(int id);
	public List<Employee> listOfEmployee();
	public Register loginValidation(Register register);
	public List<City> getAllCountries();
}
