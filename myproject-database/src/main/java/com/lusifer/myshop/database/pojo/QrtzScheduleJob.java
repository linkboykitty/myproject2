package com.lusifer.myshop.database.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "qrtz_schedule_job")
public class QrtzScheduleJob {
    /**
     * ����
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * ��������
     */
    @Column(name = "job_name")
    private String jobName;

    /**
     * �������
     */
    @Column(name = "alias_name")
    private String aliasName;

    /**
     * �������
     */
    @Column(name = "job_group")
    private String jobGroup;

    /**
     * ������
     */
    @Column(name = "job_trigger")
    private String jobTrigger;

    /**
     * ����״̬
     */
    @Column(name = "STATUS")
    private String status;

    /**
     * CRON���ʽ
     */
    @Column(name = "cron_expression")
    private String cronExpression;

    /**
     * �Ƿ��첽
     */
    @Column(name = "is_sync")
    private String isSync;

    /**
     * ִ�е�ַ
     */
    private String url;

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
     * ��ȡ��������
     *
     * @return job_name - ��������
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * ������������
     *
     * @param jobName ��������
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * ��ȡ�������
     *
     * @return alias_name - �������
     */
    public String getAliasName() {
        return aliasName;
    }

    /**
     * �����������
     *
     * @param aliasName �������
     */
    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    /**
     * ��ȡ�������
     *
     * @return job_group - �������
     */
    public String getJobGroup() {
        return jobGroup;
    }

    /**
     * �����������
     *
     * @param jobGroup �������
     */
    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
    }

    /**
     * ��ȡ������
     *
     * @return job_trigger - ������
     */
    public String getJobTrigger() {
        return jobTrigger;
    }

    /**
     * ���ô�����
     *
     * @param jobTrigger ������
     */
    public void setJobTrigger(String jobTrigger) {
        this.jobTrigger = jobTrigger;
    }

    /**
     * ��ȡ����״̬
     *
     * @return STATUS - ����״̬
     */
    public String getStatus() {
        return status;
    }

    /**
     * ��������״̬
     *
     * @param status ����״̬
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * ��ȡCRON���ʽ
     *
     * @return cron_expression - CRON���ʽ
     */
    public String getCronExpression() {
        return cronExpression;
    }

    /**
     * ����CRON���ʽ
     *
     * @param cronExpression CRON���ʽ
     */
    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    /**
     * ��ȡ�Ƿ��첽
     *
     * @return is_sync - �Ƿ��첽
     */
    public String getIsSync() {
        return isSync;
    }

    /**
     * �����Ƿ��첽
     *
     * @param isSync �Ƿ��첽
     */
    public void setIsSync(String isSync) {
        this.isSync = isSync;
    }

    /**
     * ��ȡִ�е�ַ
     *
     * @return url - ִ�е�ַ
     */
    public String getUrl() {
        return url;
    }

    /**
     * ����ִ�е�ַ
     *
     * @param url ִ�е�ַ
     */
    public void setUrl(String url) {
        this.url = url;
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