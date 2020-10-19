package com.blz.EmployeePayrollService;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import com.blz.EmployeePayrollService.EmployeePayrollService.IOService;

public class EmployeePayrollServiceTest {

	@Test
	public void gievn3EmployeesShouldMatchEmployeeEntries() {
		EmployeePayrollData[] arrayOfEmployee = { new EmployeePayrollData(1, "prem", 100000.0),
				new EmployeePayrollData(2, "chand", 200000.0), new EmployeePayrollData(3, "bhanu", 300000.0) };
		EmployeePayrollService employeePayrollService;
		employeePayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmployee));
		employeePayrollService.writeEmployeePayrollData(IOService.FILE_IO);
		employeePayrollService.printData(IOService.FILE_IO);
		long entries = employeePayrollService.countEntries(IOService.FILE_IO);
		Assert.assertEquals(3, entries);
	}

}