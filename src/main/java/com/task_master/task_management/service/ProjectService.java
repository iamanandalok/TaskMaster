package com.task_master.task_management.service;

import com.task_master.task_management.model.Project;
import com.task_master.task_management.model.User;

import java.util.List;
import java.util.Optional;

import java.util.List;
import java.util.Optional;

public interface ProjectService {
    Project createProject(Project project);
    Optional<Project> getProjectById(Long id);
    List<Project> getAllProjects();
    Project updateProject(Long id, Project projectDetails);
    void deleteProject(Long id);
}