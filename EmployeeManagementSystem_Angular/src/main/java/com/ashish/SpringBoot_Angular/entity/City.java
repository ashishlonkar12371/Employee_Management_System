package com.ashish.SpringBoot_Angular.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sbng_city")
public class City {
	
	@Id	
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique = true,nullable = false)
	private int cid;
		
	private String cname;
	
	public City() {
		// TODO Auto-generated constructor stub
	}

	public City(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "City [cid=" + cid + ", cname=" + cname + "]";
	}
	
}
