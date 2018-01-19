package com.lusifer.myshop.database.pojo;

import javax.persistence.*;

@Table(name = "config_sms")
public class ConfigSms {
    /**
     * ���
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * AccessId
     */
    @Column(name = "sms_access_id")
    private String smsAccessId;

    /**
     * AccessKey
     */
    @Column(name = "sms_access_key")
    private String smsAccessKey;

    /**
     * MNSEndpoint
     */
    @Column(name = "sms_mns_endpoint")
    private String smsMnsEndpoint;

    /**
     * ����
     */
    @Column(name = "sms_topic")
    private String smsTopic;

    /**
     * ǩ��
     */
    @Column(name = "sms_sign_name")
    private String smsSignName;

    /**
     * �����ֻ�
     */
    @Column(name = "test_number")
    private String testNumber;

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
     * ��ȡAccessId
     *
     * @return sms_access_id - AccessId
     */
    public String getSmsAccessId() {
        return smsAccessId;
    }

    /**
     * ����AccessId
     *
     * @param smsAccessId AccessId
     */
    public void setSmsAccessId(String smsAccessId) {
        this.smsAccessId = smsAccessId;
    }

    /**
     * ��ȡAccessKey
     *
     * @return sms_access_key - AccessKey
     */
    public String getSmsAccessKey() {
        return smsAccessKey;
    }

    /**
     * ����AccessKey
     *
     * @param smsAccessKey AccessKey
     */
    public void setSmsAccessKey(String smsAccessKey) {
        this.smsAccessKey = smsAccessKey;
    }

    /**
     * ��ȡMNSEndpoint
     *
     * @return sms_mns_endpoint - MNSEndpoint
     */
    public String getSmsMnsEndpoint() {
        return smsMnsEndpoint;
    }

    /**
     * ����MNSEndpoint
     *
     * @param smsMnsEndpoint MNSEndpoint
     */
    public void setSmsMnsEndpoint(String smsMnsEndpoint) {
        this.smsMnsEndpoint = smsMnsEndpoint;
    }

    /**
     * ��ȡ����
     *
     * @return sms_topic - ����
     */
    public String getSmsTopic() {
        return smsTopic;
    }

    /**
     * ��������
     *
     * @param smsTopic ����
     */
    public void setSmsTopic(String smsTopic) {
        this.smsTopic = smsTopic;
    }

    /**
     * ��ȡǩ��
     *
     * @return sms_sign_name - ǩ��
     */
    public String getSmsSignName() {
        return smsSignName;
    }

    /**
     * ����ǩ��
     *
     * @param smsSignName ǩ��
     */
    public void setSmsSignName(String smsSignName) {
        this.smsSignName = smsSignName;
    }

    /**
     * ��ȡ�����ֻ�
     *
     * @return test_number - �����ֻ�
     */
    public String getTestNumber() {
        return testNumber;
    }

    /**
     * ���ò����ֻ�
     *
     * @param testNumber �����ֻ�
     */
    public void setTestNumber(String testNumber) {
        this.testNumber = testNumber;
    }
}