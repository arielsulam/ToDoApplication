package com.sulam.todoapplication.mapper;

import com.sulam.todoapplication.persistence.entity.Task;
import com.sulam.todoapplication.persistence.entity.TaskStatus;
import com.sulam.todoapplication.service.dto.TaskInDTO;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class TaskInDTOToTask implements IMapper<TaskInDTO, Task>{

    @Override
    public Task map(TaskInDTO in){
        Task task = new Task();
        task.setTitle(in.getTitle());
        task.setDescription((in.getDescription()));
        task.setEta(in.getEta());
        task.setCreatedDate(LocalDateTime.now());
        task.setFinished(false);
        task.setTaskStatus(TaskStatus.ON_TIME);

        return task;
    }
}
