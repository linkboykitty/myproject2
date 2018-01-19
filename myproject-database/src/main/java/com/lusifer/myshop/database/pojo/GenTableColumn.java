package com.lusifer.myshop.database.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "gen_table_column")
public class GenTableColumn {
    /**
     * ���
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * ��������
     */
    @Column(name = "gen_table_id")
    private String genTableId;

    /**
     * ����
     */
    private String name;

    /**
     * ����
     */
    private String comments;

    /**
     * �е��������͵��ֽڳ���
     */
    @Column(name = "jdbc_type")
    private String jdbcType;

    /**
     * JAVA����
     */
    @Column(name = "java_type")
    private String javaType;

    /**
     * JAVA�ֶ���
     */
    @Column(name = "java_field")
    private String javaField;

    /**
     * �Ƿ�����
     */
    @Column(name = "is_pk")
    private String isPk;

    /**
     * �Ƿ��Ϊ��
     */
    @Column(name = "is_null")
    private String isNull;

    /**
     * �Ƿ�Ϊ�����ֶ�
     */
    @Column(name = "is_insert")
    private String isInsert;

    /**
     * �Ƿ�༭�ֶ�
     */
    @Column(name = "is_edit")
    private String isEdit;

    /**
     * �Ƿ��б��ֶ�
     */
    @Column(name = "is_list")
    private String isList;

    /**
     * �Ƿ��ѯ�ֶ�
     */
    @Column(name = "is_query")
    private String isQuery;

    /**
     * ��ѯ��ʽ�����ڡ������ڡ����ڡ�С�ڡ���Χ����LIKE����LIKE������LIKE��
     */
    @Column(name = "query_type")
    private String queryType;

    /**
     * �ֶ����ɷ������ı����ı��������򡢸�ѡ�򡢵�ѡ���ֵ�ѡ����Աѡ�񡢲���ѡ������ѡ��
     */
    @Column(name = "show_type")
    private String showType;

    /**
     * �ֵ�����
     */
    @Column(name = "dict_type")
    private String dictType;

    /**
     * �������ã���չ�ֶ�JSON��
     */
    private String settings;

    /**
     * ��������
     */
    private Long sort;

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
     * �Ƿ����ʾ
     */
    @Column(name = "is_form")
    private String isForm;

    /**
     * ����Ĳ�ѯ����
     */
    @Column(name = "tableName")
    private String tablename;

    @Column(name = "fieldLabels")
    private String fieldlabels;

    @Column(name = "fieldKeys")
    private String fieldkeys;

    @Column(name = "searchLabel")
    private String searchlabel;

    @Column(name = "searchKey")
    private String searchkey;

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
     * @return gen_table_id - ��������
     */
    public String getGenTableId() {
        return genTableId;
    }

