package com.lusifer.myshop.database.pojo;

import javax.persistence.*;

@Table(name = "config_mail")
public class ConfigMail {
    /**
     * ���
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * ������
     */
    @Column(name = "mail_host")
    private String mailHost;

    /**
     * �����˿�
     */
    @Column(name = "mail_port")
    private Integer mailPort;

    /**
     * �����ַ
     */
    @Column(name = "mail_username")
    private String mailUsername;

    /**
     * ��������
     */
    @Column(name = "mail_password")
    private String mailPassword;

    /**
     * �������ǳ�
     */
    @Column(name = "mail_from")
    private String mailFrom;

    /**
     * ʹ��SSL/TLS
     */
    @Column(name = "mail_ssl")
    private String mailSsl;

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
     * ��ȡ������
     *
     * @return mail_host - ������
     */
    public String getMailHost() {
        return mailHost;
    }

    /**
     * ����������
     *
     * @param mailHost ������
     */
    public void setMailHost(String mailHost) {
        this.mailHost = mailHost;
    }

    /**
     * ��ȡ�����˿�
     *
     * @return mail_port - �����˿�
     */
    public Integer getMailPort() {
        return mailPort;
    }

    /**
     * ���������˿�
     *
     * @param mailPort �����˿�
     */
    public void setMailPort(Integer mailPort) {
        this.mailPort = mailPort;
    }

    /**
     * ��ȡ�����ַ
     *
     * @return mail_username - �����ַ
     */
    public String getMailUsername() {
        return mailUsername;
    }

    /**
     * ���������ַ
     *
     * @param mailUsername �����ַ
     */
    public void setMailUsername(String mailUsername) {
        this.mailUsername = mailUsername;
    }

    /**
     * ��ȡ��������
     *
     * @return mail_password - ��������
     */
    public String getMailPassword() {
        return mailPassword;
    }

    /**
     * ������������
     *
     * @param mailPassword ��������
     */
    public void setMailPassword(String mailPassword) {
        this.mailPassword = mailPassword;
    }

    /**
     * ��ȡ�������ǳ�
     *
     * @return mail_from - �������ǳ�
     */
    public String getMailFrom() {
        return mailFrom;
    }

    /**
     * ���÷������ǳ�
     *
     * @param mailFrom �������ǳ�
     */
    public void setMailFrom(String mailFrom) {
        this.mailFrom = mailFrom;
    }

    /**
     * ��ȡʹ��SSL/TLS
     *
     * @return mail_ssl - ʹ��SSL/TLS
     */
    public String getMailSsl() {
        return mailSsl;
    }

    /**
     * ����ʹ��SSL/TLS
     *
     * @param mailSsl ʹ��SSL/TLS
     */
    public void setMailSsl(String mailSsl) {
        this.mailSsl = mailSsl;
    }
}