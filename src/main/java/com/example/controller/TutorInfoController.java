package com.example.controller;

import com.example.entity.TutorInfo;
import com.example.entity.utils.ResponseMessage;
import com.example.service.IService.ITutorInfoService;
import com.macro.mall.tiny.common.api.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/TutorInfo")
public class TutorInfoController {
    @Autowired
    ITutorInfoService tutorInfoService;

    // 增 - 添加新导师
    @PostMapping("/default")
    @ResponseBody
    public CommonResult addNewTutor() {
        TutorInfo newTutor = tutorInfoService.addNewTutor();
        return CommonResult.success(newTutor);
    }

    // 改 - 修改导师信息
    @PutMapping
    public ResponseMessage modifyTutorInfo(@RequestBody TutorInfo tutor) {
        TutorInfo updatedTutor = tutorInfoService.modifyTutorInfo(tutor);
        return ResponseMessage.success(updatedTutor);
    }

    // 删 - 根据 tutorId 删除导师信息
    @DeleteMapping("/{tutorId}")
    public ResponseMessage deleteTutorInfo(@PathVariable Long tutorId) {
        TutorInfo tutorToDelete = tutorInfoService.findTutorById(tutorId);
        tutorInfoService.deleteTutorInfo(tutorId);
        return ResponseMessage.success(tutorToDelete);
    }
}