package com.example.stageOneTask.controllers;

import com.example.stageOneTask.dtos.request.ProjectDetailsRequest;
import com.example.stageOneTask.services.ReturnDetailsImpl;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/stageOneTask")
public class ProjectDetailsController {
    @Autowired
    private ReturnDetailsImpl returnDetails;

    @GetMapping
    public ResponseEntity<?> getProjectDetail(ProjectDetailsRequest projectDetailsRequest){
        return ResponseEntity.ok(returnDetails.getProjectDetails(projectDetailsRequest));

    }
}
