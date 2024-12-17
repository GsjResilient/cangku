package com.example.entity;

public class TutorInfo {
    private Long tutorId;             // 导师编号
    private String tutorName;          // 导师姓名
    private String tutorTitle;         // 导师职称
    private String tutorPhoto;         // 导师照片
    private String tutorPhone;         // 导师电话
    private String tutorIntroduction;  // 导师简介
    private String tutorEmail;         // 导师邮箱
    private Boolean recruitmentStatus; // 招生资格状态

    public Long getTutorId() {
        return tutorId;
    }

    public void setTutorId(Long tutorId) {
        this.tutorId = tutorId;
    }

    public String getTutorName() {
        return tutorName;
    }

    public void setTutorName(String tutorName) {
        this.tutorName = tutorName;
    }

    public String getTutorTitle() {
        return tutorTitle;
    }

    public void setTutorTitle(String tutorTitle) {
        this.tutorTitle = tutorTitle;
    }

    public String getTutorPhoto() {
        return tutorPhoto;
    }

    public void setTutorPhoto(String tutorPhoto) {
        this.tutorPhoto = tutorPhoto;
    }

    public String getTutorPhone() {
        return tutorPhone;
    }

    public void setTutorPhone(String tutorPhone) {
        this.tutorPhone = tutorPhone;
    }

    public String getTutorIntroduction() {
        return tutorIntroduction;
    }

    public void setTutorIntroduction(String tutorIntroduction) {
        this.tutorIntroduction = tutorIntroduction;
    }

    public String getTutorEmail() {
        return tutorEmail;
    }

    public void setTutorEmail(String tutorEmail) {
        this.tutorEmail = tutorEmail;
    }

    public Boolean getRecruitmentStatus() {
        return recruitmentStatus;
    }

    public void setRecruitmentStatus(Boolean recruitmentStatus) {
        this.recruitmentStatus = recruitmentStatus;
    }
}
