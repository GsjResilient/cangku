package com.example.controller;

import com.example.entity.ScoreReleaseRecord;
import com.example.entity.utils.ResponseMessage;
import com.example.service.IService.IScoreReleaseRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ScoreReleaseRecord")
public class ScoreReleaseRecordController {
    @Autowired
    IScoreReleaseRecordService iScoreReleaseRecordService;

    // 查 - 根据 scoreId 获取所有 tutorId
    @GetMapping("/scores/{scoreId}")
    public ResponseMessage findAllTutorsByScoreId(@PathVariable Long scoreId) {
        List<Long> tutorIds = iScoreReleaseRecordService.findAllTutorsByScoreId(scoreId);
        return ResponseMessage.success(tutorIds);
    }

    // 查 - 根据 tutorId 获取所有 scoreId
    @GetMapping("/tutors/{tutorId}")
    public ResponseMessage findAllScoresByTutorId(@PathVariable Long tutorId) {
        List<Long> scoreIds = iScoreReleaseRecordService.findAllScoresByTutorId(tutorId);
        return ResponseMessage.success(scoreIds);
    }

    // 增 - 添加新的成绩发布记录
    @PostMapping
    public ResponseMessage addNewScoreReleaseRecord(@RequestBody ScoreReleaseRecord record) {
        ScoreReleaseRecord newRecord = iScoreReleaseRecordService.addNewScoreReleaseRecord(record);
        return ResponseMessage.success(newRecord);
    }

    // 删 - 根据 scoreId 和 tutorId 删除成绩发布记录
    @DeleteMapping("/{scoreId}/{tutorId}")
    public ResponseMessage deleteScoreReleaseRecord(
            @PathVariable Long scoreId,
            @PathVariable Long tutorId) {
        iScoreReleaseRecordService.deleteScoreReleaseRecord(scoreId, tutorId);
        return ResponseMessage.success("Deleted successfully: scoreId=" + scoreId + ", tutorId=" + tutorId);
    }
}
