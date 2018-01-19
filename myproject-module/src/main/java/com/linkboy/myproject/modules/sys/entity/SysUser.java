package com.linkboy.myproject.modules.sys.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "sys_user")
public class SysUser {
    /**
     * ���
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * ������˾
     */
    @Column(name = "company_id")
    private String companyId;

    /**
     * ��������
     */
    @Column(name = "office_id")
    private String officeId;

    /**
     * ��¼��
     */
    @Column(name = "login_name")
    private String loginName;

    /**
     * ����
     */
    private String password;

    /**
     * ����
     */
    private String no;

    /**
     * ����
     */
    private String name;

    /**
     * ����
     */
    private String email;

    /**
     * �绰
     */
    private String phone;

    /**
     * �ֻ�
     */
    private String mobile;

    /**
     * �û�����
     */
    @Column(name = "user_type")
    private String userType;

    /**
     * �û�ͷ��
     */
    private String photo;

    /**
     * ����½IP
     */
    @Column(name = "login_ip")
    private String loginIp;

    /**
     * ����½ʱ��
     */
    @Column(name = "login_date")
    private Date loginDate;

    /**
     * �Ƿ�ɵ�¼
     */
    @Column(name = "login_flag")
    private String loginFlag;

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
     * ��ά��
     */
    private String qrcode;

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
     * ��ȡ������˾
     *
     * @return company_id - ������˾
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * ���ù�����˾
     *
     * @param companyId ������˾
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
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
     * ��ȡ��¼��
     *
     * @return login_name - ��¼��
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * ���õ�¼��
     *
     * @param loginName ��¼��
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    /**
     * ��ȡ����
     *
     * @return password - ����
     */
    public String getPassword() {
        return password;
    }

    /**
     * ��������
     *
     * @param password ����
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * ��ȡ����
     *
     * @return no - ����
     */
    public String getNo() {
        return no;
    }

    /**
     * ���ù���
     *
     * @param no ����
     */
    public void setNo(String no) {
        this.no = no;
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
     * ��ȡ�ֻ�
     *
     * @return mobile - �ֻ�
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * �����ֻ�
     *
     * @param mobile �ֻ�
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * ��ȡ�û�����
     *
     * @return user_type - �û�����
     */
    public String getUserType() {
        return userType;
    }

    /**
     * �����û�����
     *
     * @param userType �û�����
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * ��ȡ�û�ͷ��
     *
     * @return photo - �û�ͷ��
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * �����û�ͷ��
     *
     * @param photo �û�ͷ��
     */
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    /**
     * ��ȡ����½IP
     *
     * @return login_ip - ����½IP
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * ��������½IP
     *
     * @param loginIp ����½IP
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    /**
     * ��ȡ����½ʱ��
     *
     * @return login_date - ����½ʱ��
     */
    public Date getLoginDate() {
        return loginDate;
    }

    /**
     * ��������½ʱ��
     *
     * @param loginDate ����½ʱ��
     */
    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    /**
     * ��ȡ�Ƿ�ɵ�¼
     *
     * @return login_flag - �Ƿ�ɵ�¼
     */
    public String getLoginFlag() {
        return loginFlag;
    }

    /**
     * �����Ƿ�ɵ�¼
     *
     * @param loginFlag �Ƿ�ɵ�¼
     */
    public void setLoginFlag(String loginFlag) {
        this.loginFlag = loginFlag;
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

    /**
     * ��ȡ��ά��
     *
     * @return qrcode - ��ά��
     */
    public String getQrcode() {
        return qrcode;
    }

    /**
     * ���ö�ά��
     *
     * @param qrcode ��ά��
     */
    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }
}