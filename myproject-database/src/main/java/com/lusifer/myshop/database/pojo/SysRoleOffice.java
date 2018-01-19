package com.lusifer.myshop.database.pojo;

import javax.persistence.*;

@Table(name = "sys_role_office")
public class SysRoleOffice {
    /**
     * ��ɫ���
     */
    @Id
    @Column(name = "role_id")
    private String roleId;

    /**
     * �������
     */
    @Id
    @Column(name = "office_id")
    private String officeId;

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

    /**
     * ��ȡ�������
     *
     * @return office_id - �������
     */
    public String getOfficeId() {
        return officeId;
    }

    /**
     * ���û������
     *
     * @param officeId �������
     */
    public void setOfficeId(String officeId) {
        this.officeId = officeId;
    }
}