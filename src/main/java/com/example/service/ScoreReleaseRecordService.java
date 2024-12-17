package com.example.service;

import com.example.entity.ScoreReleaseRecord;
import com.example.mapper.ScoreReleaseRecordMapper;
import com.example.service.IService.IScoreReleaseRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreReleaseRecordService implements IScoreReleaseRecordService {
    @Autowired
    ScoreReleaseRecordMapper scoreReleaseRecordMapper;

    @Override
    public List<Long> findAllTutorsByScoreId(Long scoreId) {
        return scoreReleaseRecordMapper.findAllTutorsByScoreId(scoreId);
    }

    @Override
    public List<Long> findAllScoresByTutorId(Long tutorId) {
        return scoreReleaseRecordMapper.findAllScoresByTutorId(tutorId);
    }

    @Override
    public ScoreReleaseRecord addNewScoreReleaseRecord(ScoreReleaseRecord record) {
        int rows = scoreReleaseRecordMapper.addNewScoreReleaseRecord(record);
        if (rows > 0) {
            return record;
        } else {
            throw new RuntimeException("Failed to add new score release record.");
        }
    }

    @Override
    public void deleteScoreReleaseRecord(Long scoreId, Long tutorId) {
        int rows = scoreReleaseRecordMapper.deleteScoreReleaseRecord(scoreId, tutorId);
        if (rows <= 0) {
            throw new RuntimeException("Failed to delete score release record with scoreId=" + scoreId + " and tutorId=" + tutorId);
        }
    }
}
