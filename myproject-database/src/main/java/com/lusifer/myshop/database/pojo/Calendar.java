package com.lusifer.myshop.database.pojo;

import javax.persistence.*;

public class Calendar {
    /**
     * ����
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * �¼�����
     */
    private String title;

    /**
     * �¼���ʼʱ��
     */
    private String starttime;

    /**
     * �¼�����ʱ��
     */
    private String endtime;

    /**
     * �Ƿ�Ϊȫ��ʱ��
     */
    private String allday;

    /**
     * ʱ��ı���ɫ
     */
    private String color;

    private String userid;

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
     * ��ȡ�¼�����
     *
     * @return title - �¼�����
     */
    public String getTitle() {
        return title;
    }

    /**
     * �����¼�����
     *
     * @param title �¼�����
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * ��ȡ�¼���ʼʱ��
     *
     * @return starttime - �¼���ʼʱ��
     */
    public String getStarttime() {
        return starttime;
    }

    /**
     * �����¼���ʼʱ��
     *
     * @param starttime �¼���ʼʱ��
     */
    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    /**
     * ��ȡ�¼�����ʱ��
     *
     * @return endtime - �¼�����ʱ��
     */
    public String getEndtime() {
        return endtime;
    }

    /**
     * �����¼�����ʱ��
     *
     * @param endtime �¼�����ʱ��
     */
    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    /**
     * ��ȡ�Ƿ�Ϊȫ��ʱ��
     *
     * @return allday - �Ƿ�Ϊȫ��ʱ��
     */
    public String getAllday() {
        return allday;
    }

    /**
     * �����Ƿ�Ϊȫ��ʱ��
     *
     * @param allday �Ƿ�Ϊȫ��ʱ��
     */
    public void setAllday(String allday) {
        this.allday = allday;
    }

    /**
     * ��ȡʱ��ı���ɫ
     *
     * @return color - ʱ��ı���ɫ
     */
    public String getColor() {
        return color;
    }

    /**
     * ����ʱ��ı���ɫ
     *
     * @param color ʱ��ı���ɫ
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return userid
     */
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }
}