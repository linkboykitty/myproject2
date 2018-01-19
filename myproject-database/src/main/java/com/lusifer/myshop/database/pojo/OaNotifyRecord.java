package com.lusifer.myshop.database.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "oa_notify_record")
public class OaNotifyRecord {
    /**
     * ���
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * ֪ͨͨ��ID
     */
    @Column(name = "oa_notify_id")
    private String oaNotifyId;

    /**
     * ������
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * �Ķ����
     */
    @Column(name = "read_flag")
    private String readFlag;

    /**
     * �Ķ�ʱ��
     */
    @Column(name = "read_date")
    private Date readDate;

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
     * ��ȡ֪ͨͨ��ID
     *
     * @return oa_notify_id - ֪ͨͨ��ID
     */
    public String getOaNotifyId() {
        return oaNotifyId;
    }

    /**
     * ����֪ͨͨ��ID
     *
     * @param oaNotifyId ֪ͨͨ��ID
     */
    public void setOaNotifyId(String oaNotifyId) {
        this.oaNotifyId = oaNotifyId;
    }

    /**
     * ��ȡ������
     *
     * @return user_id - ������
     */
    public String getUserId() {
        return userId;
    }

    /**
     * ���ý�����
     *
     * @param userId ������
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * ��ȡ�Ķ����
     *
     * @return read_flag - �Ķ����
     */
    public String getReadFlag() {
        return readFlag;
    }

    /**
     * �����Ķ����
     *
     * @param readFlag �Ķ����
     */
    public void setReadFlag(String readFlag) {
        this.readFlag = readFlag;
    }

    /**
     * ��ȡ�Ķ�ʱ��
     *
     * @return read_date - �Ķ�ʱ��
     */
    public Date getReadDate() {
        return readDate;
    }

    /**
     * �����Ķ�ʱ��
     *
     * @param readDate �Ķ�ʱ��
     */
    public void setReadDate(Date readDate) {
        this.readDate = readDate;
    }
}