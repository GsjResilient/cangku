package com.example.entity;
import java.util.HashSet;
import java.util.Set;

public class Resource {

    private Long id; // 资源ID
    private String resName; // 资源名称
    private String url; // 资源的URL
    private String description; // 资源描述

    // 资源与角色的多对多关系
    private Set<Role> roles = new HashSet<>();

    // Getter 和 Setter 方法
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getResName() {
        return resName;
    }

    public void setResName(String resName) {
        this.resName = resName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
