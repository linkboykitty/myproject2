package com.lusifer.myshop.database.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "gen_template")
public class GenTemplate {
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
    private String category;

    /**
     * �����ļ�·��
     */
    @Column(name = "file_path")
    private String filePath;

    /**
     * �����ļ���
     */
    @Column(name = "file_name")
    private String fileName;

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
     * ����
     */
    private String content;

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
     * @return category - ����
     */
    public String getCategory() {
        return category;
    }

    /**
     * ���÷���
     *
     * @param category ����
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * ��ȡ�����ļ�·��
     *
     * @return file_path - �����ļ�·��
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * ���������ļ�·��
     *
     * @param filePath �����ļ�·��
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * ��ȡ�����ļ���
     *
     * @return file_name - �����ļ���
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * ���������ļ���
     *
     * @param fileName �����ļ���
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
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
     * ��ȡ����
     *
     * @return content - ����
     */
    public String getContent() {
        return content;
    }

    /**
     * ��������
     *
     * @param content ����
     */
    public void setContent(String content) {
        this.content = content;
    }
}