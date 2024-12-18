package com.example.service.IService;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.entity.InterviewGroupInfo;
import com.example.entity.utils.dto.View_InterviewGroupDTO;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface IInterviewGroupInfoService {
    PageInfo<View_InterviewGroupDTO> findGroupAll(String keyword, Integer pageSize, Integer pageNum);
    InterviewGroupInfo findGroupById(Long groupId);

    InterviewGroupInfo addNewGroup(InterviewGroupInfo group);

    InterviewGroupInfo modifyGroupInfo(InterviewGroupInfo group);

    void deleteGroupById(Long groupId);
}
