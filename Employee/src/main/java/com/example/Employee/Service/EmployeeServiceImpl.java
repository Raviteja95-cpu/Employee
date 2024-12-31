package com.example.Employee.Service;

import com.example.Employee.Entity.EmployeeEntity;
import com.example.Employee.Exception.EmployeeNotFoundException;
import com.example.Employee.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeEntity saveEmployeeData(EmployeeEntity employeeEntity) {
        return employeeRepository.save(employeeEntity);
    }

    @Override
    public List<EmployeeEntity> getAllEmployeeData() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<EmployeeEntity> fetchEmployeeById(long id) {
        Optional<EmployeeEntity> existingEmployee = employeeRepository.findById(id);
        if (existingEmployee.isPresent()) {
            return existingEmployee;
        } else throw new EmployeeNotFoundException("No Employee Found in the given ID. Please enter proper ID ");
//        return employeeRepository.findById(id);
    }


    @Override
    public Object[] getHighestEmployeeCountByDepartment() {
        return employeeRepository.findHighestEmployeeCountByDepartment();
    }
}
