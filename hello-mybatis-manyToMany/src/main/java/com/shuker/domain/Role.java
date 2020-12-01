package com.shuker.domain;

import java.util.List;

/**
 * @ClassName Role
 * @Description TODO
 * @Author Shuker
 * @Date 2020/12/1 23:33
 * @Version 1.0
 **/
public class Role {
    private Integer roleId ;
    private String roleName ;
    private String roleDesc ;

    //多对多的配置
    private List<User1> users ;



    public List<User1> getUsers() {
        return users;
    }

    public void setUsers(List<User1> users) {
        this.users = users;
    }

    public Role() {
    }

    public Role(Integer roleId, String roleName, String roleDesc) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.roleDesc = roleDesc;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }
    @Override
    public String toString() {
        return "Role{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", roleDesc='" + roleDesc + '\'' +
                ", users=" + users +
                '}';
    }
}
