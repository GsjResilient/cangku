package com.example.service;

import com.example.entity.CandidateVolunteerInfo;
import com.example.mapper.CandidateVolunteerInfoMapper;
import com.example.service.IService.ICandidateVolunteerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidateVolunteerInfoService implements ICandidateVolunteerInfoService {

    @Autowired
    CandidateVolunteerInfoMapper candidateVolunteerInfoMapper;

    @Override
    public CandidateVolunteerInfo findVolunteerById(Long volunteerId) {
        return candidateVolunteerInfoMapper.findVolunteerById(volunteerId);
    }

    @Override
    public CandidateVolunteerInfo addNewVolunteer(CandidateVolunteerInfo volunteer) {
        System.out.println(volunteer);
        candidateVolunteerInfoMapper.addNewVolunteer(volunteer);
        return volunteer;
    }

    @Override
    public CandidateVolunteerInfo modifyVolunteerInfo(CandidateVolunteerInfo newVolunteer) {
        CandidateVolunteerInfo volunteerInDB = findVolunteerById(newVolunteer.getVolunteerId());
        if (volunteerInDB == null) {
            throw new IllegalArgumentException("Volunteer direction not found with ID: " + newVolunteer.getVolunteerId());
        }
        if (newVolunteer.getCandidateId() != null && !newVolunteer.getCandidateId().equals(volunteerInDB.getCandidateId())) {
            volunteerInDB.setCandidateId(newVolunteer.getCandidateId());
        }
        if (newVolunteer.getVolunteerOrder() != null && !newVolunteer.getVolunteerOrder().equals(volunteerInDB.getVolunteerOrder())) {
            volunteerInDB.setVolunteerOrder(newVolunteer.getVolunteerOrder());
        }
        if (newVolunteer.getVolunteerType() != null && !newVolunteer.getVolunteerType().equals(volunteerInDB.getVolunteerType())) {
            volunteerInDB.setVolunteerType(newVolunteer.getVolunteerType());
        }
        if (newVolunteer.getId() != null && !newVolunteer.getId().equals(volunteerInDB.getId())) {
            volunteerInDB.setId(newVolunteer.getId());
        }

        candidateVolunteerInfoMapper.modifyVolunteerInfo(volunteerInDB);
        return volunteerInDB;
    }

    @Override
    public void deleteVolunteerById(Long volunteerId) {
        candidateVolunteerInfoMapper.deleteVolunteerById(volunteerId);
    }
}
