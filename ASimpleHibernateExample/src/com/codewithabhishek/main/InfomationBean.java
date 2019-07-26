package com.codewithabhishek.main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


public class InfomationBean {


	private String name;

	private String lname;

	private String  ph;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getPh() {
		return ph;
	}
	public void setPh(String ph) {
		this.ph = ph;
	}
	
	
	
	
	
}
