package com.arms.app.task;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Data;

@Data
public class TaskForm {

    private int id;
    
    @NotEmpty
    private String name;

    private int projectId;
    
}