package com.ssw.task.controller;

import com.ssw.task.domain.TaskManager;
import com.ssw.task.service.TaskManagerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

//Swagger2的注解，表明这个Controller的作用
@Api(tags = {"任务管理"})
//日志注解
@Slf4j
//数据验证注解
@Validated
@RestController
public class TaskManagerController {

    @Autowired
    private TaskManagerService taskManagerService;

    @ApiOperation("任务管理-添加")
    @PostMapping("/task-manager")
    public String addTask(TaskManager taskManager){
        taskManagerService.addTask(taskManager);
        return "1";
    }
}
