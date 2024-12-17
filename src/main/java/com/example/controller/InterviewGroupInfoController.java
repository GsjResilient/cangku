package com.example.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.entity.InterviewGroupInfo;
import com.example.entity.utils.ResponseMessage;
import com.example.service.IService.IInterviewGroupInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.macro.mall.tiny.common.api.CommonPage;
import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.modules.ums.model.UmsAdmin;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/InterviewGroupInfo")
public class InterviewGroupInfoController {

    @Autowired
    IInterviewGroupInfoService interviewGroupInfoService;
    @Operation(summary ="获取所有复试小组信息")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<PageInfo<InterviewGroupInfo>> findGroupAll(@RequestParam(value = "keyword", required = false) String keyword,
                                                               @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                               @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        PageInfo<InterviewGroupInfo> groups = interviewGroupInfoService.findGroupAll(keyword,pageSize, pageNum);
        return CommonResult.success(groups);
    }
    @GetMapping("/{groupId}")
    public ResponseMessage findGroupById(@PathVariable Long groupId) {
        InterviewGroupInfo group = interviewGroupInfoService.findGroupById(groupId);
        return ResponseMessage.success(group);
    }
    @Operation(summary ="添加复试小组信息")
    @ResponseBody
    @PostMapping
    public CommonResult addNewGroup(@RequestBody InterviewGroupInfo group) {
        InterviewGroupInfo newGroup = interviewGroupInfoService.addNewGroup(group);
        return CommonResult.success(newGroup);
    }
    @Operation(summary ="修改复试小组信息")
    @ResponseBody
    @PutMapping
    public CommonResult modifyGroupInfo(@RequestBody InterviewGroupInfo group) {
        InterviewGroupInfo updatedGroup = interviewGroupInfoService.modifyGroupInfo(group);
        return CommonResult.success(updatedGroup);
    }
    @Operation(summary ="删除复试小组信息")
    @DeleteMapping("/{groupId}")
    @ResponseBody
    public CommonResult deleteGroupById(@PathVariable Long groupId) {
        InterviewGroupInfo groupToDelete = interviewGroupInfoService.findGroupById(groupId);
        interviewGroupInfoService.deleteGroupById(groupId);
        return CommonResult.success(groupToDelete);
    }
}
