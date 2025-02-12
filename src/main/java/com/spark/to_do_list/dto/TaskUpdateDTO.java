package com.spark.to_do_list.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class TaskUpdateDTO {
    private Long id;
    private boolean status;
}
