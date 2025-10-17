package com.example.workflow.web.controller;

import com.example.workflow.entity.WorkflowRecord;
import com.example.workflow.service.WorkflowRecordService;
import com.example.workflow.web.request.WorkflowRecordCreateRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/workflow-records")
@RequiredArgsConstructor
public class WorkflowRecordController {

    private final WorkflowRecordService workflowRecordService;

    @PostMapping
    public ResponseEntity<Long> create(@Valid @RequestBody WorkflowRecordCreateRequest request) {
        Long id = workflowRecordService.create(request);
        return ResponseEntity.ok(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<WorkflowRecord> get(@PathVariable Long id) {
        WorkflowRecord record = workflowRecordService.getById(id);
        if (record == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(record);
    }
}
