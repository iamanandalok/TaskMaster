package com.task_master.task_management.repository;


import com.task_master.task_management.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    // Additional query methods, if needed
}