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

    public Task save(Task task) {
        return taskRepository.save(task);
    }

    public Task getById(Long id) {

        return taskRepository.findById(id).orElse(null);
    }

    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    public void deleteTask(Task task) {
        taskRepository.delete(task);
    }


    public Task updateTask(Long id, Task updatedTask) {
        Task existingTask = taskRepository.getById(id);

        existingTask.setNameTask(updatedTask.getNameTask());
        existingTask.setDescription(updatedTask.getDescription());

        return taskRepository.save(existingTask);
    }

    public void deleteAll() {
        taskRepository.deleteAll();
    }

}
