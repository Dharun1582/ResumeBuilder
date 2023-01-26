package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.models.Projects;

public interface ProjectsRepository extends JpaRepository<Projects, Integer>{

}


