package com.ashish.SpringBoot_Angular.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="sbng_employee")
public class Employee {

	@Id															//auto-increment value															
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique = true,nullable = false)														//(name="emp_id")
	private int id;
	
	@Column
	private String name;
	
	@Column
	private String department;
	
	@Column
	private int phoneno;
	
	@Column
	private String status;
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	//@JoinColumn
	private City city; 
	
	@Column
	private Date createddtm;
	
	@Column
	private String createdby;
	
	@Column
	private Date updateddtm;
	
	@Column
	private String updatedby;

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(int id, String name, String department, int phoneno, String status, City city, Date createddtm,
			String createdby, Date updateddtm, String updatedby) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.phoneno = phoneno;
		this.status = status;
		this.city = city;
		this.createddtm = createddtm;
		this.createdby = createdby;
		this.updateddtm = updateddtm;
		this.updatedby = updatedby;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public int getPhoneno() {
		return phoneno;
	}


	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public City getCity() {
		return city;
	}


	public void setCity(City city) {
		this.city = city;
	}


	public Date getCreateddtm() {
		return createddtm;
	}


	public void setCreateddtm(Date createddtm) {
		this.createddtm = createddtm;
	}


	public String getCreatedby() {
		return createdby;
	}


	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}


	public Date getUpdateddtm() {
		return updateddtm;
	}


	public void setUpdateddtm(Date updateddtm) {
		this.updateddtm = updateddtm;
	}


	public String getUpdatedby() {
		return updatedby;
	}


	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", phoneno=" + phoneno
				+ ", status=" + status + ", city=" + city + ", createddtm=" + createddtm + ", createdby=" + createdby
				+ ", updateddtm=" + updateddtm + ", updatedby=" + updatedby + "]";
	}


}
