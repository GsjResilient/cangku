package com.example.service.IService;

import com.example.entity.CandidateScore;
import com.example.entity.utils.dto.findScoreByIdDTO;
import com.github.pagehelper.PageInfo;

public interface ICandidateScoreService {
    CandidateScore findScoreById(Long scoreId);

    CandidateScore addNewScore(CandidateScore score);

    CandidateScore modifyScore(CandidateScore score);

    void deleteScore(Long scoreId);

    PageInfo<findScoreByIdDTO> findCandidateScoreById(String keyword, Integer pageSize, Integer pageNum, Integer candidateId);
}
