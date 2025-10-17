package com.example.workflow.web.request;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class WorkflowRecordCreateRequest {

    @NotBlank
    private String moduleId;

    private String version;

    // 二选一：bytes 或 imgUrl，推荐 imgUrl
    private byte[] bytes;
    private String imgUrl;

    @NotBlank
    private String processId;
    @NotBlank
    private String processName;
    @NotBlank
    private String currentNodeId;
    @NotBlank
    private String currentNodeName;

    @NotNull
    private LocalDateTime createTime;

    private LocalDateTime endTime;

    @NotBlank
    private String initiatorId;
    @NotBlank
    private String initiatorName;
    @NotBlank
    private String deptId;
    @NotBlank
    private String majorCategoryId;
    @NotBlank
    private String majorCategoryName;
    @NotBlank
    private String categoryId;
    @NotBlank
    private String categoryName;

    @NotNull
    @Min(1)
    @Max(3)
    private Integer source;
}
