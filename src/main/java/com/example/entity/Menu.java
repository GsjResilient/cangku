package com.example.entity;
import java.util.HashSet;
import java.util.Set;

public class Menu {

    private Long id; // 菜单ID
    private String menuName; // 菜单名称
    private Long parentId; // 父菜单ID
    private Integer level; // 菜单的层级
    private Boolean hidden; // 是否隐藏
    private String createTime; // 创建时间

    // 菜单与角色的多对多关系
    private Set<Role> roles = new HashSet<>();

    // Getter 和 Setter 方法
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
