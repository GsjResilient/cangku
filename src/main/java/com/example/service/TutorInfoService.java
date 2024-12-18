package com.example.service;

import com.example.entity.TutorInfo;
import com.example.mapper.TutorInfoMapper;
import com.example.service.IService.ITutorInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TutorInfoService implements ITutorInfoService {
    @Autowired
    TutorInfoMapper tutorInfoMapper;

    @Override
    public List<TutorInfo> FindALL(Long subjectId) {
        return tutorInfoMapper.FindALL(subjectId);
    }

    @Override
    public TutorInfo findTutorById(Long tutorId) {
        return tutorInfoMapper.findTutorById(tutorId);
    }

    @Override
    public TutorInfo addNewTutor() {
        TutorInfo tutor= new TutorInfo();
        tutorInfoMapper.addNewTutor(tutor);
        return tutor;
    }

    @Override
    public TutorInfo modifyTutorInfo(TutorInfo newTutor) {
        TutorInfo tutorInDB = findTutorById(newTutor.getTutorId());

        if (newTutor.getTutorName() != null && !newTutor.getTutorName().equals(tutorInDB.getTutorName())) {
            tutorInDB.setTutorName(newTutor.getTutorName());
        }
        if (newTutor.getTutorTitle() != null && !newTutor.getTutorTitle().equals(tutorInDB.getTutorTitle())) {
            tutorInDB.setTutorTitle(newTutor.getTutorTitle());
        }
        if (newTutor.getTutorPhoto() != null && !newTutor.getTutorPhoto().equals(tutorInDB.getTutorPhoto())) {
            tutorInDB.setTutorPhoto(newTutor.getTutorPhoto());
        }
        if (newTutor.getTutorPhone() != null && !newTutor.getTutorPhone().equals(tutorInDB.getTutorPhone())) {
            tutorInDB.setTutorPhone(newTutor.getTutorPhone());
        }
        if (newTutor.getTutorIntroduction() != null && !newTutor.getTutorIntroduction().equals(tutorInDB.getTutorIntroduction())) {
            tutorInDB.setTutorIntroduction(newTutor.getTutorIntroduction());
        }
        if (newTutor.getTutorEmail() != null && !newTutor.getTutorEmail().equals(tutorInDB.getTutorEmail())) {
            tutorInDB.setTutorEmail(newTutor.getTutorEmail());
        }
        if (newTutor.getRecruitmentStatus() != null && !newTutor.getRecruitmentStatus().equals(tutorInDB.getRecruitmentStatus())) {
            tutorInDB.setRecruitmentStatus(newTutor.getRecruitmentStatus());
        }

        tutorInfoMapper.modifyTutorInfo(tutorInDB);
        return tutorInDB;
    }

    @Override
    public void deleteTutorInfo(Long tutorId) {
        tutorInfoMapper.deleteTutorInfo(tutorId);
    }
}
