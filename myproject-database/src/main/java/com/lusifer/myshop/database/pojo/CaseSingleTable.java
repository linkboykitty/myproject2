package com.lusifer.myshop.database.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "case_single_table")
public class CaseSingleTable {
    /**
     * ����
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * Ա��
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * ��������
     */
    @Column(name = "office_id")
    private String officeId;

    /**
     * ��������
     */
    @Column(name = "area_id")
    private String areaId;

    /**
     * ��ٿ�ʼ����
     */
    @Column(name = "begin_date")
    private Date beginDate;

    /**
     * ��ٽ�������
     */
    @Column(name = "end_date")
    private Date endDate;

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
     * ��ȡԱ��
     *
     * @return user_id - Ա��
     */
    public String getUserId() {
        return userId;
    }

    /**
     * ����Ա��
     *
     * @param userId Ա��
     */
    public void setUserId(String userId) {
        this.userId = userId;
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
     * ��ȡ��������
     *
     * @return area_id - ��������
     */
    public String getAreaId() {
        return areaId;
    }

    /**
     * ���ù�������
     *
     * @param areaId ��������
     */
    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    /**
     * ��ȡ��ٿ�ʼ����
     *
     * @return begin_date - ��ٿ�ʼ����
     */
    public Date getBeginDate() {
        return beginDate;
    }

    /**
     * ������ٿ�ʼ����
     *
     * @param beginDate ��ٿ�ʼ����
     */
    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    /**
     * ��ȡ��ٽ�������
     *
     * @return end_date - ��ٽ�������
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * ������ٽ�������
     *
     * @param endDate ��ٽ�������
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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