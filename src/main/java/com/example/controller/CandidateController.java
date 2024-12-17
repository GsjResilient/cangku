package com.example.controller;


import com.example.entity.CandidateInfo;
import com.example.entity.InterviewGroupInfo;
import com.example.entity.utils.ResponseMessage;
import com.example.service.IService.ICandidateService;
import com.github.pagehelper.PageInfo;
import com.macro.mall.tiny.common.api.CommonResult;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@Tag(name = "CandidateController",description = "考生信息管理")
@RequestMapping("/CandidateInfo")
public class CandidateController {
    @Autowired
    ICandidateService candidateService;
    //查
    @Operation(summary = "考生查询")
    @RequestMapping(value = "/{candidateId}", method = RequestMethod.GET)
    @ResponseBody
    CommonResult FindCandidateById(@PathVariable Long candidateId){
        System.out.println("有人请求了~!"+candidateId);
        CandidateInfo candidate=candidateService.FindCandidateById(candidateId);
        System.out.println("已经到这里了！"+candidate);
        return CommonResult.success(candidate);
    }

    /**
     * 根据umdId查询uid 要用到 umsid_map_uid 表
     */
    @Operation(summary = "umsId与uid的转换")
    @RequestMapping(value = "/UmsUid/{umsId}", method = RequestMethod.GET)
    @ResponseBody
    CommonResult FindUidByUmsId(@PathVariable Long umsId){
        System.out.println("有人请求转换id~!"+umsId);
        Long uid=candidateService.FindUidByUmsId(umsId);
        System.out.println("已经到这里了！"+uid);
        Map<String, Object> data = new HashMap<>();
        data.put("uid",uid);
        return CommonResult.success(data);
    }

    /**
     * 增加映射
     * @param umsId
     * @return
     */
    @RequestMapping(value = "/addMapIDs", method = RequestMethod.POST)
    @ResponseBody
    CommonResult addMapIDs(@RequestParam(value = "uid") Integer uid,
                           @RequestParam(value = "umsId") Integer umsId){
        System.out.println("有人请求转换id~!"+uid+' '+umsId);
        candidateService.addMapIDs(uid,umsId);
        return CommonResult.success("success!");
    }
    //增
    @Operation(summary = "添加考生信息")
    @PostMapping
    @ResponseBody
    public CommonResult AddNewCandidate(@RequestBody CandidateInfo candidate){
        System.out.println("小飞棍来咯！"+candidate);
        CandidateInfo candidateNew=candidateService.AddNewCandidate(candidate);
        return CommonResult.success(candidateNew);
    }
    //改
    @Operation(summary = "修改考生信息")
    @PutMapping
    @ResponseBody
    public CommonResult modifyCandidate(@RequestBody CandidateInfo candidate){
        System.out.println("小飞棍来咯！"+candidate);
        CandidateInfo candidateNew=candidateService.ModifyCandidateInfo(candidate);
        return CommonResult.success(candidateNew);
    }
    @Operation(summary = "分页查找")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<PageInfo<CandidateInfo>> FindCandidateAll(@RequestParam(value = "keyword", required = false) String keyword,
                                                                  @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                  @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum){
        System.out.println("有人请求分页（考生信息）!"+pageSize+' '+pageNum);
        PageInfo<CandidateInfo> candidates = candidateService.FindCandidateAll(keyword,pageSize, pageNum);
        return CommonResult.success(candidates);
    }
}
