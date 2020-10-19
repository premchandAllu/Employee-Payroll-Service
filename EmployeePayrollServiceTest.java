package com.blz.EmployeePayrollService;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import com.blz.EmployeePayrollService.EmployeePayrollService.IOService;

public class EmployeePayrollServiceTest {

	@Test
	public void given3EmployeesShouldMatchEmployeeEntries() {
		EmployeePayrollData[] arrayOfEmployee = { new EmployeePayrollData(1, "prem", 100000.0),
				new EmployeePayrollData(2, "chand", 200000.0), new EmployeePayrollData(3, "bhanu", 300000.0) };
		new EmployeePayrollService();
		new EmployeePayrollService(Arrays.asList(arrayOfEmployee));
	}

	@Test
	public void writePayrollOnFile() {
		EmployeePayrollData[] arrayOfEmployee = { new EmployeePayrollData(1, "prem", 100000.0),
				new EmployeePayrollData(2, "chand", 200000.0), new EmployeePayrollData(3, "bhanu", 300000.0) };
		EmployeePayrollService employeePayrollService = new EmployeePayrollService();
		;
		employeePayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmployee));
		employeePayrollService.writeEmployeePayrollData(IOService.FILE_IO);
	}

	@Test
	public void countEntries() {
		EmployeePayrollData[] arrayOfEmployee = { new EmployeePayrollData(1, "prem", 100000.0),
				new EmployeePayrollData(2, "chand", 200000.0), new EmployeePayrollData(3, "bhanu", 300000.0) };
		EmployeePayrollService employeePayrollService = new EmployeePayrollService();
		;
		employeePayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmployee));
		long entries = employeePayrollService.countEntries(IOService.FILE_IO);
		Assert.assertEquals(3, entries);
	}

	@Test
	public void givenFileOnReadingFileShouldMatchEmployeeCount() {
		EmployeePayrollService employeePayrollService = new EmployeePayrollService();
		employeePayrollService.readPayrollData(IOService.FILE_IO);
	}
}