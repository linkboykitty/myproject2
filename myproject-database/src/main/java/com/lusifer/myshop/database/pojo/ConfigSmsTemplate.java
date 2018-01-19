package com.lusifer.myshop.database.pojo;

import javax.persistence.*;

@Table(name = "config_sms_template")
public class ConfigSmsTemplate {
    /**
     * ���
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * ģ������
     */
    @Column(name = "sms_template_name")
    private String smsTemplateName;

    /**
     * ģ�����
     */
    @Column(name = "sms_template_code")
    private String smsTemplateCode;

    /**
     * ģ������
     */
    @Column(name = "sms_template_type")
    private String smsTemplateType;

    /**
     * ��������
     */
    @Column(name = "sms_template_content")
    private String smsTemplateContent;

    /**
     * ���
     */
    @Column(name = "config_sms")
    private String configSms;

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
     * ��ȡģ������
     *
     * @return sms_template_name - ģ������
     */
    public String getSmsTemplateName() {
        return smsTemplateName;
    }

    /**
     * ����ģ������
     *
     * @param smsTemplateName ģ������
     */
    public void setSmsTemplateName(String smsTemplateName) {
        this.smsTemplateName = smsTemplateName;
    }

    /**
     * ��ȡģ�����
     *
     * @return sms_template_code - ģ�����
     */
    public String getSmsTemplateCode() {
        return smsTemplateCode;
    }

    /**
     * ����ģ�����
     *
     * @param smsTemplateCode ģ�����
     */
    public void setSmsTemplateCode(String smsTemplateCode) {
        this.smsTemplateCode = smsTemplateCode;
    }

    /**
     * ��ȡģ������
     *
     * @return sms_template_type - ģ������
     */
    public String getSmsTemplateType() {
        return smsTemplateType;
    }

    /**
     * ����ģ������
     *
     * @param smsTemplateType ģ������
     */
    public void setSmsTemplateType(String smsTemplateType) {
        this.smsTemplateType = smsTemplateType;
    }

    /**
     * ��ȡ��������
     *
     * @return sms_template_content - ��������
     */
    public String getSmsTemplateContent() {
        return smsTemplateContent;
    }

    /**
     * ���ö�������
     *
     * @param smsTemplateContent ��������
     */
    public void setSmsTemplateContent(String smsTemplateContent) {
        this.smsTemplateContent = smsTemplateContent;
    }

    /**
     * ��ȡ���
     *
     * @return config_sms - ���
     */
    public String getConfigSms() {
        return configSms;
    }

    /**
     * �������
     *
     * @param configSms ���
     */
    public void setConfigSms(String configSms) {
        this.configSms = configSms;
    }
}