package com.example.Employee.Repository;

import com.example.Employee.Entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
    @Query("SELECT department, COUNT(course) FROM employee GROUP BY department ORDER BY COUNT(department) ASC LIMIT 1 ")
    Object[] findHighestEmployeeCountByDepartment();
}
