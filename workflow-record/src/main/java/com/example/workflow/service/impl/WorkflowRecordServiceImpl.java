package com.example.workflow.service.impl;

import com.baomidou.mybatisplus.core.toolkit.IdWorker;
import com.example.workflow.entity.WorkflowRecord;
import com.example.workflow.mapper.WorkflowRecordMapper;
import com.example.workflow.service.WorkflowRecordService;
import com.example.workflow.web.request.WorkflowRecordCreateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class WorkflowRecordServiceImpl implements WorkflowRecordService {

    private final WorkflowRecordMapper workflowRecordMapper;

    @Override
    public Long create(WorkflowRecordCreateRequest request) {
        WorkflowRecord record = new WorkflowRecord();
        record.setModuleId(request.getModuleId());
        record.setVersion(request.getVersion());
        record.setBytes(request.getBytes());
        record.setImgUrl(request.getImgUrl());
        record.setProcessId(request.getProcessId());
        record.setProcessName(request.getProcessName());
        record.setCurrentNodeId(request.getCurrentNodeId());
        record.setCurrentNodeName(request.getCurrentNodeName());
        record.setCreateTime(request.getCreateTime());
        record.setEndTime(request.getEndTime());
        record.setInitiatorId(request.getInitiatorId());
        record.setInitiatorName(request.getInitiatorName());
        record.setDeptId(request.getDeptId());
        record.setMajorCategoryId(request.getMajorCategoryId());
        record.setMajorCategoryName(request.getMajorCategoryName());
        record.setCategoryId(request.getCategoryId());
        record.setCategoryName(request.getCategoryName());
        record.setSource(request.getSource());
        LocalDateTime now = LocalDateTime.now();
        record.setCreatedAt(now);
        record.setUpdatedAt(now);
        workflowRecordMapper.insert(record);
        return record.getId();
    }

    @Override
    public WorkflowRecord getById(Long id) {
        return workflowRecordMapper.selectById(id);
    }
}
