package com.example.entity;

import java.math.BigDecimal;

public class InterviewRegistrationInfo {
    private Long registrationId;     // 登记表号

    /**
     * 考生填写部分
     */
    private String examNumber;//准考证号
    private String emergencyPhone; // 紧急联系人
    private String phone;      // 手机号
    private String retestSubject;//复试学科专业
    private String academicCategory;// 应届生/往届生/同等学力
    private String orientationCategory; // 定向生/非定向生
    private String signature;//个人签名
    private String researchDirection;//拟报考研究方向（针对计算机科学与技术）
    private Boolean acceptAdjustment; // 是否接受调剂（针对“电子信息全日制”）
    private Long candidateId;   //考生号
    /**
     * 复试组填写部分
     */
    private String comprehensiveEvaluation; // 综合评价
    private String foreignLanguage;    // 外语听力及口语
    private String professionalKnowledge; // 专业知识测试
    private String comprehensiveInterview; // 综合素质面试
    private BigDecimal totalScore;    // 总成绩
    private Long groupId;             // 小组号，关联 InterviewGroupInfo
    /**
     * 导师填写
     */
    private Long tutorId;             // 导师编号，关联 TutorInfo

    @Override
    public String toString() {
        return "InterviewRegistrationInfo{" +
                "registrationId=" + registrationId +
                ", examNumber='" + examNumber + '\'' +
                ", emergencyPhone='" + emergencyPhone + '\'' +
                ", phone='" + phone + '\'' +
                ", retestSubject='" + retestSubject + '\'' +
                ", academicCategory='" + academicCategory + '\'' +
                ", orientationCategory='" + orientationCategory + '\'' +
                ", signature='" + signature + '\'' +
                ", researchDirection='" + researchDirection + '\'' +
                ", acceptAdjustment=" + acceptAdjustment +
                ", candidateId=" + candidateId +
                ", comprehensiveEvaluation='" + comprehensiveEvaluation + '\'' +
                ", foreignLanguage='" + foreignLanguage + '\'' +
                ", professionalKnowledge='" + professionalKnowledge + '\'' +
                ", comprehensiveInterview='" + comprehensiveInterview + '\'' +
                ", totalScore=" + totalScore +
                ", groupId=" + groupId +
                ", tutorId=" + tutorId +
                '}';
    }

    public String getRetestSubject() {
        return retestSubject;
    }

    public void setRetestSubject(String retestSubject) {
        this.retestSubject = retestSubject;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getResearchDirection() {
        return researchDirection;
    }

    public void setResearchDirection(String researchDirection) {
        this.researchDirection = researchDirection;
    }

    public BigDecimal getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(BigDecimal totalScore) {
        this.totalScore = totalScore;
    }

    public Long getTutorId() {
        return tutorId;
    }

    public void setTutorId(Long tutorId) {
        this.tutorId = tutorId;
    }

    public Long getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(Long registrationId) {
        this.registrationId = registrationId;
    }

    public String getExamNumber() {
        return examNumber;
    }

    public void setExamNumber(String examNumber) {
        this.examNumber = examNumber;
    }

    public String getEmergencyPhone() {
        return emergencyPhone;
    }

    public void setEmergencyPhone(String emergencyPhone) {
        this.emergencyPhone = emergencyPhone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAcademicCategory() {
        return academicCategory;
    }

    public void setAcademicCategory(String academicCategory) {
        this.academicCategory = academicCategory;
    }

    public String getOrientationCategory() {
        return orientationCategory;
    }

    public void setOrientationCategory(String orientationCategory) {
        this.orientationCategory = orientationCategory;
    }

    public Boolean getAcceptAdjustment() {
        return acceptAdjustment;
    }

    public void setAcceptAdjustment(Boolean acceptAdjustment) {
        this.acceptAdjustment = acceptAdjustment;
    }

    public Long getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(Long candidateId) {
        this.candidateId = candidateId;
    }

    public String getComprehensiveEvaluation() {
        return comprehensiveEvaluation;
    }

    public void setComprehensiveEvaluation(String comprehensiveEvaluation) {
        this.comprehensiveEvaluation = comprehensiveEvaluation;
    }

    public String getForeignLanguage() {
        return foreignLanguage;
    }

    public void setForeignLanguage(String foreignLanguage) {
        this.foreignLanguage = foreignLanguage;
    }

    public String getProfessionalKnowledge() {
        return professionalKnowledge;
    }

    public void setProfessionalKnowledge(String professionalKnowledge) {
        this.professionalKnowledge = professionalKnowledge;
    }

    public String getComprehensiveInterview() {
        return comprehensiveInterview;
    }

    public void setComprehensiveInterview(String comprehensiveInterview) {
        this.comprehensiveInterview = comprehensiveInterview;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }
}
