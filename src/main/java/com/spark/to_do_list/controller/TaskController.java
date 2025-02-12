package com.spark.to_do_list.controller;

import com.spark.to_do_list.dto.TaskDTO;
import com.spark.to_do_list.dto.TaskCreateDTO;
import com.spark.to_do_list.dto.TaskUpdateDTO;
import com.spark.to_do_list.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")

public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping("/allTasks")
    public List<TaskDTO> getAllTasks() {
        return taskService.getAllTasks();
    }

    @PostMapping("/addTask")
    public TaskDTO addTask(@RequestBody TaskCreateDTO taskCreateDTO) {
        return taskService.addTask(taskCreateDTO);
    }

    @PutMapping("/updateTaskStatus")
    public TaskDTO updateTaskStatus(@RequestBody TaskUpdateDTO taskUpdateDTO) {
        return taskService.updateTaskStatus(taskUpdateDTO);
    }

    @DeleteMapping("/deleteTask/{id}")
    public String deleteTask(@PathVariable Long id) {
        boolean isDeleted = taskService.deleteTask(id);
        if (isDeleted) {
            return "Task deleted successfully.";
        } else {
            return "Task deletion failed.";
        }
    }
}
