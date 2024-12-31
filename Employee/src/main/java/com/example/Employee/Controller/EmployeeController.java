package com.example.Employee.Controller;

import com.example.Employee.Entity.EmployeeEntity;
import com.example.Employee.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/save")
    public ResponseEntity<String> saveEmployee(@RequestBody EmployeeEntity employeeEntity) {
        employeeService.saveEmployeeData(employeeEntity);
        return ResponseEntity.ok("Employee saved Successfully");
    }

    @GetMapping("/getAll")
    public List<EmployeeEntity> getall() {
//        return (List<EmployeeEntity>) employeeService.getAllEmployeeData();
        return employeeService.getAllEmployeeData();
    }

    @GetMapping("/fetch/{id}")
    public Optional<EmployeeEntity> getStudentById(@PathVariable long id) {
        return employeeService.fetchEmployeeById(id);
    }

    @GetMapping("highestDepartment")
    public ResponseEntity<Object[]> getHighestDepartment() {
        Object[] result = employeeService.getHighestEmployeeCountByDepartment();
        return ResponseEntity.ok(result);
    }

}
