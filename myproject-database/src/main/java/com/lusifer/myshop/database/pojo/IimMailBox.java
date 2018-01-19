package com.lusifer.myshop.database.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "iim_mail_box")
public class IimMailBox {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * ״̬ 0 δ�� 1 �Ѷ�
     */
    private String readstatus;

    /**
     * ������
     */
    @Column(name = "senderId")
    private String senderid;

    /**
     * �ռ���
     */
    @Column(name = "receiverId")
    private String receiverid;

    /**
     * ����ʱ��
     */
    private Date sendtime;

    /**
     * �ʼ����
     */
    private String mailid;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * ��ȡ״̬ 0 δ�� 1 �Ѷ�
     *
     * @return readstatus - ״̬ 0 δ�� 1 �Ѷ�
     */
    public String getReadstatus() {
        return readstatus;
    }

    /**
     * ����״̬ 0 δ�� 1 �Ѷ�
     *
     * @param readstatus ״̬ 0 δ�� 1 �Ѷ�
     */
    public void setReadstatus(String readstatus) {
        this.readstatus = readstatus;
    }

    /**
     * ��ȡ������
     *
     * @return senderId - ������
     */
    public String getSenderid() {
        return senderid;
    }

    /**
     * ���÷�����
     *
     * @param senderid ������
     */
    public void setSenderid(String senderid) {
        this.senderid = senderid;
    }

    /**
     * ��ȡ�ռ���
     *
     * @return receiverId - �ռ���
     */
    public String getReceiverid() {
        return receiverid;
    }

    /**
     * �����ռ���
     *
     * @param receiverid �ռ���
     */
    public void setReceiverid(String receiverid) {
        this.receiverid = receiverid;
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return sendtime - ����ʱ��
     */
    public Date getSendtime() {
        return sendtime;
    }

    /**
     * ���÷���ʱ��
     *
     * @param sendtime ����ʱ��
     */
    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    /**
     * ��ȡ�ʼ����
     *
     * @return mailid - �ʼ����
     */
    public String getMailid() {
        return mailid;
    }

    /**
     * �����ʼ����
     *
     * @param mailid �ʼ����
     */
    public void setMailid(String mailid) {
        this.mailid = mailid;
    }
}