package com.task_master.task_management.repository;

import com.task_master.task_management.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
    // Additional query methods, if needed
}
