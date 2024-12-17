package com.example.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.entity.InterviewGroupInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface InterviewGroupInfoMapper {
    @Select("SELECT * FROM interviewgroupinfo "
            + "WHERE leader LIKE CONCAT('%', #{keyword}, '%') "
            + "OR member1 LIKE CONCAT('%', #{keyword}, '%') "
            + "OR member2 LIKE CONCAT('%', #{keyword}, '%')")
    List<InterviewGroupInfo> findGroupAll(String keyword);

    @Select("SELECT * FROM interviewgroupinfo WHERE groupid = #{groupId}")
    InterviewGroupInfo findGroupById(Long groupId);

    @Insert("INSERT INTO interviewgroupinfo " +
            "(" +
            "    groupid, " +
            "    leader, " +
            "    member1, " +
            "    member2" +
            ") " +
            "VALUES " +
            "(" +
            "    #{groupId}, " +
            "    #{leader}, " +
            "    #{member1}, " +
            "    #{member2}" +
            ")")
    @Options(useGeneratedKeys = true, keyProperty = "groupId")
    void addNewGroup(InterviewGroupInfo group);

    @Update("UPDATE interviewgroupinfo " +
            "SET " +
            "  leader = #{leader}, " +
            "  member1 = #{member1}, " +
            "  member2 = #{member2} " +
            "WHERE groupid = #{groupId}")
    void modifyGroupInfo(InterviewGroupInfo groupInDB);

    @Delete("DELETE FROM interviewgroupinfo WHERE groupid = #{groupId}")
    void deleteGroupById(Long groupId);
}
