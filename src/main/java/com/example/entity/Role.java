package com.example.entity;
import java.util.HashSet;
import java.util.Set;

public class Role {

    private Long id; // 角色ID
    private String roleName; // 角色名称
    private String description; // 角色描述
    private Integer sort; // 排序字段
    private Integer status; // 状态
    private Boolean hidden; // 是否隐藏

    // 角色与用户的关系
    private Set<User> users = new HashSet<>();

    // 角色与资源的关系
    private Set<Resource> resources = new HashSet<>();

    // 角色与菜单的关系
    private Set<Menu> menus = new HashSet<>();

    // Getter 和 Setter 方法
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Set<Resource> getResources() {
        return resources;
    }

    public void setResources(Set<Resource> resources) {
        this.resources = resources;
    }

    public Set<Menu> getMenus() {
        return menus;
    }

    public void setMenus(Set<Menu> menus) {
        this.menus = menus;
    }
}
