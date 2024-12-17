package com.example.service;

import cn.hutool.core.util.StrUtil;
import com.example.entity.InterviewGroupInfo;
import com.example.entity.InterviewRegistrationInfo;
import com.example.entity.utils.dto.View_CandidateInfoDTO;
import com.example.mapper.InterviewRegistrationInfoMapper;
import com.example.service.IService.IInterviewRegistrationInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterviewRegistrationInfoService implements IInterviewRegistrationInfoService {
    @Autowired
    InterviewRegistrationInfoMapper interviewRegistrationInfoMapper;

    @Override
    public PageInfo<View_CandidateInfoDTO> findRegisterAll(String keyword, Integer pageSize, Integer pageNum,Integer flag) {
        PageHelper.startPage(pageNum, pageSize);
        if(!StrUtil.isNotEmpty(keyword)){
            keyword="";
        }
        List<View_CandidateInfoDTO> registers=interviewRegistrationInfoMapper.findGroupAll(keyword,flag);

        return new PageInfo<>(registers);
    }

    @Override
    public InterviewRegistrationInfo findInterviewById(Long interviewId) {
        return interviewRegistrationInfoMapper.findInterviewById(interviewId);
    }

    @Override
    public InterviewRegistrationInfo addNewInterview(InterviewRegistrationInfo interview) {
        System.out.println("添加实体：\n"+interview);
        interviewRegistrationInfoMapper.addNewInterview(interview);
        return interview;
    }

    @Override
    public InterviewRegistrationInfo modifyInterviewInfo(InterviewRegistrationInfo newInterview) {
        System.out.println("要修改的东东："+newInterview.getRegistrationId());
        InterviewRegistrationInfo interviewInDB = findInterviewById(newInterview.getRegistrationId());
        System.out.println("找到了吗："+(interviewInDB==null));
        if (newInterview.getEmergencyPhone() != null &&
                !newInterview.getEmergencyPhone().equals(interviewInDB.getEmergencyPhone())) {
            interviewInDB.setEmergencyPhone(newInterview.getEmergencyPhone());
        }
        if (newInterview.getPhone() != null &&
                !newInterview.getPhone().equals(interviewInDB.getPhone())) {
            interviewInDB.setPhone(newInterview.getPhone());
        }
        if (newInterview.getResearchDirection() != null &&
                !newInterview.getResearchDirection().equals(interviewInDB.getResearchDirection())) {
            interviewInDB.setResearchDirection(newInterview.getResearchDirection());
        }
        if (newInterview.getAcceptAdjustment() != null &&
                !newInterview.getAcceptAdjustment().equals(interviewInDB.getAcceptAdjustment())) {
            interviewInDB.setAcceptAdjustment(newInterview.getAcceptAdjustment());
        }
        if (newInterview.getSignature() != null &&
                !newInterview.getSignature().equals(interviewInDB.getSignature())) {
            System.out.println("我来这里了");
            interviewInDB.setSignature(newInterview.getSignature());
        }
        if (newInterview.getComprehensiveEvaluation() != null &&
                !newInterview.getComprehensiveEvaluation().equals(interviewInDB.getComprehensiveEvaluation())) {
            interviewInDB.setComprehensiveEvaluation(newInterview.getComprehensiveEvaluation());
        }
        if (newInterview.getForeignLanguage() != null &&
                !newInterview.getForeignLanguage().equals(interviewInDB.getForeignLanguage())) {
            interviewInDB.setForeignLanguage(newInterview.getForeignLanguage());
        }
        if (newInterview.getProfessionalKnowledge() != null &&
                !newInterview.getProfessionalKnowledge().equals(interviewInDB.getProfessionalKnowledge())) {
            interviewInDB.setProfessionalKnowledge(newInterview.getProfessionalKnowledge());
        }
        if (newInterview.getComprehensiveInterview() != null &&
                !newInterview.getComprehensiveInterview().equals(interviewInDB.getComprehensiveInterview())) {
            interviewInDB.setComprehensiveInterview(newInterview.getComprehensiveInterview());
        }
        if (newInterview.getTotalScore() != null &&
                !newInterview.getTotalScore().equals(interviewInDB.getTotalScore())) {
            interviewInDB.setTotalScore(newInterview.getTotalScore());
        }
        if (newInterview.getGroupId() != null &&
                !newInterview.getGroupId().equals(interviewInDB.getGroupId())) {
            interviewInDB.setGroupId(newInterview.getGroupId());
        }
        if (newInterview.getTutorId() != null &&
                !newInterview.getTutorId().equals(interviewInDB.getTutorId())) {
            interviewInDB.setTutorId(newInterview.getTutorId());
        }
        if (newInterview.getCandidateId() != null &&
                !newInterview.getCandidateId().equals(interviewInDB.getCandidateId())) {
            interviewInDB.setCandidateId(newInterview.getCandidateId());
        }
        System.out.println("service：\n"+interviewInDB);
        interviewRegistrationInfoMapper.modifyInterviewInfo(interviewInDB);
        return interviewInDB;
    }

    @Override
    public void deleteInterviewInfo(Long interviewId) {
        interviewRegistrationInfoMapper.deleteInterviewInfo(interviewId);
    }
}
