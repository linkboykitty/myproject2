package com.lusifer.myshop.database.pojo;

import javax.persistence.*;

@Table(name = "config_aliyun_push")
public class ConfigAliyunPush {
    /**
     * ���
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * Key
     */
    @Column(name = "access_key_id")
    private String accessKeyId;

    /**
     * Secret
     */
    @Column(name = "access_key_secret")
    private String accessKeySecret;

    /**
     * AppKey
     */
    @Column(name = "app_key")
    private String appKey;

    /**
     * RegionId
     */
    @Column(name = "region_id")
    private String regionId;

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
     * ��ȡKey
     *
     * @return access_key_id - Key
     */
    public String getAccessKeyId() {
        return accessKeyId;
    }

    /**
     * ����Key
     *
     * @param accessKeyId Key
     */
    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    /**
     * ��ȡSecret
     *
     * @return access_key_secret - Secret
     */
    public String getAccessKeySecret() {
        return accessKeySecret;
    }

    /**
     * ����Secret
     *
     * @param accessKeySecret Secret
     */
    public void setAccessKeySecret(String accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
    }

    /**
     * ��ȡAppKey
     *
     * @return app_key - AppKey
     */
    public String getAppKey() {
        return appKey;
    }

    /**
     * ����AppKey
     *
     * @param appKey AppKey
     */
    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    /**
     * ��ȡRegionId
     *
     * @return region_id - RegionId
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * ����RegionId
     *
     * @param regionId RegionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }
}