package com.example.entity;

public class InterviewGroupInfo {
    private Long groupId;           // 小组号
    private String leader;           // 组长
    private String member1;          // 成员1
    private String member2;          // 成员2

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getMember1() {
        return member1;
    }

    public void setMember1(String member1) {
        this.member1 = member1;
    }

    public String getMember2() {
        return member2;
    }

    public void setMember2(String member2) {
        this.member2 = member2;
    }
}

