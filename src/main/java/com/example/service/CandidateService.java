package com.example.service;

import cn.hutool.core.util.StrUtil;
import com.example.entity.CandidateInfo;
import com.example.entity.InterviewGroupInfo;
import com.example.mapper.CandidateMapper;
import com.example.service.IService.ICandidateService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CandidateService implements ICandidateService {
    @Autowired
    CandidateMapper candidateMapper;

    @Override
    public CandidateInfo FindCandidateById(Long candidateId) {
        CandidateInfo candidate = candidateMapper.FindCandidateById(candidateId);
        return candidate;
    }

    @Override
    public CandidateInfo AddNewCandidate(CandidateInfo candidate) {
        CandidateInfo candidateNew = candidateMapper.AddNewCandidate(candidate);
        return candidateNew;
    }

    @Override
    public CandidateInfo ModifyCandidateInfo(CandidateInfo newCandidate) {
        CandidateInfo candidateInDB = FindCandidateById(newCandidate.getCandidateId());
        // 遍历新候选人信息的每个属性，与数据库中的信息进行比较
        if (newCandidate.getName() != null && !newCandidate.getName().equals(candidateInDB.getName())) {
            candidateInDB.setName(newCandidate.getName());
        }
        if (newCandidate.getGender() != null && !newCandidate.getGender().equals(candidateInDB.getGender())) {
            candidateInDB.setGender(newCandidate.getGender());
        }
        if (newCandidate.getBirthDate() != null && !newCandidate.getBirthDate().equals(candidateInDB.getBirthDate())) {
            candidateInDB.setBirthDate(newCandidate.getBirthDate());
        }
        if (newCandidate.getIdCardNumber() != null && !newCandidate.getIdCardNumber().equals(candidateInDB.getIdCardNumber())) {
            candidateInDB.setIdCardNumber(newCandidate.getIdCardNumber());
        }
        if (newCandidate.getOrigin() != null && !newCandidate.getOrigin().equals(candidateInDB.getOrigin())) {
            candidateInDB.setOrigin(newCandidate.getOrigin());
        }
        if (newCandidate.getUndergraduateMajor() != null && !newCandidate.getUndergraduateMajor().equals(candidateInDB.getUndergraduateMajor())) {
            candidateInDB.setUndergraduateMajor(newCandidate.getUndergraduateMajor());
        }
        if (newCandidate.getUndergraduateSchool() != null && !newCandidate.getUndergraduateSchool().equals(candidateInDB.getUndergraduateSchool())) {
            candidateInDB.setUndergraduateSchool(newCandidate.getUndergraduateSchool());
        }
        if (newCandidate.getUndergraduateSchoolType() != null && !newCandidate.getUndergraduateSchoolType().equals(candidateInDB.getUndergraduateSchoolType())) {
            candidateInDB.setUndergraduateSchoolType(newCandidate.getUndergraduateSchoolType());
        }
        if (newCandidate.getEmail() != null && !newCandidate.getEmail().equals(candidateInDB.getEmail())) {
            candidateInDB.setEmail(newCandidate.getEmail());
        }
        if (newCandidate.getResume() != null && !newCandidate.getResume().equals(candidateInDB.getResume())) {
            candidateInDB.setResume(newCandidate.getResume());
        }
        if (newCandidate.getAdmissionStatus() != null && !newCandidate.getAdmissionStatus().equals(candidateInDB.getAdmissionStatus())) {
            candidateInDB.setAdmissionStatus(newCandidate.getAdmissionStatus());
        }
        candidateMapper.ModifyCandidateInfo(candidateInDB);
        return candidateInDB;
    }

    @Override
    public void DeleteCandidateInfo(Long candidateId) {
        candidateMapper.DeleteCandidateInfo(candidateId);
    }

    @Override
    public Long FindUidByUmsId(Long umsId) {
        return candidateMapper.FindUidByUmsId(umsId);
    }

    @Override
    public PageInfo<CandidateInfo> FindCandidateAll(String keyword, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        if(!StrUtil.isNotEmpty(keyword)){
            keyword="";
        }
        List<CandidateInfo> candidates=candidateMapper.findCandidateAll(keyword);

        return new PageInfo<>(candidates);
    }

    @Override
    public void addMapIDs(Integer uid, Integer umsId) {
        candidateMapper.addMapIDs(uid,umsId);
    }
}
