package com.lusifer.myshop.database.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_menu")
public class SysMenu {
    /**
     * ���
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * �������
     */
    @Column(name = "parent_id")
    private String parentId;

    /**
     * ���и������
     */
    @Column(name = "parent_ids")
    private String parentIds;

    /**
     * ����
     */
    private String name;

    /**
     * ����
     */
    private Long sort;

    /**
     * ����
     */
    private String href;

    /**
     * Ŀ��
     */
    private String target;

    /**
     * ͼ��
     */
    private String icon;

    /**
     * �Ƿ��ڲ˵�����ʾ
     */
    @Column(name = "is_show")
    private String isShow;

    /**
     * Ȩ�ޱ�ʶ
     */
    private String permission;

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
     * ��ȡ�������
     *
     * @return parent_id - �������
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * ���ø������
     *
     * @param parentId �������
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * ��ȡ���и������
     *
     * @return parent_ids - ���и������
     */
    public String getParentIds() {
        return parentIds;
    }

    /**
     * �������и������
     *
     * @param parentIds ���и������
     */
    public void setParentIds(String parentIds) {
        this.parentIds = parentIds;
    }

    /**
     * ��ȡ����
     *
     * @return name - ����
     */
    public String getName() {
        return name;
    }

    /**
     * ��������
     *
     * @param name ����
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * ��ȡ����
     *
     * @return sort - ����
     */
    public Long getSort() {
        return sort;
    }

    /**
     * ��������
     *
     * @param sort ����
     */
    public void setSort(Long sort) {
        this.sort = sort;
    }

    /**
     * ��ȡ����
     *
     * @return href - ����
     */
    public String getHref() {
        return href;
    }

    /**
     * ��������
     *
     * @param href ����
     */
    public void setHref(String href) {
        this.href = href;
    }

    /**
     * ��ȡĿ��
     *
     * @return target - Ŀ��
     */
    public String getTarget() {
        return target;
    }

    /**
     * ����Ŀ��
     *
     * @param target Ŀ��
     */
    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * ��ȡͼ��
     *
     * @return icon - ͼ��
     */
    public String getIcon() {
        return icon;
    }

    /**
     * ����ͼ��
     *
     * @param icon ͼ��
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * ��ȡ�Ƿ��ڲ˵�����ʾ
     *
     * @return is_show - �Ƿ��ڲ˵�����ʾ
     */
    public String getIsShow() {
        return isShow;
    }

    /**
     * �����Ƿ��ڲ˵�����ʾ
     *
     * @param isShow �Ƿ��ڲ˵�����ʾ
     */
    public void setIsShow(String isShow) {
        this.isShow = isShow;
    }

    /**
     * ��ȡȨ�ޱ�ʶ
     *
     * @return permission - Ȩ�ޱ�ʶ
     */
    public String getPermission() {
        return permission;
    }

    /**
     * ����Ȩ�ޱ�ʶ
     *
     * @param permission Ȩ�ޱ�ʶ
     */
    public void setPermission(String permission) {
        this.permission = permission;
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