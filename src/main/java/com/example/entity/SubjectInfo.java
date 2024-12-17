package com.example.entity;

public class SubjectInfo {
    private Long subjectId;              // 学科ID
    private Integer subjectCode;         // 学科编号
    private String subjectName;          // 学科名称
    private Integer subjectLevel;        // 学科等级
    private Long parentSubjectId;        // 上级学科ID，关联自身
    private String subjectOverview;      // 学科概述
    private String subjectType;          // 学科类型
    private String remarks;              // 备注
    private Long recruitmentDirectoryId; // 招生目录ID，关联 RecruitmentQuotaDirectory

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public Integer getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(Integer subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Integer getSubjectLevel() {
        return subjectLevel;
    }

    public void setSubjectLevel(Integer subjectLevel) {
        this.subjectLevel = subjectLevel;
    }

    public Long getParentSubjectId() {
        return parentSubjectId;
    }

    public void setParentSubjectId(Long parentSubjectId) {
        this.parentSubjectId = parentSubjectId;
    }

    public String getSubjectOverview() {
        return subjectOverview;
    }

    public void setSubjectOverview(String subjectOverview) {
        this.subjectOverview = subjectOverview;
    }

    public String getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(String subjectType) {
        this.subjectType = subjectType;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Long getRecruitmentDirectoryId() {
        return recruitmentDirectoryId;
    }

    public void setRecruitmentDirectoryId(Long recruitmentDirectoryId) {
        this.recruitmentDirectoryId = recruitmentDirectoryId;
    }
}

