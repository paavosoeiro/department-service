package com.kowalski.api.department.fallback;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.kowalski.api.department.client.EmployeeClient;
import com.kowalski.api.department.model.Employee;

@Component
public class EmployeeFallback implements EmployeeClient {

	@Override
	public List<Employee> findByDepartment(Long departmentId) {
		List<Employee> emp = new ArrayList<>();
		return emp;
	}

}
