package com.hinduja;

public class Employee {
	
	
	private int id;
	private String name;
	private String dept;
	private String designation;
	private float salary;
	private String doj;
	
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", designation=" + designation + ", salary="
				+ salary + ", doj=" + doj + "]";
	}
	
	
	
	
}
