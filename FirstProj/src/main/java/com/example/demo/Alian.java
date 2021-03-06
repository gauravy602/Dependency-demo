package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component 
public class Alian {
	private int aid;
	private String aname;
	private String tech;
	@Autowired
	@Qualifier("lap")
	private Laptop l;
	 public Alian() {
		 System.out.println("Alian Object created");
	 }
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	public void show() {
		System.out.println("SHOW CALLED");
		l.toString();		
	}

}
