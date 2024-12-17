package com.example.entity;

import java.time.LocalDateTime;

public class CandidateApplicationRecord {
    private Long applicationId;       // 申请编号
    private LocalDateTime applicationTime; // 申请时间
    private String applicationStatus; // 申请状态
    private Long tutorId;             // 导师编号，关联 TutorInfo
    private String currentStage;      // 所处阶段
    private LocalDateTime updateTime; // 更新时间
    private Long candidateId;         // 考生ID，关联 CandidateInfo

    public Long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }

    public LocalDateTime getApplicationTime() {
        return applicationTime;
    }

    public void setApplicationTime(LocalDateTime applicationTime) {
        this.applicationTime = applicationTime;
    }

    public String getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(String applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    public Long getTutorId() {
        return tutorId;
    }

    public void setTutorId(Long tutorId) {
        this.tutorId = tutorId;
    }

    public String getCurrentStage() {
        return currentStage;
    }

    public void setCurrentStage(String currentStage) {
        this.currentStage = currentStage;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public Long getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(Long candidateId) {
        this.candidateId = candidateId;
    }

}
