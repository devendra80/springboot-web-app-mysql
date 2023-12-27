package org.dev.java.ems.service;

import java.util.List;

import org.dev.java.ems.dto.EmployeeDto;

public interface EmployeeService {
    public EmployeeDto createEmployee(EmployeeDto employeeDto);
    public EmployeeDto getEmployeeById(Long employeeId);
    public List<EmployeeDto> getAllEmployees();
    public EmployeeDto updateEmployee(Long employeeId, EmployeeDto updateEmployee);
    public void deleteEmployee(Long employeeId);
}
