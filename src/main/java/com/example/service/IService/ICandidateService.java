package com.example.service.IService;

import com.example.entity.CandidateInfo;
import com.example.entity.InterviewGroupInfo;
import com.github.pagehelper.PageInfo;

public interface ICandidateService {
    /**
     * 使用candidateId查找候选考生
     * @param candidateId 考生id
     * @return
     */
    CandidateInfo FindCandidateById(Long candidateId);

    /**
     * 添加新的候选考生
     * @param candidate 考生
     * @return
     */
    CandidateInfo AddNewCandidate(CandidateInfo candidate);

    /**
     * 修改候选考生信息
     * @param candidate 考生
     * @return
     */
    CandidateInfo ModifyCandidateInfo(CandidateInfo candidate);

    /**
     * 删除候选考生
     * @param candidateId 考生id
     */
    void DeleteCandidateInfo(Long candidateId);

    /**
     * 根据umsId 查询 uid  要用到 umsid_map_uid 表
     * @param umsId
     * @return
     */
    Long FindUidByUmsId(Long umsId);

    /**
     * 分页查询考生全部信息
     * @param keyword
     * @param pageSize
     * @param pageNum
     * @return
     */
    PageInfo<CandidateInfo> FindCandidateAll(String keyword, Integer pageSize, Integer pageNum);

    void addMapIDs(Integer uid, Integer umsId);
}
