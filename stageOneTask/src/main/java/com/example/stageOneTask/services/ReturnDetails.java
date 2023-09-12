package com.example.stageOneTask.services;

import com.example.stageOneTask.dtos.request.ProjectDetailsRequest;
import com.example.stageOneTask.dtos.response.ProjectDetailResponse;

public interface ReturnDetails {
    ProjectDetailResponse getProjectDetails(ProjectDetailsRequest projectDetailsRequest);
}
