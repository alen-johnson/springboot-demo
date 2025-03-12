package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.exception.EntityNotFoundException;
import com.example.demo.respository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping
    public List<Employee> getEmployees(){
        return employeeRepository.findAll();
    }

    @GetMapping("/{employeeId}")
    public Employee getEmployee(@PathVariable String employeeId) throws IndexOutOfBoundsException{

    return employeeRepository.findById(employeeId).orElseThrow( () -> new EntityNotFoundException("Employee not found "+ employeeId));
    }

    @PostMapping
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        try {
            Employee savedEmployee = employeeRepository.save(employee);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedEmployee);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @PatchMapping("/{employeeId}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable String employeeId, @RequestBody Employee updatedEmployee) {
        return employeeRepository.findById(employeeId).map(employee -> {
            if (updatedEmployee.getName() != null) {
                employee.setName(updatedEmployee.getName());
            }
            if (updatedEmployee.getDepartment() != null) {
                employee.setDepartment(updatedEmployee.getDepartment());
            }

            Employee savedEmployee = employeeRepository.save(employee);
            return ResponseEntity.ok(savedEmployee);
        }).orElseThrow(() -> new EntityNotFoundException("Employee not found " + employeeId));
    }



    @DeleteMapping("/{employeeId}")
    public ResponseEntity<String> deleteEmployee(@PathVariable String employeeId ){
        return employeeRepository.findById(employeeId).map( employee -> {
            employeeRepository.deleteById(employeeId);
            return ResponseEntity.ok("Deleted employee : " + employee.getName());
        }).orElseThrow( () -> new EntityNotFoundException("Employee not found - " + employeeId));
    }
}
