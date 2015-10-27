package org.softeng.project.hb_server.model;

import java.util.Date;
import java.util.UUID;

public class vendor {
	private UUID ID;
	private String name;
	private String phone;
	private String email;
	private Date last_del_date;
	
	public vendor() {
		
	}
	
	public vendor(UUID iD, String name, String phone, String email,
			Date last_del_date) {
		ID = iD;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.last_del_date = last_del_date;
	}
	public UUID getID() {
		return ID;
	}
	public void setID(UUID iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getLast_del_date() {
		return last_del_date;
	}
	public void setLast_del_date(Date last_del_date) {
		this.last_del_date = last_del_date;
	}
}
