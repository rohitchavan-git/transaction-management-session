package com.javainuse.service;

import com.javainuse.model.Employee;
import com.javainuse.model.EmployeeHealthInsurance;
import com.javainuse.service.impl.InvalidInsuranceAmountException;

public interface OrganizationService {

	public void joinOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance) throws InvalidInsuranceAmountException;

	public void leaveOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance);

}
