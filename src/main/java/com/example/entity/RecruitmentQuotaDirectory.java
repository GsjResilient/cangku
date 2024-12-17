package com.example.entity;

public class RecruitmentQuotaDirectory {
    private Long recruitmentDirectoryId; // 招生目录ID
    private Integer totalQuota;          // 总招生指标
    private Integer year;                // 年份
    private Integer recommendedQuota;    // 推免生指标
    private Integer additionalQuota;     // 补充指标
    private Long collegeId;              // 学院ID，关联 CollegeInfo

    public Long getRecruitmentDirectoryId() {
        return recruitmentDirectoryId;
    }

    public void setRecruitmentDirectoryId(Long recruitmentDirectoryId) {
        this.recruitmentDirectoryId = recruitmentDirectoryId;
    }

    public Integer getTotalQuota() {
        return totalQuota;
    }

    public void setTotalQuota(Integer totalQuota) {
        this.totalQuota = totalQuota;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getRecommendedQuota() {
        return recommendedQuota;
    }

    public void setRecommendedQuota(Integer recommendedQuota) {
        this.recommendedQuota = recommendedQuota;
    }

    public Integer getAdditionalQuota() {
        return additionalQuota;
    }

    public void setAdditionalQuota(Integer additionalQuota) {
        this.additionalQuota = additionalQuota;
    }

    public Long getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Long collegeId) {
        this.collegeId = collegeId;
    }
}

