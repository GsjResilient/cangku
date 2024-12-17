package com.example.service.IService;

import com.example.entity.CandidateVolunteerInfo;

public interface ICandidateVolunteerInfoService {

    CandidateVolunteerInfo findVolunteerById(Long volunteerId);

    CandidateVolunteerInfo addNewVolunteer(CandidateVolunteerInfo volunteer);

    CandidateVolunteerInfo modifyVolunteerInfo(CandidateVolunteerInfo volunteer);

    void deleteVolunteerById(Long volunteerId);
}
