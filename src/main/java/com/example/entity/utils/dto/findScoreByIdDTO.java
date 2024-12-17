package com.example.entity.utils.dto;

import java.math.BigDecimal;

public class findScoreByIdDTO {
    private String name;
    private String undergraduateSchool;
    String examSubjectName;
    private BigDecimal score;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUndergraduateSchool() {
        return undergraduateSchool;
    }

    public void setUndergraduateSchool(String undergraduateSchool) {
        this.undergraduateSchool = undergraduateSchool;
    }

    public String getExamSubjectName() {
        return examSubjectName;
    }

    public void setExamSubjectName(String examSubjectName) {
        this.examSubjectName = examSubjectName;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
