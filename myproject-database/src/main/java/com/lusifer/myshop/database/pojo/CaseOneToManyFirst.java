package com.lusifer.myshop.database.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "case_one_to_many_first")
public class CaseOneToManyFirst {
    /**
     * ���
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * ������
     */
    private String startarea;

    /**
     * Ŀ�ĵ�
     */
    private String endarea;

    /**
     * ����۸�
     */
    private Double price;

    /**
     * ���
     */
    @Column(name = "case_one_to_many_main")
    private String caseOneToManyMain;

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
     * ��ȡ������
     *
     * @return startarea - ������
     */
    public String getStartarea() {
        return startarea;
    }

    /**
     * ���ó�����
     *
     * @param startarea ������
     */
    public void setStartarea(String startarea) {
        this.startarea = startarea;
    }

    /**
     * ��ȡĿ�ĵ�
     *
     * @return endarea - Ŀ�ĵ�
     */
    public String getEndarea() {
        return endarea;
    }

    /**
     * ����Ŀ�ĵ�
     *
     * @param endarea Ŀ�ĵ�
     */
    public void setEndarea(String endarea) {
        this.endarea = endarea;
    }

    /**
     * ��ȡ����۸�
     *
     * @return price - ����۸�
     */
    public Double getPrice() {
        return price;
    }

    /**
     * ���ô���۸�
     *
     * @param price ����۸�
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * ��ȡ���
     *
     * @return case_one_to_many_main - ���
     */
    public String getCaseOneToManyMain() {
        return caseOneToManyMain;
    }

    /**
     * �������
     *
     * @param caseOneToManyMain ���
     */
    public void setCaseOneToManyMain(String caseOneToManyMain) {
        this.caseOneToManyMain = caseOneToManyMain;
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