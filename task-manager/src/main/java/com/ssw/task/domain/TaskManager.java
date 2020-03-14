package com.ssw.task.domain;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

//@EqualsAndHashCode(callSuper = true)
@Data
@TableName(value = "taskManager")
public class TaskManager extends Model<TaskManager> {
    @ApiModelProperty(value = "任务ID")
    @TableId(value = "id", type = IdType.AUTO)
    //@Column(isKey = true, length = 36)
    private Long id;

    @ApiModelProperty(value = "任务名称")
    @TableField(value = "taskName")
    private String taskName;

    @ApiModelProperty(value = "任务说明")
    @TableField(value = "taskDescription")
    private String taskDescription;


    @ApiModelProperty(value = "创建时间")
    @TableField(value = "createDate")
    private Date createDate;

    @ApiModelProperty(value = "更新时间")
    @TableField(value = "updateDate")
    private Date updateDate;

    @ApiModelProperty(value = "创建人")
    @TableField(value = "createBy")
    private String createBy;

    @ApiModelProperty(value = "更新人")
    @TableField(value = "updateBy")
    private String updateBy;

    List<String> path;

    @Override
    protected Serializable pkVal() {
        return id;
    }
}
