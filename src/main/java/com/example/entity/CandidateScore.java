package com.example.entity;

import java.math.BigDecimal;

public class CandidateScore {
    private Long scoreId;        // 成绩编号
    private String type;         // 类型
    private BigDecimal score;    // 分数
    private String scoreStatus;  // 成绩状态
    private Long candidateId;    // 考生ID，关联 CandidateInfo
    private Long examSubjectId;//考试科目ID

    public Long getExamSubjectId() {
        return examSubjectId;
    }

    public void setExamSubjectId(Long examSubjectId) {
        this.examSubjectId = examSubjectId;
    }

    public Long getScoreId() {
        return scoreId;
    }

    public void setScoreId(Long scoreId) {
        this.scoreId = scoreId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public String getScoreStatus() {
        return scoreStatus;
    }

    public void setScoreStatus(String scoreStatus) {
        this.scoreStatus = scoreStatus;
    }

    public Long getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(Long candidateId) {
        this.candidateId = candidateId;
    }
}
