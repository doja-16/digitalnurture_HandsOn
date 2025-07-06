package com.cognizant.ormlearn2;

import com.cognizant.ormlearn2.model.Employee;
import com.cognizant.ormlearn2.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ormlearn2Application implements CommandLineRunner {

    @Autowired
    private EmployeeService employeeService;

    public static void main(String[] args) {
        SpringApplication.run(Ormlearn2Application.class, args);
    }

    @Override
    public void run(String... args) {
        Employee employee = new Employee("Dona", "IT");
        employeeService.addEmployee(employee);
    }
}
