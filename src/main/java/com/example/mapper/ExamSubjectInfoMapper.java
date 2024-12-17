package com.example.mapper;

import com.example.entity.ExamSubjectInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ExamSubjectInfoMapper {

    @Select("select * from examsubjectinfo")
    List<ExamSubjectInfo> FindALL();
}
