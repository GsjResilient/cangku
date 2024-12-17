package com.example.service;

import com.example.entity.ExamSubjectInfo;
import com.example.mapper.CandidateVolunteerInfoMapper;
import com.example.mapper.ExamSubjectInfoMapper;
import com.example.service.IService.IExamSubjectInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ExamSubjectInfoService implements IExamSubjectInfoService {
    @Autowired
    ExamSubjectInfoMapper examSubjectInfoMapper;
    @Override
    public List<ExamSubjectInfo> FindALL() {
        return examSubjectInfoMapper.FindALL();
    }
}
