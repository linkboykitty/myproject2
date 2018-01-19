package com.lusifer.myshop.database.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_log")
public class SysLog {
    /**
     * ���
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * ��־����
     */
    private String type;

    /**
     * ��־����
     */
    private String title;

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
     * ����IP��ַ
     */
    @Column(name = "remote_addr")
    private String remoteAddr;

    /**
     * �û�����
     */
    @Column(name = "user_agent")
    private String userAgent;

    /**
     * ����URI
     */
    @Column(name = "request_uri")
    private String requestUri;

    /**
     * ������ʽ
     */
    private String method;

    /**
     * �����ύ������
     */
    private String params;

    /**
     * �쳣��Ϣ
     */
    private String exception;

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
     * ��ȡ��־����
     *
     * @return type - ��־����
     */
    public String getType() {
        return type;
    }

    /**
     * ������־����
     *
     * @param type ��־����
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * ��ȡ��־����
     *
     * @return title - ��־����
     */
    public String getTitle() {
        return title;
    }

    /**
     * ������־����
     *
     * @param title ��־����
     */
    public void setTitle(String title) {
        this.title = title;
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
     * ��ȡ����IP��ַ
     *
     * @return remote_addr - ����IP��ַ
     */
    public String getRemoteAddr() {
        return remoteAddr;
    }

    /**
     * ���ò���IP��ַ
     *
     * @param remoteAddr ����IP��ַ
     */
    public void setRemoteAddr(String remoteAddr) {
        this.remoteAddr = remoteAddr;
    }

    /**
     * ��ȡ�û�����
     *
     * @return user_agent - �û�����
     */
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * �����û�����
     *
     * @param userAgent �û�����
     */
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    /**
     * ��ȡ����URI
     *
     * @return request_uri - ����URI
     */
    public String getRequestUri() {
        return requestUri;
    }

    /**
     * ��������URI
     *
     * @param requestUri ����URI
     */
    public void setRequestUri(String requestUri) {
        this.requestUri = requestUri;
    }

    /**
     * ��ȡ������ʽ
     *
     * @return method - ������ʽ
     */
    public String getMethod() {
        return method;
    }

    /**
     * ���ò�����ʽ
     *
     * @param method ������ʽ
     */
    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * ��ȡ�����ύ������
     *
     * @return params - �����ύ������
     */
    public String getParams() {
        return params;
    }

    /**
     * ���ò����ύ������
     *
     * @param params �����ύ������
     */
    public void setParams(String params) {
        this.params = params;
    }

    /**
     * ��ȡ�쳣��Ϣ
     *
     * @return exception - �쳣��Ϣ
     */
    public String getException() {
        return exception;
    }

    /**
     * �����쳣��Ϣ
     *
     * @param exception �쳣��Ϣ
     */
    public void setException(String exception) {
        this.exception = exception;
    }
}