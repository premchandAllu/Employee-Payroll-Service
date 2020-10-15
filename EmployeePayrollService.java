package com.blz.EmployeePayrollService;

import java.util.*;

public class EmployeePayrollService {
	private List<EmployeePayrollData> EmployeePayrollList;

	public EmployeePayrollService(List<EmployeePayrollData> EmployeePayrollList) {
		this.EmployeePayrollList = EmployeePayrollList;
	}

	public static void main(String[] args) {

		ArrayList<EmployeePayrollData> EmployeePayrollList = new ArrayList<>();
		EmployeePayrollService empPayrollService = new EmployeePayrollService(EmployeePayrollList);
		Scanner consoleInputReader = new Scanner(System.in);
		empPayrollService.readEmployeePayrollData(consoleInputReader);
		empPayrollService.writeEmployeePayrollData();
	}

	private void readEmployeePayrollData(Scanner consoleInputReader) {
		System.out.println("Enter your Employee id");
		int emp_id = consoleInputReader.nextInt();
		System.out.println("Enter your Name");
		String name = consoleInputReader.next();
		System.out.println("Enter your salary");
		double salary = consoleInputReader.nextDouble();
		EmployeePayrollList.add(new EmployeePayrollData(emp_id, name, salary));
	}

	private void writeEmployeePayrollData() {
		System.out.println("Employee Payroll details are " + EmployeePayrollList);
	}
}