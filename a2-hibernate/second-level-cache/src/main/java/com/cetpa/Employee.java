package com.cetpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="employeeinfo")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Employee 
{
	@Id
	@Column(name="eid")
	private int eid;
	@Column(name = "name")
	private String name;
	@Column(name = "department")
	private String department;
	@Column(name = "salary")
	private int salary;
	public Employee() {}
	public Employee(int eid, String name, String department, int salary) 
	{
		this.eid = eid;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String toString() 
	{
		return "Employee [eid=" + eid + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
}
