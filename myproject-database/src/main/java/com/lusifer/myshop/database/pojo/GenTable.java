package com.lusifer.myshop.database.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "gen_table")
public class GenTable {
    /**
     * ���
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
    private String comments;

    /**
     * ʵ��������
     */
    @Column(name = "class_name")
    private String className;

    /**
     * ��������
     */
    @Column(name = "parent_table")
    private String parentTable;

    /**
     * �����������
     */
    @Column(name = "parent_table_fk")
    private String parentTableFk;

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
     * ɾ����ǣ�0��������1��ɾ����
     */
    @Column(name = "del_flag")
    private String delFlag;

    /**
     * ͬ��
     */
    private String issync;

    /**
     * ������
     */
    @Column(name = "table_type")
    private String tableType;

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
     * @return comments - ����
     */
    public String getComments() {
        return comments;
    }

    /**
     * ��������
     *
     * @param comments ����
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * ��ȡʵ��������
     *
     * @return class_name - ʵ��������
     */
    public String getClassName() {
        return className;
    }

    /**
     * ����ʵ��������
     *
     * @param className ʵ��������
     */
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * ��ȡ��������
     *
     * @return parent_table - ��������
     */
    public String getParentTable() {
        return parentTable;
    }

    /**
     * ���ù�������
     *
     * @param parentTable ��������
     */
    public void setParentTable(String parentTable) {
        this.parentTable = parentTable;
    }

    /**
     * ��ȡ�����������
     *
     * @return parent_table_fk - �����������
     */
    public String getParentTableFk() {
        return parentTableFk;
    }

    /**
     * ���ù����������
     *
     * @param parentTableFk �����������
     */
    public void setParentTableFk(String parentTableFk) {
        this.parentTableFk = parentTableFk;
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
     * ��ȡɾ����ǣ�0��������1��ɾ����
     *
     * @return del_flag - ɾ����ǣ�0��������1��ɾ����
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * ����ɾ����ǣ�0��������1��ɾ����
     *
     * @param delFlag ɾ����ǣ�0��������1��ɾ����
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * ��ȡͬ��
     *
     * @return issync - ͬ��
     */
    public String getIssync() {
        return issync;
    }

    /**
     * ����ͬ��
     *
     * @param issync ͬ��
     */
    public void setIssync(String issync) {
        this.issync = issync;
    }

    /**
     * ��ȡ������
     *
     * @return table_type - ������
     */
    public String getTableType() {
        return tableType;
    }

    /**
     * ���ñ�����
     *
     * @param tableType ������
     */
    public void setTableType(String tableType) {
        this.tableType = tableType;
    }
}