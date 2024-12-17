package com.example.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
public class CandidateInfo {
    private Long candidateId;         // 考生ID
    private String name;              // 姓名
    private String gender;            // 性别
    private Date birthDate;           // 出生日期
    private String idCardNumber;      // 身份证号
    private String origin;            // 生源地
    private String undergraduateMajor; // 本科专业
    private String undergraduateSchool; // 本科学校
    private String undergraduateSchoolType; // 本科学校类型
    private String email;             // 邮箱
    private String resume;            // 个人简历
    private String admissionStatus;   // 录取状态

    public Long getCandidateId() {
        return candidateId;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getUndergraduateMajor() {
        return undergraduateMajor;
    }

    public void setUndergraduateMajor(String undergraduateMajor) {
        this.undergraduateMajor = undergraduateMajor;
    }

    public String getUndergraduateSchool() {
        return undergraduateSchool;
    }

    public void setUndergraduateSchool(String undergraduateSchool) {
        this.undergraduateSchool = undergraduateSchool;
    }

    public String getUndergraduateSchoolType() {
        return undergraduateSchoolType;
    }

    public void setUndergraduateSchoolType(String undergraduateSchoolType) {
        this.undergraduateSchoolType = undergraduateSchoolType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getAdmissionStatus() {
        return admissionStatus;
    }

    public void setAdmissionStatus(String admissionStatus) {
        this.admissionStatus = admissionStatus;
    }

    @Override
    public String toString() {
        return "CandidateInfo{" +
                "candidateId=" + candidateId +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDate=" + birthDate +
                ", idCardNumber='" + idCardNumber + '\'' +
                ", origin='" + origin + '\'' +
                ", undergraduateMajor='" + undergraduateMajor + '\'' +
                ", undergraduateSchool='" + undergraduateSchool + '\'' +
                ", undergraduateSchoolType='" + undergraduateSchoolType + '\'' +
                ", email='" + email + '\'' +
                ", resume='" + resume + '\'' +
                ", admissionStatus='" + admissionStatus + '\'' +
                '}';
    }
}

