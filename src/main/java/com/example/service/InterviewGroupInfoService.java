package com.example.service;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.entity.InterviewGroupInfo;
import com.example.entity.utils.dto.View_InterviewGroupDTO;
import com.example.mapper.InterviewGroupInfoMapper;
import com.example.service.IService.IInterviewGroupInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterviewGroupInfoService implements IInterviewGroupInfoService {

    @Autowired
    InterviewGroupInfoMapper interviewGroupInfoMapper;

    @Override
    public PageInfo<View_InterviewGroupDTO> findGroupAll(String keyword, Integer pageSize, Integer pageNum) {
        System.out.println("分页请求："+keyword);
        PageHelper.startPage(pageNum, pageSize);
        if(!StrUtil.isNotEmpty(keyword)){
            keyword="";
        }
        List<View_InterviewGroupDTO> groups=interviewGroupInfoMapper.findGroupAll(keyword);

        return new PageInfo<>(groups);
    }

    @Override
    public InterviewGroupInfo findGroupById(Long groupId) {
        return interviewGroupInfoMapper.findGroupById(groupId);
    }

    @Override
    public InterviewGroupInfo addNewGroup(InterviewGroupInfo group) {
        interviewGroupInfoMapper.addNewGroup(group);
        return group;
    }

    @Override
    public InterviewGroupInfo modifyGroupInfo(InterviewGroupInfo newGroup) {
        InterviewGroupInfo groupInDB = findGroupById(newGroup.getGroupId());
        if (groupInDB == null) {
            throw new IllegalArgumentException("Group not found with ID: " + newGroup.getGroupId());
        }

        if (newGroup.getLeader() != null && !newGroup.getLeader().equals(groupInDB.getLeader())) {
            groupInDB.setLeader(newGroup.getLeader());
        }
        if (newGroup.getMember1() != null && !newGroup.getMember1().equals(groupInDB.getMember1())) {
            groupInDB.setMember1(newGroup.getMember1());
        }
        if (newGroup.getMember2() != null && !newGroup.getMember2().equals(groupInDB.getMember2())) {
            groupInDB.setMember2(newGroup.getMember2());
        }

        interviewGroupInfoMapper.modifyGroupInfo(groupInDB);
        return groupInDB;
    }

    @Override
    public void deleteGroupById(Long groupId) {
        interviewGroupInfoMapper.deleteGroupById(groupId);
    }
}
