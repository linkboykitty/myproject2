package com.lusifer.myshop.database.pojo;

import javax.persistence.*;

@Table(name = "test_interface")
public class TestInterface {
    /**
     * ����
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * �ӿ�����
     */
    private String type;

    /**
     * ����URL
     */
    private String url;

    /**
     * ����body
     */
    private String body;

    /**
     * �ɹ�ʱ������Ϣ
     */
    private String successmsg;

    /**
     * ʧ��ʱ������Ϣ
     */
    private String errormsg;

    /**
     * ��ע
     */
    private String remarks;

    /**
     * ɾ�����
     */
    @Column(name = "del_flag")
    private String delFlag;

    /**
     * �ӿ�����
     */
    private String name;

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
     * ��ȡ�ӿ�����
     *
     * @return type - �ӿ�����
     */
    public String getType() {
        return type;
    }

    /**
     * ���ýӿ�����
     *
     * @param type �ӿ�����
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * ��ȡ����URL
     *
     * @return url - ����URL
     */
    public String getUrl() {
        return url;
    }

    /**
     * ��������URL
     *
     * @param url ����URL
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * ��ȡ����body
     *
     * @return body - ����body
     */
    public String getBody() {
        return body;
    }

    /**
     * ��������body
     *
     * @param body ����body
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * ��ȡ�ɹ�ʱ������Ϣ
     *
     * @return successmsg - �ɹ�ʱ������Ϣ
     */
    public String getSuccessmsg() {
        return successmsg;
    }

    /**
     * ���óɹ�ʱ������Ϣ
     *
     * @param successmsg �ɹ�ʱ������Ϣ
     */
    public void setSuccessmsg(String successmsg) {
        this.successmsg = successmsg;
    }

    /**
     * ��ȡʧ��ʱ������Ϣ
     *
     * @return errormsg - ʧ��ʱ������Ϣ
     */
    public String getErrormsg() {
        return errormsg;
    }

    /**
     * ����ʧ��ʱ������Ϣ
     *
     * @param errormsg ʧ��ʱ������Ϣ
     */
    public void setErrormsg(String errormsg) {
        this.errormsg = errormsg;
    }

    /**
     * ��ȡ��ע
     *
     * @return remarks - ��ע
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * ���ñ�ע
     *
     * @param remarks ��ע
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
     * ��ȡ�ӿ�����
     *
     * @return name - �ӿ�����
     */
    public String getName() {
        return name;
    }

    /**
     * ���ýӿ�����
     *
     * @param name �ӿ�����
     */
    public void setName(String name) {
        this.name = name;
    }
}