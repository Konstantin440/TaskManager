package org.example.taskmanager.service;

import org.example.taskmanager.entity.Task;
import org.example.taskmanager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public void save(Task task) {
        taskRepository.save(task);
    }

    public Task getById(Long id) {

        return taskRepository.findById(id).orElse(null);
    }

    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    public void deleteById(String id) {
        taskRepository.deleteById(Long.parseLong(id));
    }

    public void deleteAll() {
        taskRepository.deleteAll();
    }

}
