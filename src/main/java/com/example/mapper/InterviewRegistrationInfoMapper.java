package com.example.mapper;


import com.example.entity.InterviewGroupInfo;
import com.example.entity.InterviewRegistrationInfo;
import com.example.entity.utils.dto.View_CandidateInfoDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface InterviewRegistrationInfoMapper {
    @Select("<script>" +
            "SELECT * FROM View_CandidateInfo " +
            "WHERE (name LIKE CONCAT('%', #{keyword}, '%') " +
            "OR examNumber LIKE CONCAT('%', #{keyword}, '%') " +
            "OR retestSubject LIKE CONCAT('%', #{keyword}, '%')) " +
            "<if test='flag == 1'>" +
            "AND groupId IS NULL " +
            "</if>" +
            "<if test='flag == 0'>" +
            "AND groupId IS NOT NULL AND tutorId IS NULL" +
            "</if>" +
            "</script>")
    List<View_CandidateInfoDTO> findGroupAll(@Param("keyword") String keyword, @Param("flag") int flag);
    @Select("select * from InterviewRegistrationInfo where registrationId=#{interviewId}")
    InterviewRegistrationInfo findInterviewById(Long interviewId);
    @Insert("INSERT INTO InterviewRegistrationInfo " +
            "(" +
            "   candidateId,"+
            "    emergencyPhone, " +
            "    phone, " +
            "    researchDirection, " +
            "    acceptAdjustment, " +
            "    signature, " +
            "academicCategory,"+
            "orientationCategory,"+
            "examNumber,"+
            "retestSubject"+
            ")" +
            "VALUES " +
            "(" +
            "    #{candidateId}," +
            "    #{emergencyPhone}, " +
            "    #{phone}, " +
            "    #{researchDirection}, " +
            "    #{acceptAdjustment}, " +
            "    #{signature}, " +
            "    #{academicCategory}, " +
            "    #{orientationCategory}, " +
            "    #{examNumber}, " +
            "    #{retestSubject}" +
            ");")
    @Options(useGeneratedKeys = true, keyProperty = "registrationId")
    void addNewInterview(InterviewRegistrationInfo interview);


    @Update("UPDATE InterviewRegistrationInfo " +
            "SET " +
            "  comprehensiveEvaluation = #{comprehensiveEvaluation}, " +
            "  foreignLanguage = #{foreignLanguage}, " +
            "  professionalKnowledge = #{professionalKnowledge}, " +
            "  comprehensiveInterview = #{comprehensiveInterview}, " +
            "  totalScore = #{totalScore}, " +
            "  groupId = #{groupId}," +
            "  tutorId = #{tutorId} " +
            "WHERE registrationId = #{registrationId}")
    void modifyInterviewInfo(InterviewRegistrationInfo interview);





    @Delete("delete from InterviewRegistrationInfo where registrationId=#{interviewId}")
    void deleteInterviewInfo(Long interviewId);
}
