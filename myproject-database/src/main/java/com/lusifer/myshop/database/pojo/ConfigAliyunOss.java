package com.lusifer.myshop.database.pojo;

import javax.persistence.*;

@Table(name = "config_aliyun_oss")
public class ConfigAliyunOss {
    /**
     * ���
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * Key
     */
    @Column(name = "oss_key")
    private String ossKey;

    /**
     * Secret
     */
    @Column(name = "oss_secret")
    private String ossSecret;

    /**
     * Bucket Name
     */
    @Column(name = "bucket_name")
    private String bucketName;

    /**
     * OSS End Point
     */
    @Column(name = "oss_end_point")
    private String ossEndPoint;

    /**
     * �Զ����� Bucket
     */
    @Column(name = "auto_create_bucket")
    private String autoCreateBucket;

    /**
     * ֧�ְٶȸ��ı�
     */
    @Column(name = "baidu_use_status")
    private String baiduUseStatus;

    /**
     * ���� CDN
     */
    @Column(name = "use_cdn")
    private String useCdn;

    /**
     * CDN End Point
     */
    @Column(name = "cdn_end_point")
    private String cdnEndPoint;

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
     * @return oss_key - Key
     */
    public String getOssKey() {
        return ossKey;
    }

    /**
     * ����Key
     *
     * @param ossKey Key
     */
    public void setOssKey(String ossKey) {
        this.ossKey = ossKey;
    }

    /**
     * ��ȡSecret
     *
     * @return oss_secret - Secret
     */
    public String getOssSecret() {
        return ossSecret;
    }

    /**
     * ����Secret
     *
     * @param ossSecret Secret
     */
    public void setOssSecret(String ossSecret) {
        this.ossSecret = ossSecret;
    }

    /**
     * ��ȡBucket Name
     *
     * @return bucket_name - Bucket Name
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * ����Bucket Name
     *
     * @param bucketName Bucket Name
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * ��ȡOSS End Point
     *
     * @return oss_end_point - OSS End Point
     */
    public String getOssEndPoint() {
        return ossEndPoint;
    }

    /**
     * ����OSS End Point
     *
     * @param ossEndPoint OSS End Point
     */
    public void setOssEndPoint(String ossEndPoint) {
        this.ossEndPoint = ossEndPoint;
    }

    /**
     * ��ȡ�Զ����� Bucket
     *
     * @return auto_create_bucket - �Զ����� Bucket
     */
    public String getAutoCreateBucket() {
        return autoCreateBucket;
    }

    /**
     * �����Զ����� Bucket
     *
     * @param autoCreateBucket �Զ����� Bucket
     */
    public void setAutoCreateBucket(String autoCreateBucket) {
        this.autoCreateBucket = autoCreateBucket;
    }

    /**
     * ��ȡ֧�ְٶȸ��ı�
     *
     * @return baidu_use_status - ֧�ְٶȸ��ı�
     */
    public String getBaiduUseStatus() {
        return baiduUseStatus;
    }

    /**
     * ����֧�ְٶȸ��ı�
     *
     * @param baiduUseStatus ֧�ְٶȸ��ı�
     */
    public void setBaiduUseStatus(String baiduUseStatus) {
        this.baiduUseStatus = baiduUseStatus;
    }

    /**
     * ��ȡ���� CDN
     *
     * @return use_cdn - ���� CDN
     */
    public String getUseCdn() {
        return useCdn;
    }

    /**
     * �������� CDN
     *
     * @param useCdn ���� CDN
     */
    public void setUseCdn(String useCdn) {
        this.useCdn = useCdn;
    }

    /**
     * ��ȡCDN End Point
     *
     * @return cdn_end_point - CDN End Point
     */
    public String getCdnEndPoint() {
        return cdnEndPoint;
    }

    /**
     * ����CDN End Point
     *
     * @param cdnEndPoint CDN End Point
     */
    public void setCdnEndPoint(String cdnEndPoint) {
        this.cdnEndPoint = cdnEndPoint;
    }
}