package com.example.entity;

public class CandidateVolunteerInfo {
    private Long volunteerId;       // 志愿ID
    private Long candidateId;       // 考生ID，关联 CandidateInfo
    private Integer volunteerOrder; // 志愿顺序
    private String volunteerType;   // 志愿类型
    private Long id;

    @Override
    public String toString() {
        return "CandidateVolunteerInfo{" +
                "volunteerId=" + volunteerId +
                ", candidateId=" + candidateId +
                ", volunteerOrder=" + volunteerOrder +
                ", volunteerType='" + volunteerType + '\'' +
                ", id=" + id +
                '}';
    }

    public Long getVolunteerId() {
        return volunteerId;
    }

    public void setVolunteerId(Long volunteerId) {
        this.volunteerId = volunteerId;
    }

    public Long getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(Long candidateId) {
        this.candidateId = candidateId;
    }

    public Integer getVolunteerOrder() {
        return volunteerOrder;
    }

    public void setVolunteerOrder(Integer volunteerOrder) {
        this.volunteerOrder = volunteerOrder;
    }

    public String getVolunteerType() {
        return volunteerType;
    }

    public void setVolunteerType(String volunteerType) {
        this.volunteerType = volunteerType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

