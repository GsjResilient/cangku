package com.example.controller;


import com.example.entity.CandidateInfo;
import com.example.entity.ExamSubjectInfo;
import com.example.service.IService.ICandidateService;
import com.example.service.IService.IExamSubjectInfoService;
import com.macro.mall.tiny.common.api.CommonResult;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/ExamSubjectInfo")
public class ExamSubjectInfoController {
    @Autowired
    IExamSubjectInfoService examSubjectInfoService;
    //查
    @Operation(summary = "学科查询")
    @GetMapping
    @ResponseBody
    CommonResult<List<ExamSubjectInfo>> FindALL(){
        List<ExamSubjectInfo> subjectInfoList=examSubjectInfoService.FindALL();
        return CommonResult.success(subjectInfoList);
    }
}
