package com.example.mapper;

import com.example.entity.CandidateVolunteerInfo;
import org.apache.ibatis.annotations.*;

@Mapper
public interface CandidateVolunteerInfoMapper {

    @Select("SELECT * FROM name WHERE volunteerid = #{volunteerId}")
    CandidateVolunteerInfo findVolunteerById(Long volunteerId);

    @Insert("INSERT INTO candidatevolunteerinfo " +
            "(" +
            "    candidateId, " +
            "    volunteerOrder, " +
            "    volunteerType, " +
            "    name" +
            ") " +
            "VALUES " +
            "(" +
            "    #{candidateId}, " +
            "    #{volunteerOrder}, " +
            "    #{volunteerType}, " +
            "    #{name}" +
            ")")
    @Options(useGeneratedKeys = true, keyProperty = "volunteerId")
    void addNewVolunteer(CandidateVolunteerInfo volunteer);

    @Update("UPDATE candidatevolunteerdirection " +
            "SET " +
            "  candidateid = #{candidateId}, " +
            "  volunteerorder = #{volunteerOrder}, " +
            "  volunteertype = #{volunteerType}, " +
            "  directionname = #{directionName} " +
            "WHERE volunteerid = #{volunteerId}")
    void modifyVolunteerInfo(CandidateVolunteerInfo volunteer);

    @Delete("DELETE FROM candidatevolunteerdirection WHERE volunteerid = #{volunteerId}")
    void deleteVolunteerById(Long volunteerId);
}
