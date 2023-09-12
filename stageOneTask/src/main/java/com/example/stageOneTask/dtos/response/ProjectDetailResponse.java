package com.example.stageOneTask.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class ProjectDetailResponse {
    private String slackName;
    private String currentDay;
    private LocalDateTime currentTime;

    private String track;
    private String gitHubFileUrl;
    private String gitHubRepoUrl;

    private int statusCode;
}
