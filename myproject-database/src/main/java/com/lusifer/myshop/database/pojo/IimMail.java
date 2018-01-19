package com.lusifer.myshop.database.pojo;

import javax.persistence.*;

@Table(name = "iim_mail")
public class IimMail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * ����
     */
    private String title;

    /**
     * ���ݸ�Ҫ
     */
    private String overview;

    /**
     * ����
     */
    private byte[] content;

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
     * ��ȡ����
     *
     * @return title - ����
     */
    public String getTitle() {
        return title;
    }

    /**
     * ���ñ���
     *
     * @param title ����
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * ��ȡ���ݸ�Ҫ
     *
     * @return overview - ���ݸ�Ҫ
     */
    public String getOverview() {
        return overview;
    }

    /**
     * �������ݸ�Ҫ
     *
     * @param overview ���ݸ�Ҫ
     */
    public void setOverview(String overview) {
        this.overview = overview;
    }

    /**
     * ��ȡ����
     *
     * @return content - ����
     */
    public byte[] getContent() {
        return content;
    }

    /**
     * ��������
     *
     * @param content ����
     */
    public void setContent(byte[] content) {
        this.content = content;
    }
}