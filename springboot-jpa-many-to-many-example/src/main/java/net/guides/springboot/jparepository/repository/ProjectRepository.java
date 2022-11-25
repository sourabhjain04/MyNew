package net.guides.springboot.jparepository.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.guides.springboot.jparepository.model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long>{

}