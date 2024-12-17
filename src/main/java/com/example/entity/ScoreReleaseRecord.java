package com.example.entity;

public class ScoreReleaseRecord {
    private Long scoreId;        // 成绩编号，关联 CandidateScore
    private Long tutorId;        // 导师编号，关联 TutorInfo

    public Long getScoreId() {
        return scoreId;
    }

    public void setScoreId(Long scoreId) {
        this.scoreId = scoreId;
    }

    public Long getTutorId() {
        return tutorId;
    }

    public void setTutorId(Long tutorId) {
        this.tutorId = tutorId;
    }
}

