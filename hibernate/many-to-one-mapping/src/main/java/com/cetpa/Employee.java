package com.cetpa;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Employee 
{
	@Id
	@GeneratedValue(generator = "employee_sequence")
	@SequenceGenerator(name = "employee_sequence",initialValue = 101,allocationSize = 1)
	private int eid;
	private String name;
	private String phone;
	private String address;
	private int salary;
	@ManyToOne(cascade = CascadeType.ALL)
	private Department department;
	public Employee() {}
	public Employee(String name, String phone, String address,int salary,Department department) 
	{
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.salary=salary;
		this.department=department;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
}
