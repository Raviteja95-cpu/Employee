package com.example.Employee.Service;

import com.example.Employee.Entity.EmployeeEntity;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    EmployeeEntity saveEmployeeData(EmployeeEntity employeeEntity);

    public List<EmployeeEntity> getAllEmployeeData();

    Optional<EmployeeEntity> fetchEmployeeById(long id);

    Object[] getHighestEmployeeCountByDepartment();
}
