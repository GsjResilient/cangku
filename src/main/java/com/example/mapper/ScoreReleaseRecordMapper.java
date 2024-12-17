package com.example.mapper;

import com.example.entity.ScoreReleaseRecord;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ScoreReleaseRecordMapper {

    // 根据 scoreId 查询所有关联的 tutorId
    @Select("SELECT tutorId FROM ScoreReleaseRecord WHERE scoreId = #{scoreId}")
    List<Long> findAllTutorsByScoreId(Long scoreId);

    // 根据 tutorId 查询所有关联的 scoreId
    @Select("SELECT scoreId FROM ScoreReleaseRecord WHERE tutorId = #{tutorId}")
    List<Long> findAllScoresByTutorId(Long tutorId);

    // 插入新的记录
    @Insert("INSERT INTO ScoreReleaseRecord (scoreId, tutorId) VALUES (#{scoreId}, #{tutorId})")
    int addNewScoreReleaseRecord(ScoreReleaseRecord record);

    // 根据 scoreId 和 tutorId 删除记录
    @Delete("DELETE FROM ScoreReleaseRecord WHERE scoreId = #{scoreId} AND tutorId = #{tutorId}")
    int deleteScoreReleaseRecord(@Param("scoreId") Long scoreId, @Param("tutorId") Long tutorId);
}
