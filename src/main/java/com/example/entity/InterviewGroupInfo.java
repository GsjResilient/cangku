package com.example.entity;

public class InterviewGroupInfo {
    private Long groupId;           // 小组号
    private Long leader;           // 组长
    private Long member1;          // 成员1
    private Long member2;          // 成员2

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Long getLeader() {
        return leader;
    }

    public void setLeader(Long leader) {
        this.leader = leader;
    }

    public Long getMember1() {
        return member1;
    }

    public void setMember1(Long member1) {
        this.member1 = member1;
    }

    public Long getMember2() {
        return member2;
    }

    public void setMember2(Long member2) {
        this.member2 = member2;
    }
}

