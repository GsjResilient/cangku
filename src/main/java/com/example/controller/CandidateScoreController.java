package com.example.controller;

import com.example.entity.CandidateInfo;
import com.example.entity.CandidateScore;
import com.example.entity.utils.ResponseMessage;
import com.example.entity.utils.dto.findScoreByIdDTO;
import com.example.service.IService.ICandidateScoreService;
import com.github.pagehelper.PageInfo;
import com.macro.mall.tiny.common.api.CommonResult;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/CandidateScore")
public class CandidateScoreController {
    @Autowired
    ICandidateScoreService candidateScoreService;

    @Operation(summary ="添加成绩表数据")
    // 增 - 添加新的成绩
    @PostMapping
    @ResponseBody
    public CommonResult addNewScore(@RequestBody CandidateScore score) {
        CandidateScore newScore = candidateScoreService.addNewScore(score);
        return CommonResult.success(newScore);
    }
    @Operation(summary = "根据考生id找到其成绩信息")
    @RequestMapping(value = "/findCandidateScoreById", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<PageInfo<findScoreByIdDTO>> findCandidateScoreById(@RequestParam(value = "keyword", required = false) String keyword,
                                                                           @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                           @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                                           @RequestParam(value = "candidateId", defaultValue = "1") Integer candidateId
                                                                  ){
        System.out.println("有人请求分页（查考生信息）! "+candidateId);
        PageInfo<findScoreByIdDTO> candidates = candidateScoreService.findCandidateScoreById(keyword,pageSize, pageNum,candidateId);
        return CommonResult.success(candidates);
    }

}
