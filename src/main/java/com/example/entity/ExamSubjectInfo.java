package com.example.entity;

public class ExamSubjectInfo {
    private Long examSubjectId;     // 考试科目ID
    private Integer examSubjectCode; // 考试科目编号
    private String examSubjectName;  // 考试科目名称
    private Long subjectId;          // 学科ID，关联 SubjectInfo
    private String subjectDescription; // 学科描述
    private String examType;         // 考试类型

    public Long getExamSubjectId() {
        return examSubjectId;
    }

    public void setExamSubjectId(Long examSubjectId) {
        this.examSubjectId = examSubjectId;
    }

    public Integer getExamSubjectCode() {
        return examSubjectCode;
    }

    public void setExamSubjectCode(Integer examSubjectCode) {
        this.examSubjectCode = examSubjectCode;
    }

    public String getExamSubjectName() {
        return examSubjectName;
    }

    public void setExamSubjectName(String examSubjectName) {
        this.examSubjectName = examSubjectName;
    }

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectDescription() {
        return subjectDescription;
    }

    public void setSubjectDescription(String subjectDescription) {
        this.subjectDescription = subjectDescription;
    }

    public String getExamType() {
        return examType;
    }

    public void setExamType(String examType) {
        this.examType = examType;
    }
}

