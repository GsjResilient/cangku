package com.example.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.entity.InterviewGroupInfo;
import com.example.entity.utils.dto.View_InterviewGroupDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface InterviewGroupInfoMapper {
    @Select("SELECT * FROM group_with_names "
            + "WHERE leaderName LIKE CONCAT('%', #{keyword}, '%') "
            + "OR member1Name LIKE CONCAT('%', #{keyword}, '%') "
            + "OR member2Name LIKE CONCAT('%', #{keyword}, '%')")
    List<View_InterviewGroupDTO> findGroupAll(String keyword);

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
