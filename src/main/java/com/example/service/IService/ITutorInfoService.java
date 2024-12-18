package com.example.service.IService;

import com.example.entity.SubjectInfo;
import com.example.entity.TutorInfo;

import java.util.List;

public interface ITutorInfoService {
    List<TutorInfo> FindALL(Long subjectId);
    TutorInfo findTutorById(Long tutorId);

    TutorInfo addNewTutor();

    TutorInfo modifyTutorInfo(TutorInfo tutor);

    void deleteTutorInfo(Long tutorId);
}
