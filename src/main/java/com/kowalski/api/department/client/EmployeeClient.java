package com.kowalski.api.department.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.kowalski.api.department.fallback.EmployeeFallback;
import com.kowalski.api.department.model.Employee;

@FeignClient(name = "employee-service", fallback = EmployeeFallback.class)
public interface EmployeeClient {

	@GetMapping("/department/{departmentId}")
	List<Employee> findByDepartment(@PathVariable("departmentId") Long departmentId);
}
