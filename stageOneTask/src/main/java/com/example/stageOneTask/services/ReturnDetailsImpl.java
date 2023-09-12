package com.example.stageOneTask.services;

import com.example.stageOneTask.dtos.request.ProjectDetailsRequest;
import com.example.stageOneTask.dtos.response.ProjectDetailResponse;
import com.example.stageOneTask.models.ProjectDetails;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.DayOfWeek;

@Service

public class ReturnDetailsImpl implements ReturnDetails{

    @Override
    public ProjectDetailResponse getProjectDetails(ProjectDetailsRequest projectDetailsRequest) {
    ProjectDetailResponse projectDetails = new ProjectDetailResponse();
    projectDetails.setSlackName("stageOneTask");
        LocalDate currentDate = LocalDate.now();
        DayOfWeek dayOfWeek = currentDate.getDayOfWeek();
        projectDetails.setCurrentDay(dayOfWeek.toString());
        projectDetails.setCurrentTime(LocalDateTime.now());
        projectDetails.setTrack("Backend");
        projectDetails.setGitHubFileUrl("C:\\Users\\ROBERTECH\\Downloads\\stageOneTask");
        projectDetails.setGitHubRepoUrl("https://github.com/okonkwoobele/stageOneTask.git");
        projectDetails.setStatusCode(200);
        return projectDetails;
    }
}
