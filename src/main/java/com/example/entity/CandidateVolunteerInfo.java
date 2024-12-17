package com.example.entity;

public class CandidateVolunteerInfo {
    private Long volunteerId;       // 志愿ID
    private Long candidateId;       // 考生ID，关联 CandidateInfo
    private Integer volunteerOrder; // 志愿顺序
    private String volunteerType;   // 志愿类型
    private String name;   // 方向名称

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CandidateVolunteerInfo{" +
                "volunteerId=" + volunteerId +
                ", candidateId=" + candidateId +
                ", volunteerOrder=" + volunteerOrder +
                ", volunteerType='" + volunteerType + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

