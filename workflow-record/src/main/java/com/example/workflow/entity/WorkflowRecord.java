package com.example.workflow.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("workflow_record")
public class WorkflowRecord {

    @TableId(type = IdType.AUTO)
    private Long id;

    private String moduleId;
    private String version;
    private byte[] bytes;
    private String imgUrl;
    private String processId;
    private String processName;
    private String currentNodeId;
    private String currentNodeName;
    private LocalDateTime createTime;
    private LocalDateTime endTime;
    private String initiatorId;
    private String initiatorName;
    private String deptId;
    private String majorCategoryId;
    private String majorCategoryName;
    private String categoryId;
    private String categoryName;
    private Integer source;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
