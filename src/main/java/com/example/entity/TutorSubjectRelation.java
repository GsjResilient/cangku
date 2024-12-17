package com.example.entity;

public class TutorSubjectRelation {
    private Long tutorId;        // 导师编号，关联 TutorInfo
    private Long subjectId;      // 学科ID，关联 SubjectInfo
    private Integer recruitmentQuota; // 招生数量
    private Integer vacancy;      // 缺额数量

    public Long getTutorId() {
        return tutorId;
    }

    public void setTutorId(Long tutorId) {
        this.tutorId = tutorId;
    }

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public Integer getRecruitmentQuota() {
        return recruitmentQuota;
    }

    public void setRecruitmentQuota(Integer recruitmentQuota) {
        this.recruitmentQuota = recruitmentQuota;
    }

    public Integer getVacancy() {
        return vacancy;
    }

    public void setVacancy(Integer vacancy) {
        this.vacancy = vacancy;
    }
}

