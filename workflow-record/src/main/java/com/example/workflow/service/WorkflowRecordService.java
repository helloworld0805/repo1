package com.example.workflow.service;

import com.example.workflow.entity.WorkflowRecord;
import com.example.workflow.web.request.WorkflowRecordCreateRequest;

public interface WorkflowRecordService {
    Long create(WorkflowRecordCreateRequest request);
    WorkflowRecord getById(Long id);
}
