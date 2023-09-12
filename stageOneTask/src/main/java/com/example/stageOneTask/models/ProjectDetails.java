package com.example.stageOneTask.models;


import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Data
@Document
public class ProjectDetails {
    private String projectDetailsId;
    private String slackName;
    private String currentDay;
    private LocalDateTime currentTime;

    private String track;
    private String gitHubFileUrl;
    private String gitHubRepoUrl;
    private int status;


}
