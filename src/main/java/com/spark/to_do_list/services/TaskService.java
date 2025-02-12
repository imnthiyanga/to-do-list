package com.spark.to_do_list.services;

import com.spark.to_do_list.repository.TaskRepository;
import com.spark.to_do_list.model.Task;
import com.spark.to_do_list.dto.TaskDTO;
import com.spark.to_do_list.dto.TaskUpdateDTO;
import com.spark.to_do_list.dto.TaskCreateDTO;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.modelmapper.ModelMapper;

import java.util.List;

@Service
@Transactional
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<TaskDTO> getAllTasks() {
        List<Task> taskList = taskRepository.findAll();
        return modelMapper.map(taskList, new TypeToken<List<TaskDTO>>() {
        }.getType());
    }
  
    public TaskDTO addTask(TaskCreateDTO taskCreateDTO) {
        Task task = modelMapper.map(taskCreateDTO, Task.class);
        task = taskRepository.save(task);
        return modelMapper.map(task, TaskDTO.class);
    }

    public TaskDTO updateTaskStatus(TaskUpdateDTO taskUpdateDTO) {
        Task task = taskRepository.findById(taskUpdateDTO.getId()).orElseThrow(() -> new RuntimeException("Task not found"));
        task.setStatus(taskUpdateDTO.isStatus());
        task = taskRepository.save(task);
        return modelMapper.map(task, TaskDTO.class);
    }

    public boolean deleteTask(Long id) {
        if (taskRepository.existsById(id)) {
            taskRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}

