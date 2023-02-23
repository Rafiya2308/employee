//package com.example.employee.service;
//
//
//import com.example.employee.exception.RecordNotFound;
//import com.example.employee.model.Employee;
//import com.example.employee.repository.EmployeeRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class EmployeeService {
//
//    @Autowired
//    private EmployeeRepository employeeRepository;
//    public List<Employee> getAllEmployees() {
////        List<Employee> empList = employeeRepository.findAll();
////        System.out.print("empList "+empList);
//        List<Employee> empList = employeeRepository.getAllEmployees();
//        System.out.print("empList "+empList);
//        return  empList;
//    }
//
//    public Employee getEmployeeById(Long id) {
//       Employee emp = employeeRepository.getEmployeeById(id);
//        if(emp==null){
//            throw new RecordNotFound("No employee exist");
//        }
//        return emp;
//    }
//
//    public Employee saveEmployee(Employee employee) {
//        Employee emp = employeeRepository.save(employee);
//        return emp;
//    }
//}
