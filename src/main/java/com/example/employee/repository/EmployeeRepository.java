//package com.example.employee.repository;
//
//import com.example.employee.model.Employee;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public interface EmployeeRepository extends JpaRepository<Employee,Long>
//{
//
//    @Query("SELECT emp FROM Employee emp")
//    public List<Employee> getAllEmployees();
//
//    @Query("SELECT emp FROM Employee emp WHERE emp.id=:id")
//    public Employee getEmployeeById(@Param("id") Long id);
//}
