package com.lusifer.myshop.database.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_office")
public class SysOffice {
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
     * ��������
     */
    @Column(name = "area_id")
    private String areaId;

    /**
     * �������
     */
    private String code;

    /**
     * ��������
     */
    private String type;

    /**
     * �����ȼ�
     */
    private String grade;

    /**
     * ��ϵ��ַ
     */
    private String address;

    /**
     * ��������
     */
    @Column(name = "zip_code")
    private String zipCode;

    /**
     * ������
     */
    private String master;

    /**
     * �绰
     */
    private String phone;

    /**
     * ����
     */
    private String fax;

    /**
     * ����
     */
    private String email;

    /**
     * �Ƿ�����
     */
    @Column(name = "USEABLE")
    private String useable;

    /**
     * ��������
     */
    @Column(name = "PRIMARY_PERSON")
    private String primaryPerson;

    /**
     * ��������
     */
    @Column(name = "DEPUTY_PERSON")
    private String deputyPerson;

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
     * ��ȡ�������
     *
     * @return code - �������
     */
    public String getCode() {
        return code;
    }

    /**
     * �����������
     *
     * @param code �������
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * ��ȡ��������
     *
     * @return type - ��������
     */
    public String getType() {
        return type;
    }

    /**
     * ���û�������
     *
     * @param type ��������
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * ��ȡ�����ȼ�
     *
     * @return grade - �����ȼ�
     */
    public String getGrade() {
        return grade;
    }

    /**
     * ���û����ȼ�
     *
     * @param grade �����ȼ�
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * ��ȡ��ϵ��ַ
     *
     * @return address - ��ϵ��ַ
     */
    public String getAddress() {
        return address;
    }

    /**
     * ������ϵ��ַ
     *
     * @param address ��ϵ��ַ
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * ��ȡ��������
     *
     * @return zip_code - ��������
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * ������������
     *
     * @param zipCode ��������
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * ��ȡ������
     *
     * @return master - ������
     */
    public String getMaster() {
        return master;
    }

    /**
     * ���ø�����
     *
     * @param master ������
     */
    public void setMaster(String master) {
        this.master = master;
    }

    /**
     * ��ȡ�绰
     *
     * @return phone - �绰
     */
    public String getPhone() {
        return phone;
    }

    /**
     * ���õ绰
     *
     * @param phone �绰
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * ��ȡ����
     *
     * @return fax - ����
     */
    public String getFax() {
        return fax;
    }

    /**
     * ���ô���
     *
     * @param fax ����
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * ��ȡ����
     *
     * @return email - ����
     */
    public String getEmail() {
        return email;
    }

    /**
     * ��������
     *
     * @param email ����
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * ��ȡ�Ƿ�����
     *
     * @return USEABLE - �Ƿ�����
     */
    public String getUseable() {
        return useable;
    }

    /**
     * �����Ƿ�����
     *
     * @param useable �Ƿ�����
     */
    public void setUseable(String useable) {
        this.useable = useable;
    }

    /**
     * ��ȡ��������
     *
     * @return PRIMARY_PERSON - ��������
     */
    public String getPrimaryPerson() {
        return primaryPerson;
    }

    /**
     * ������������
     *
     * @param primaryPerson ��������
     */
    public void setPrimaryPerson(String primaryPerson) {
        this.primaryPerson = primaryPerson;
    }

    /**
     * ��ȡ��������
     *
     * @return DEPUTY_PERSON - ��������
     */
    public String getDeputyPerson() {
        return deputyPerson;
    }

    /**
     * ���ø�������
     *
     * @param deputyPerson ��������
     */
    public void setDeputyPerson(String deputyPerson) {
        this.deputyPerson = deputyPerson;
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