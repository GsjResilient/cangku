package com.example.mapper;

import com.example.entity.TutorInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TutorInfoMapper {

    // 根据 tutorId 查询导师信息
    @Select("SELECT * FROM TutorInfo WHERE tutorId = #{tutorId}")
    TutorInfo findTutorById(Long tutorId);

    // 插入新导师信息
    @Insert("insert into tutorinfo(tutorName) values('')")
    @Options(useGeneratedKeys = true, keyProperty = "tutorId")
    void addNewTutor(TutorInfo tutor);

    // 更新导师信息
    @Update("UPDATE TutorInfo SET " +
            "tutorName = #{tutorName}, " +
            "tutorTitle = #{tutorTitle}, " +
            "tutorPhoto = #{tutorPhoto}, " +
            "tutorPhone = #{tutorPhone}, " +
            "tutorIntroduction = #{tutorIntroduction}, " +
            "tutorEmail = #{tutorEmail}, " +
            "recruitmentStatus = #{recruitmentStatus} " +
            "WHERE tutorId = #{tutorId}")
    void modifyTutorInfo(TutorInfo tutor);

    // 根据 tutorId 删除导师信息
    @Delete("DELETE FROM TutorInfo WHERE tutorId = #{tutorId}")
    void deleteTutorInfo(Long tutorId);
    @Select("CALL GetDistinctTutorsBySubjectId(#{subjectId})")
    List<TutorInfo> FindALL(Long subjectId);
}
