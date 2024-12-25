package org.example.taskmanager.controller;


import org.example.taskmanager.entity.Task;
import org.example.taskmanager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class TaskController {
    @Autowired
    private TaskService taskService;
    @PostMapping("/")
    public Task addTask(@RequestBody Task task){
        return taskService.save(task);
    }

    @DeleteMapping("/deleteTask")
    public void deleteByIdTask(Task task){
        taskService.deleteTask(task);
    }

    @DeleteMapping("/deleteAllTasks")
    public void deleteAllTasks(){
        taskService.deleteAll();
    }

    @GetMapping("/getAllTasks")
    public List<Task> getAllTasks(){
        return taskService.findAll();

    }
    @GetMapping("/getTaskById")
    public Task getTaskById(@RequestParam Long id){
        return taskService.getById(id);
    }

    @PutMapping("/updateTask")
    public Task updateTask(@RequestBody Task task,Long id){
        return taskService.updateTask(id, task);
    }


}
