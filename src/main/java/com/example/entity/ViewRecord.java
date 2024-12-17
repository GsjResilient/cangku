package com.example.entity;

import java.time.LocalDateTime;

public class ViewRecord {
    private Long viewId;         // 查看ID
    private Long tutorId;        // 导师编号，关联 TutorInfo
    private Long applicationId;  // 申请编号，关联 CandidateApplicationRecord
    private LocalDateTime viewTime; // 查看时间
    private String viewRemarks;  // 查看备注

    public Long getViewId() {
        return viewId;
    }

    public void setViewId(Long viewId) {
        this.viewId = viewId;
    }

    public Long getTutorId() {
        return tutorId;
    }

    public void setTutorId(Long tutorId) {
        this.tutorId = tutorId;
    }

    public Long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }

    public LocalDateTime getViewTime() {
        return viewTime;
    }

    public void setViewTime(LocalDateTime viewTime) {
        this.viewTime = viewTime;
    }

    public String getViewRemarks() {
        return viewRemarks;
    }

    public void setViewRemarks(String viewRemarks) {
        this.viewRemarks = viewRemarks;
    }
}
