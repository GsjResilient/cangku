package com.example.mapper;


import com.example.entity.CandidateInfo;
import com.example.entity.InterviewGroupInfo;
import org.apache.ibatis.annotations.*;
import org.springframework.context.annotation.Bean;

import java.util.List;

@Mapper
public interface CandidateMapper {
    @Select("select * from CandidateInfo where candidateId=#{candidateId}")
    CandidateInfo FindCandidateById(Long candidateId);
    @Select("select uid from umsid_map_uid where umsId=#{umsId}")
    Long FindUidByUmsId(Long umsId);
    @Select("CALL InsertCandidateInfo(#{name}, #{gender}, #{birthDate}, #{idCardNumber}, #{origin}, " +
            "#{undergraduateMajor}, #{undergraduateSchool}, #{undergraduateSchoolType}, #{email}, #{resume}, #{admissionStatus})")//注意！select注解！而不是insert，因为要映射成结果集，调用的存储过程
    @Options(useGeneratedKeys = true, keyProperty = "candidateId")//将自增的主键值自动映射到candidateId这个属性中
    CandidateInfo AddNewCandidate(CandidateInfo candidate);

    @Update("UPDATE CandidateInfo " +
            "SET " +
            "  name = #{name}, " +
            "  gender = #{gender}, " +
            "  birthDate = #{birthDate}, " +
            "  idCardNumber = #{idCardNumber}, " +
            "  origin = #{origin}, " +
            "  undergraduateMajor = #{undergraduateMajor}, " +
            "  undergraduateSchool = #{undergraduateSchool}, " +
            "  undergraduateSchoolType = #{undergraduateSchoolType}, " +
            "  email = #{email}, " +
            "  resume = #{resume}, " +
            "  admissionStatus = #{admissionStatus} " +
            "WHERE candidateId = #{candidateId}")
    void ModifyCandidateInfo(CandidateInfo candidateInDB);

    @Delete("delete from CandidateInfo where candidateId=#{candidateId}")
    void DeleteCandidateInfo(Long candidateId);

    @Select("SELECT * FROM candidateinfo "
            + "WHERE name LIKE CONCAT('%', #{keyword}, '%') ")
    List<CandidateInfo> findCandidateAll(String keyword);
    @Insert("insert into umsid_map_uid(umsId,uid) values(#{umsId},#{uid})")
    void addMapIDs(@Param("uid") Integer uid, @Param("umsId") Integer umsId);

}
