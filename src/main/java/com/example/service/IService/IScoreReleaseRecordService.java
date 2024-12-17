package com.example.service.IService;

import com.example.entity.ScoreReleaseRecord;

import java.util.List;

public interface IScoreReleaseRecordService {
    List<Long> findAllTutorsByScoreId(Long scoreId);

    List<Long> findAllScoresByTutorId(Long tutorId);

    ScoreReleaseRecord addNewScoreReleaseRecord(ScoreReleaseRecord record);

    void deleteScoreReleaseRecord(Long scoreId, Long tutorId);
}
