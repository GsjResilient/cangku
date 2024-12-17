package com.example.service.IService;

import com.example.entity.InterviewRegistrationInfo;
import com.example.entity.utils.dto.View_CandidateInfoDTO;
import com.github.pagehelper.PageInfo;

public interface IInterviewRegistrationInfoService {
    PageInfo<View_CandidateInfoDTO> findRegisterAll(String keyword, Integer pageSize, Integer pageNum,Integer flag);
    InterviewRegistrationInfo findInterviewById(Long interviewId);

    InterviewRegistrationInfo addNewInterview(InterviewRegistrationInfo interview);

    InterviewRegistrationInfo modifyInterviewInfo(InterviewRegistrationInfo interview);

    void deleteInterviewInfo(Long interviewId);
}
