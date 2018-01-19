package com.lusifer.myshop.database.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_dict")
public class SysDict {
    /**
     * ���
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * ����ֵ
     */
    private String value;

    /**
     * ��ǩ��
     */
    private String label;

    /**
     * ����
     */
    private String type;

    /**
     * ����
     */
    private String description;

    /**
     * ��������
     */
    private Long sort;

    /**
     * �������
     */
    @Column(name = "parent_id")
    private String parentId;

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
     * ��ȡ����ֵ
     *
     * @return value - ����ֵ
     */
    public String getValue() {
        return value;
    }

    /**
     * ��������ֵ
     *
     * @param value ����ֵ
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * ��ȡ��ǩ��
     *
     * @return label - ��ǩ��
     */
    public String getLabel() {
        return label;
    }

    /**
     * ���ñ�ǩ��
     *
     * @param label ��ǩ��
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * ��ȡ����
     *
     * @return type - ����
     */
    public String getType() {
        return type;
    }

    /**
     * ��������
     *
     * @param type ����
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * ��ȡ����
     *
     * @return description - ����
     */
    public String getDescription() {
        return description;
    }

    /**
     * ��������
     *
     * @param description ����
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * ��ȡ��������
     *
     * @return sort - ��������
     */
    public Long getSort() {
        return sort;
    }

    /**
     * ������������
     *
     * @param sort ��������
     */
    public void setSort(Long sort) {
        this.sort = sort;
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