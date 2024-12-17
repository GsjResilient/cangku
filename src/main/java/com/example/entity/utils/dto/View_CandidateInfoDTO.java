package com.example.entity.utils.dto;

public class View_CandidateInfoDTO {
    private Long registrationId;
    private Long candidateId;
    private Long groupId;
    private Long tutorId;
    private String name;
    private String examNumber;
    private String retestSubject;//复试考试专业

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Long getTutorId() {
        return tutorId;
    }

    public void setTutorId(Long tutorId) {
        this.tutorId = tutorId;
    }

    public Long getCandidateId() {
        return candidateId;
    }

    public Long getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(Long registrationId) {
        this.registrationId = registrationId;
    }

    public void setCandidateId(Long candidateId) {
        this.candidateId = candidateId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExamNumber() {
        return examNumber;
    }

    public void setExamNumber(String examNumber) {
        this.examNumber = examNumber;
    }

    public String getRetestSubject() {
        return retestSubject;
    }

    public void setRetestSubject(String retestSubject) {
        this.retestSubject = retestSubject;
    }
}
