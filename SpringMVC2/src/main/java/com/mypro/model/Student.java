package com.mypro.model;

import org.springframework.stereotype.Component;

@Component
public class Student {

	private int rollno=1;
	private String name="Praveen";
	private String HQual="MCA";
	private int exp=6;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHQual() {
		return HQual;
	}
	public void setHQual(String hQual) {
		HQual = hQual;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", HQual=" + HQual + ", exp=" + exp + "]";
	}
	
	
}
