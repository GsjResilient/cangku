package com.example.controller;

import com.example.entity.CandidateVolunteerInfo;
import com.example.entity.utils.ResponseMessage;
import com.example.service.IService.ICandidateVolunteerInfoService;
import com.macro.mall.tiny.common.api.CommonResult;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/CandidateVolunteerInfo")
@Tag(name = "CandidateVolunteerInfoController",description = "考生志愿表管理")
public class CandidateVolunteerInfoController {

    @Autowired
    ICandidateVolunteerInfoService candidateVolunteerDirectionService;

    @GetMapping("/{volunteerId}")
    public ResponseMessage findVolunteerById(@PathVariable Long volunteerId) {
        CandidateVolunteerInfo volunteer = candidateVolunteerDirectionService.findVolunteerById(volunteerId);
        return ResponseMessage.success(volunteer);
    }

    @Operation(summary = "添加志愿表")
    @PostMapping
    @ResponseBody
    public CommonResult addNewVolunteer(@RequestBody CandidateVolunteerInfo volunteer) {
//        System.out.println("controller: "+volunteer);
        CandidateVolunteerInfo newVolunteer = candidateVolunteerDirectionService.addNewVolunteer(volunteer);
        return CommonResult.success(newVolunteer);
    }

    @PutMapping
    public ResponseMessage modifyVolunteerInfo(@RequestBody CandidateVolunteerInfo volunteer) {
        CandidateVolunteerInfo updatedVolunteer = candidateVolunteerDirectionService.modifyVolunteerInfo(volunteer);
        return ResponseMessage.success(updatedVolunteer);
    }

    @DeleteMapping("/{volunteerId}")
    public ResponseMessage deleteVolunteerById(@PathVariable Long volunteerId) {
        CandidateVolunteerInfo volunteerToDelete = candidateVolunteerDirectionService.findVolunteerById(volunteerId);
        candidateVolunteerDirectionService.deleteVolunteerById(volunteerId);
        return ResponseMessage.success(volunteerToDelete);
    }
}
