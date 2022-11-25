package net.guides.springboot.jparepository.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.guides.springboot.jparepository.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}