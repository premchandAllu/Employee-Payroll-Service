package com.blz.EmployeePayrollService;

public class EmployeePayrollData {

	private int emp_id;
	private String name;
	private double salary;

	public EmployeePayrollData(int emp_id, String name, Double salary) {
		this.emp_id = emp_id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeePayrollData [emp_id =" + emp_id + ", name=" + name + ", salary=" + salary + "]";
	}
}
