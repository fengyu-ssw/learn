package com.ssw.task.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ssw.task.domain.TaskManager;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TaskManagerDao extends BaseMapper<TaskManager> {
}
