package com.spark.to_do_list.repository;

import com.spark.to_do_list.model.Task;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    

}
