package com.task_master.task_management.service;

import com.task_master.task_management.model.Task;
import com.task_master.task_management.model.User;

import java.util.List;
import java.util.Optional;

public interface TaskService {
    Task createTask(Task task);
    Optional<Task> getTaskById(Long id);
    List<Task> getAllTasks();
    Task updateTask(Long id, Task taskDetails);
    void deleteTask(Long id);
}