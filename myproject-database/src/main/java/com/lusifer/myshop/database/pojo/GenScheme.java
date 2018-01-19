package com.lusifer.myshop.database.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "gen_scheme")
public class GenScheme {
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
     * ���ɰ�·��
     */
    @Column(name = "package_name")
    private String packageName;

    /**
     * ����ģ����
     */
    @Column(name = "module_name")
    private String moduleName;

    /**
     * ������ģ����
     */
    @Column(name = "sub_module_name")
    private String subModuleName;

    /**
     * ���ɹ�����
     */
    @Column(name = "function_name")
    private String functionName;

    /**
     * ���ɹ���������д��
     */
    @Column(name = "function_name_simple")
    private String functionNameSimple;

    /**
     * ���ɹ�������
     */
    @Column(name = "function_author")
    private String functionAuthor;

    /**
     * ���ɱ���
     */
    @Column(name = "gen_table_id")
    private String genTableId;

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
     * ��ȡ���ɰ�·��
     *
     * @return package_name - ���ɰ�·��
     */
    public String getPackageName() {
        return packageName;
    }

    /**
     * �������ɰ�·��
     *
     * @param packageName ���ɰ�·��
     */
    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    /**
     * ��ȡ����ģ����
     *
     * @return module_name - ����ģ����
     */
    public String getModuleName() {
        return moduleName;
    }

    /**
     * ��������ģ����
     *
     * @param moduleName ����ģ����
     */
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    /**
     * ��ȡ������ģ����
     *
     * @return sub_module_name - ������ģ����
     */
    public String getSubModuleName() {
        return subModuleName;
    }

    /**
     * ����������ģ����
     *
     * @param subModuleName ������ģ����
     */
    public void setSubModuleName(String subModuleName) {
        this.subModuleName = subModuleName;
    }

    /**
     * ��ȡ���ɹ�����
     *
     * @return function_name - ���ɹ�����
     */
    public String getFunctionName() {
        return functionName;
    }

    /**
     * �������ɹ�����
     *
     * @param functionName ���ɹ�����
     */
    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * ��ȡ���ɹ���������д��
     *
     * @return function_name_simple - ���ɹ���������д��
     */
    public String getFunctionNameSimple() {
        return functionNameSimple;
    }

    /**
     * �������ɹ���������д��
     *
     * @param functionNameSimple ���ɹ���������д��
     */
    public void setFunctionNameSimple(String functionNameSimple) {
        this.functionNameSimple = functionNameSimple;
    }

    /**
     * ��ȡ���ɹ�������
     *
     * @return function_author - ���ɹ�������
     */
    public String getFunctionAuthor() {
        return functionAuthor;
    }

    /**
     * �������ɹ�������
     *
     * @param functionAuthor ���ɹ�������
     */
    public void setFunctionAuthor(String functionAuthor) {
        this.functionAuthor = functionAuthor;
    }

    /**
     * ��ȡ���ɱ���
     *
     * @return gen_table_id - ���ɱ���
     */
    public String getGenTableId() {
        return genTableId;
    }

    /**
     * �������ɱ���
     *
     * @param genTableId ���ɱ���
     */
    public void setGenTableId(String genTableId) {
        this.genTableId = genTableId;
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
}