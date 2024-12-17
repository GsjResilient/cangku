package com.example.service.IService;

import com.example.entity.TutorInfo;

public interface ITutorInfoService {
    TutorInfo findTutorById(Long tutorId);

    TutorInfo addNewTutor();

    TutorInfo modifyTutorInfo(TutorInfo tutor);

    void deleteTutorInfo(Long tutorId);
}
