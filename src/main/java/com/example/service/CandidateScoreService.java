package com.example.service;

import cn.hutool.core.util.StrUtil;
import com.example.entity.CandidateInfo;
import com.example.entity.CandidateScore;
import com.example.entity.utils.dto.findScoreByIdDTO;
import com.example.mapper.CandidateScoreMapper;
import com.example.service.IService.ICandidateScoreService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateScoreService implements ICandidateScoreService {
    @Autowired
    CandidateScoreMapper candidateScoreMapper;

    @Override
    public CandidateScore findScoreById(Long scoreId) {
        return candidateScoreMapper.findScoreById(scoreId);
    }

    @Override
    public CandidateScore addNewScore(CandidateScore score) {
        candidateScoreMapper.addNewScore(score);
        return score;
    }

    @Override
    public CandidateScore modifyScore(CandidateScore newScore) {
        CandidateScore scoreInDB = findScoreById(newScore.getScoreId());

        if (newScore.getType() != null && !newScore.getType().equals(scoreInDB.getType())) {
            scoreInDB.setType(newScore.getType());
        }
        if (newScore.getScore() != null && !newScore.getScore().equals(scoreInDB.getScore())) {
            scoreInDB.setScore(newScore.getScore());
        }
        if (newScore.getScoreStatus() != null && !newScore.getScoreStatus().equals(scoreInDB.getScoreStatus())) {
            scoreInDB.setScoreStatus(newScore.getScoreStatus());
        }
        if (newScore.getCandidateId() != null && !newScore.getCandidateId().equals(scoreInDB.getCandidateId())) {
            scoreInDB.setCandidateId(newScore.getCandidateId());
        }
        if (newScore.getExamSubjectId() != null && !newScore.getExamSubjectId().equals(scoreInDB.getExamSubjectId())) {
            scoreInDB.setExamSubjectId(newScore.getExamSubjectId());
        }

        candidateScoreMapper.modifyScore(scoreInDB);
        return scoreInDB;
    }

    @Override
    public void deleteScore(Long scoreId) {
        candidateScoreMapper.deleteScore(scoreId);
    }

    @Override
    public PageInfo<findScoreByIdDTO> findCandidateScoreById(String keyword, Integer pageSize, Integer pageNum, Integer candidateId) {
        PageHelper.startPage(pageNum, pageSize);
        if(!StrUtil.isNotEmpty(keyword)){
            keyword="";
        }
        List<findScoreByIdDTO> candidateScores=candidateScoreMapper.findCandidateScoreById(keyword,candidateId);

        return new PageInfo<>(candidateScores);
    }
}
