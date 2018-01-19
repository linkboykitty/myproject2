package com.lusifer.myshop.database.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_role")
public class SysRole {
    /**
     * ���
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * ��������
     */
    @Column(name = "office_id")
    private String officeId;

    /**
     * ��ɫ����
     */
    private String name;

    /**
     * Ӣ������
     */
    private String enname;

    /**
     * ��ɫ����
     */
    @Column(name = "role_type")
    private String roleType;

    /**
     * ���ݷ�Χ
     */
    @Column(name = "data_scope")
    private String dataScope;

    /**
     * �Ƿ�ϵͳ����
     */
    @Column(name = "is_sys")
    private String isSys;

    /**
     * �Ƿ����
     */
    private String useable;

    /**
     * ������
     */
    @Column(name = "create_by")
    private String createBy;

    /**
     * ����ʱ��
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * ������
     */
    @Column(name = "update_by")
    private String updateBy;

    /**
     * ����ʱ��
     */
    @Column(name = "update_date")
    private Date updateDate;

    /**
     * ��ע��Ϣ
     */
    private String remarks;

    /**
     * ɾ�����
     */
    @Column(name = "del_flag")
    private String delFlag;

    /**
     * ��ȡ���
     *
     * @return id - ���
     */
    public String getId() {
        return id;
    }

    /**
     * ���ñ��
     *
     * @param id ���
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * ��ȡ��������
     *
     * @return office_id - ��������
     */
    public String getOfficeId() {
        return officeId;
    }

    /**
     * ���ù�������
     *
     * @param officeId ��������
     */
    public void setOfficeId(String officeId) {
        this.officeId = officeId;
    }

    /**
     * ��ȡ��ɫ����
     *
     * @return name - ��ɫ����
     */
    public String getName() {
        return name;
    }

    /**
     * ���ý�ɫ����
     *
     * @param name ��ɫ����
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * ��ȡӢ������
     *
     * @return enname - Ӣ������
     */
    public String getEnname() {
        return enname;
    }

    /**
     * ����Ӣ������
     *
     * @param enname Ӣ������
     */
    public void setEnname(String enname) {
        this.enname = enname;
    }

    /**
     * ��ȡ��ɫ����
     *
     * @return role_type - ��ɫ����
     */
    public String getRoleType() {
        return roleType;
    }

    /**
     * ���ý�ɫ����
     *
     * @param roleType ��ɫ����
     */
    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    /**
     * ��ȡ���ݷ�Χ
     *
     * @return data_scope - ���ݷ�Χ
     */
    public String getDataScope() {
        return dataScope;
    }

    /**
     * �������ݷ�Χ
     *
     * @param dataScope ���ݷ�Χ
     */
    public void setDataScope(String dataScope) {
        this.dataScope = dataScope;
    }

    /**
     * ��ȡ�Ƿ�ϵͳ����
     *
     * @return is_sys - �Ƿ�ϵͳ����
     */
    public String getIsSys() {
        return isSys;
    }

    /**
     * �����Ƿ�ϵͳ����
     *
     * @param isSys �Ƿ�ϵͳ����
     */
    public void setIsSys(String isSys) {
        this.isSys = isSys;
    }

    /**
     * ��ȡ�Ƿ����
     *
     * @return useable - �Ƿ����
     */
    public String getUseable() {
        return useable;
    }

    /**
     * �����Ƿ����
     *
     * @param useable �Ƿ����
     */
    public void setUseable(String useable) {
        this.useable = useable;
    }

    /**
     * ��ȡ������
     *
     * @return create_by - ������
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * ���ô�����
     *
     * @param createBy ������
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return create_date - ����ʱ��
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * ���ô���ʱ��
     *
     * @param createDate ����ʱ��
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * ��ȡ������
     *
     * @return update_by - ������
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * ���ø�����
     *
     * @param updateBy ������
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return update_date - ����ʱ��
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * ���ø���ʱ��
     *
     * @param updateDate ����ʱ��
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * ��ȡ��ע��Ϣ
     *
     * @return remarks - ��ע��Ϣ
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * ���ñ�ע��Ϣ
     *
     * @param remarks ��ע��Ϣ
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * ��ȡɾ�����
     *
     * @return del_flag - ɾ�����
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * ����ɾ�����
     *
     * @param delFlag ɾ�����
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }
}