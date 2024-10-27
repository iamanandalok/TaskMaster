package com.task_master.task_management.repository;


import com.task_master.task_management.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
    // Additional query methods, if needed
}
