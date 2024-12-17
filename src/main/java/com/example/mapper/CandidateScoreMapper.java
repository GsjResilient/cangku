package com.example.mapper;

import com.example.entity.CandidateScore;
import com.example.entity.utils.dto.findScoreByIdDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CandidateScoreMapper {

    @Select("SELECT * FROM CandidateScore WHERE scoreId = #{scoreId}")
    CandidateScore findScoreById(Long scoreId);

    @Insert("INSERT INTO CandidateScore " +
            "(" +
            "    type, " +
            "    score, " +
            "    scoreStatus, " +
            "    candidateId," +
            "examSubjectId"+
            ")" +
            "VALUES " +
            "(" +
            "    #{type}, " +
            "    #{score}, " +
            "    #{scoreStatus}, " +
            "    #{candidateId}," +
            "    #{examSubjectId}" +
            ");")
    @Options(useGeneratedKeys = true, keyProperty = "scoreId")
    void addNewScore(CandidateScore score);

    @Update("UPDATE CandidateScore " +
            "SET " +
            "  type = #{type}, " +
            "  score = #{score}, " +
            "  scoreStatus = #{scoreStatus}, " +
            "  candidateId = #{candidateId}, " +
            "  examSubjectId = #{examSubjectId} " +
            "WHERE scoreId = #{scoreId}")
    void modifyScore(CandidateScore scoreInDB);

    @Delete("DELETE FROM CandidateScore WHERE scoreId = #{scoreId}")
    void deleteScore(Long scoreId);
    @Select("select name,undergraduateSchool,examSubjectName,score,type from " +
            "candidateinfo as C," +
            "examsubjectinfo as E," +
            "candidatescore as CS " +
            "WHERE C.candidateId=CS.candidateId and CS.examSubjectId=E.examSubjectId"+
            " and C.candidateId=#{candidateId} and (examSubjectName LIKE CONCAT('%', #{keyword}, '%') or type LIKE CONCAT('%', #{keyword}, '%'))")
    List<findScoreByIdDTO> findCandidateScoreById(String keyword, Integer candidateId);
}
