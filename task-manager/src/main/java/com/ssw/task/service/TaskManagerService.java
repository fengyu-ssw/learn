package com.ssw.task.service;

import com.ssw.task.domain.TaskManager;
import org.springframework.stereotype.Service;

public interface TaskManagerService {
    public boolean addTask(TaskManager taskManager);
}
