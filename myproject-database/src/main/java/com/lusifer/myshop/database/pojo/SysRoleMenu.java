package com.lusifer.myshop.database.pojo;

import javax.persistence.*;

@Table(name = "sys_role_menu")
public class SysRoleMenu {
    /**
     * ��ɫ���
     */
    @Id
    @Column(name = "role_id")
    private String roleId;

    /**
     * �˵����
     */
    @Id
    @Column(name = "menu_id")
    private String menuId;

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
     * ��ȡ�˵����
     *
     * @return menu_id - �˵����
     */
    public String getMenuId() {
        return menuId;
    }

    /**
     * ���ò˵����
     *
     * @param menuId �˵����
     */
    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }
}