    /**
     * ���ù�������
     *
     * @param genTableId ��������
     */
    public void setGenTableId(String genTableId) {
        this.genTableId = genTableId;
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
     * ��ȡ�е��������͵��ֽڳ���
     *
     * @return jdbc_type - �е��������͵��ֽڳ���
     */
    public String getJdbcType() {
        return jdbcType;
    }

    /**
     * �����е��������͵��ֽڳ���
     *
     * @param jdbcType �е��������͵��ֽڳ���
     */
    public void setJdbcType(String jdbcType) {
        this.jdbcType = jdbcType;
    }

    /**
     * ��ȡJAVA����
     *
     * @return java_type - JAVA����
     */
    public String getJavaType() {
        return javaType;
    }

    /**
     * ����JAVA����
     *
     * @param javaType JAVA����
     */
    public void setJavaType(String javaType) {
        this.javaType = javaType;
    }

    /**
     * ��ȡJAVA�ֶ���
     *
     * @return java_field - JAVA�ֶ���
     */
    public String getJavaField() {
        return javaField;
    }

    /**
     * ����JAVA�ֶ���
     *
     * @param javaField JAVA�ֶ���
     */
    public void setJavaField(String javaField) {
        this.javaField = javaField;
    }

    /**
     * ��ȡ�Ƿ�����
     *
     * @return is_pk - �Ƿ�����
     */
    public String getIsPk() {
        return isPk;
    }

    /**
     * �����Ƿ�����
     *
     * @param isPk �Ƿ�����
     */
    public void setIsPk(String isPk) {
        this.isPk = isPk;
    }

    /**
     * ��ȡ�Ƿ��Ϊ��
     *
     * @return is_null - �Ƿ��Ϊ��
     */
    public String getIsNull() {
        return isNull;
    }

    /**
     * �����Ƿ��Ϊ��
     *
     * @param isNull �Ƿ��Ϊ��
     */
    public void setIsNull(String isNull) {
        this.isNull = isNull;
    }

    /**
     * ��ȡ�Ƿ�Ϊ�����ֶ�
     *
     * @return is_insert - �Ƿ�Ϊ�����ֶ�
     */
    public String getIsInsert() {
        return isInsert;
    }

    /**
     * �����Ƿ�Ϊ�����ֶ�
     *
     * @param isInsert �Ƿ�Ϊ�����ֶ�
     */
    public void setIsInsert(String isInsert) {
        this.isInsert = isInsert;
    }

    /**
     * ��ȡ�Ƿ�༭�ֶ�
     *
     * @return is_edit - �Ƿ�༭�ֶ�
     */
    public String getIsEdit() {
        return isEdit;
    }

    /**
     * �����Ƿ�༭�ֶ�
     *
     * @param isEdit �Ƿ�༭�ֶ�
     */
    public void setIsEdit(String isEdit) {
        this.isEdit = isEdit;
    }

    /**
     * ��ȡ�Ƿ��б��ֶ�
     *
     * @return is_list - �Ƿ��б��ֶ�
     */
    public String getIsList() {
        return isList;
    }

    /**
     * �����Ƿ��б��ֶ�
     *
     * @param isList �Ƿ��б��ֶ�
     */
    public void setIsList(String isList) {
        this.isList = isList;
    }

    /**
     * ��ȡ�Ƿ��ѯ�ֶ�
     *
     * @return is_query - �Ƿ��ѯ�ֶ�
     */
    public String getIsQuery() {
        return isQuery;
    }

    /**
     * �����Ƿ��ѯ�ֶ�
     *
     * @param isQuery �Ƿ��ѯ�ֶ�
     */
    public void setIsQuery(String isQuery) {
        this.isQuery = isQuery;
    }

    /**
     * ��ȡ��ѯ��ʽ�����ڡ������ڡ����ڡ�С�ڡ���Χ����LIKE����LIKE������LIKE��
     *
     * @return query_type - ��ѯ��ʽ�����ڡ������ڡ����ڡ�С�ڡ���Χ����LIKE����LIKE������LIKE��
     */
    public String getQueryType() {
        return queryType;
    }

    /**
     * ���ò�ѯ��ʽ�����ڡ������ڡ����ڡ�С�ڡ���Χ����LIKE����LIKE������LIKE��
     *
     * @param queryType ��ѯ��ʽ�����ڡ������ڡ����ڡ�С�ڡ���Χ����LIKE����LIKE������LIKE��
     */
    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    /**
     * ��ȡ�ֶ����ɷ������ı����ı��������򡢸�ѡ�򡢵�ѡ���ֵ�ѡ����Աѡ�񡢲���ѡ������ѡ��
     *
     * @return show_type - �ֶ����ɷ������ı����ı��������򡢸�ѡ�򡢵�ѡ���ֵ�ѡ����Աѡ�񡢲���ѡ������ѡ��
     */
    public String getShowType() {
        return showType;
    }

    /**
     * �����ֶ����ɷ������ı����ı��������򡢸�ѡ�򡢵�ѡ���ֵ�ѡ����Աѡ�񡢲���ѡ������ѡ��
     *
     * @param showType �ֶ����ɷ������ı����ı��������򡢸�ѡ�򡢵�ѡ���ֵ�ѡ����Աѡ�񡢲���ѡ������ѡ��
     */
    public void setShowType(String showType) {
        this.showType = showType;
    }

    /**
     * ��ȡ�ֵ�����
     *
     * @return dict_type - �ֵ�����
     */
    public String getDictType() {
        return dictType;
    }

    /**
     * �����ֵ�����
     *
     * @param dictType �ֵ�����
     */
    public void setDictType(String dictType) {
        this.dictType = dictType;
    }

    /**
     * ��ȡ�������ã���չ�ֶ�JSON��
     *
     * @return settings - �������ã���չ�ֶ�JSON��
     */
    public String getSettings() {
        return settings;
    }

    /**
     * �����������ã���չ�ֶ�JSON��
     *
     * @param settings �������ã���չ�ֶ�JSON��
     */
    public void setSettings(String settings) {
        this.settings = settings;
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
     * ��ȡ�Ƿ����ʾ
     *
     * @return is_form - �Ƿ����ʾ
     */
    public String getIsForm() {
        return isForm;
    }

    /**
     * �����Ƿ����ʾ
     *
     * @param isForm �Ƿ����ʾ
     */
    public void setIsForm(String isForm) {
        this.isForm = isForm;
    }

    /**
     * ��ȡ����Ĳ�ѯ����
     *
     * @return tableName - ����Ĳ�ѯ����
     */
    public String getTablename() {
        return tablename;
    }

    /**
     * ���ù���Ĳ�ѯ����
     *
     * @param tablename ����Ĳ�ѯ����
     */
    public void setTablename(String tablename) {
        this.tablename = tablename;
    }

    /**
     * @return fieldLabels
     */
    public String getFieldlabels() {
        return fieldlabels;
    }

    /**
     * @param fieldlabels
     */
    public void setFieldlabels(String fieldlabels) {
        this.fieldlabels = fieldlabels;
    }

    /**
     * @return fieldKeys
     */
    public String getFieldkeys() {
        return fieldkeys;
    }

    /**
     * @param fieldkeys
     */
    public void setFieldkeys(String fieldkeys) {
        this.fieldkeys = fieldkeys;
    }

    /**
     * @return searchLabel
     */
    public String getSearchlabel() {
        return searchlabel;
    }

    /**
     * @param searchlabel
     */
    public void setSearchlabel(String searchlabel) {
        this.searchlabel = searchlabel;
    }

    /**
     * @return searchKey
     */
    public String getSearchkey() {
        return searchkey;
    }

    /**
     * @param searchkey
     */
    public void setSearchkey(String searchkey) {
        this.searchkey = searchkey;
    }
}