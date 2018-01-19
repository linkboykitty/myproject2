package com.lusifer.myshop.database.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "case_tree_table")
public class CaseTreeTable {
    /**
     * ����
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * ����
     */
    private String name;

    /**
     * ����
     */
    private Long sort;

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
     * �߼�ɾ����ǣ�0����ʾ��1�����أ�
     */
    @Column(name = "del_flag")
    private String delFlag;

    /**
     * ��ȡ����
     *
     * @return id - ����
     */
    public String getId() {
        return id;
    }

    /**
     * ��������
     *
     * @param id ����
     */
    public void setId(String id) {
        this.id = id;
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
     * ��ȡ�߼�ɾ����ǣ�0����ʾ��1�����أ�
     *
     * @return del_flag - �߼�ɾ����ǣ�0����ʾ��1�����أ�
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * �����߼�ɾ����ǣ�0����ʾ��1�����أ�
     *
     * @param delFlag �߼�ɾ����ǣ�0����ʾ��1�����أ�
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }
}