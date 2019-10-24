package com.javainuse.service;

import com.javainuse.model.EmployeeHealthInsurance;
import com.javainuse.service.impl.InvalidInsuranceAmountException;

public interface HealthInsuranceService {
	void registerEmployeeHealthInsurance(EmployeeHealthInsurance employeeHealthInsurance)
			throws InvalidInsuranceAmountException;

	void deleteEmployeeHealthInsuranceById(String empid);
}