package com.ssw.task.service.impl;

import com.ssw.task.dao.TaskManagerDao;
import com.ssw.task.domain.TaskManager;
import com.ssw.task.service.TaskManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskManagerServiceImpl implements TaskManagerService {

    @Autowired
    private TaskManagerDao taskManagerDao;

    @Override
    public boolean addTask(TaskManager taskManager){
        List<String> path =new ArrayList<>();
        path.add("1");
        path.add("2");
        path.add("4");
        taskManager.setPath(path);
        taskManagerDao.insert(taskManager);
        return false;
    }




}
