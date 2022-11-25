package net.guides.springboot.jparepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import net.guides.springboot.jparepository.model.Employee;
import net.guides.springboot.jparepository.model.Project;
import net.guides.springboot.jparepository.repository.EmployeeRepository;

@SpringBootApplication
@EnableJpaAuditing // Enabling JPA Auditing
public class Application implements CommandLineRunner {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void run(String...args) throws Exception {

        // Create an employee
        Employee employee = new Employee();
        employee.setFirstName("Ramesh");
        employee.setLastName("Fadatare");

        // Create project1
        Project project = new Project();
        project.setTitle("Employee Management System");

        // Create project2
        Project project1 = new Project();
        project1.setTitle("Content Management System");

        // employee can work on two projects,  Add project references in the employee
        employee.getProjects().add(project);
        employee.getProjects().add(project1);

        // Add employee reference in the projects
        project.getEmployees().add(employee);
        project1.getEmployees().add(employee);

        employeeRepository.save(employee);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}