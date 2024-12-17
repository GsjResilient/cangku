package com.example.controller;

import com.example.entity.InterviewGroupInfo;
import com.example.entity.InterviewRegistrationInfo;
import com.example.entity.utils.ResponseMessage;
import com.example.entity.utils.dto.View_CandidateInfoDTO;
import com.example.service.IService.IInterviewRegistrationInfoService;
import com.github.pagehelper.PageInfo;
import com.macro.mall.tiny.common.api.CommonResult;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/InterviewRegistrationInfo")
@Tag(name = "CandidateVolunteerInfoController",description = "考生登记表管理")
public class InterviewRegistrationInfoController {

    @Autowired
    IInterviewRegistrationInfoService interviewRegistrationInfoService;
    @Operation(summary ="获取所有提交的复试登记表信息")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<PageInfo<View_CandidateInfoDTO>> findGroupAll(@RequestParam(value = "keyword", required = false) String keyword,
                                                                   @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                   @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                                      @RequestParam(value = "flag", defaultValue = "1") Integer flag
    ) {
        PageInfo<View_CandidateInfoDTO> registers = interviewRegistrationInfoService.findRegisterAll(keyword,pageSize, pageNum,flag);
        return CommonResult.success(registers);
    }

    @Operation(summary ="根据ID查询复试登记表信息")
    @GetMapping("/{interviewId}")
    @ResponseBody
    public CommonResult findInterviewById(@PathVariable Long interviewId) {
        System.out.println("你要查我？"+interviewId);
        InterviewRegistrationInfo interview = interviewRegistrationInfoService.findInterviewById(interviewId);
        System.out.println(interview);
        return CommonResult.success(interview);
    }
    @Operation(summary = "添加登记表")
    @PostMapping
    @ResponseBody
    public CommonResult addNewInterview(@RequestBody InterviewRegistrationInfo interview) {
        System.out.println(interview);
        InterviewRegistrationInfo newInterview = interviewRegistrationInfoService.addNewInterview(interview);
        return CommonResult.success("win");
    }
    @Operation(summary = "修改登记表")
    @ResponseBody
    @PutMapping
    public CommonResult modifyInterviewInfo(@RequestBody InterviewRegistrationInfo interview) {
        System.out.println("在修改呢~~~");
        System.out.println(interview);
        InterviewRegistrationInfo updatedInterview = interviewRegistrationInfoService.modifyInterviewInfo(interview);
        return CommonResult.success(updatedInterview);
    }

    @DeleteMapping("/{interviewId}")
    public ResponseMessage deleteInterviewInfo(@PathVariable Long interviewId) {
        InterviewRegistrationInfo interviewToDelete = interviewRegistrationInfoService.findInterviewById(interviewId);
        interviewRegistrationInfoService.deleteInterviewInfo(interviewId);
        return ResponseMessage.success(interviewToDelete);
    }
}
