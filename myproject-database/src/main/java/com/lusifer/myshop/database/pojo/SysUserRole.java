package com.lusifer.myshop.database.pojo;

import javax.persistence.*;

@Table(name = "sys_user_role")
public class SysUserRole {
    /**
     * �û����
     */
    @Id
    @Column(name = "user_id")
    private String userId;

    /**
     * ��ɫ���
     */
    @Id
    @Column(name = "role_id")
    private String roleId;

    /**
     * ��ȡ�û����
     *
     * @return user_id - �û����
     */
    public String getUserId() {
        return userId;
    }

    /**
     * �����û����
     *
     * @param userId �û����
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * ��ȡ��ɫ���
     *
     * @return role_id - ��ɫ���
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * ���ý�ɫ���
     *
     * @param roleId ��ɫ���
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }
}