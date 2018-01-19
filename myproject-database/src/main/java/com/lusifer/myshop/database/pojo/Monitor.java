package com.lusifer.myshop.database.pojo;

import javax.persistence.*;

public class Monitor {
    /**
     * ����
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * cpuʹ����
     */
    private String cpu;

    /**
     * jvmʹ����
     */
    private String jvm;

    /**
     * �ڴ�ʹ����
     */
    private String ram;

    /**
     * ����֪ͨ����
     */
    private String toemail;

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
     * ��ȡcpuʹ����
     *
     * @return cpu - cpuʹ����
     */
    public String getCpu() {
        return cpu;
    }

    /**
     * ����cpuʹ����
     *
     * @param cpu cpuʹ����
     */
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    /**
     * ��ȡjvmʹ����
     *
     * @return jvm - jvmʹ����
     */
    public String getJvm() {
        return jvm;
    }

    /**
     * ����jvmʹ����
     *
     * @param jvm jvmʹ����
     */
    public void setJvm(String jvm) {
        this.jvm = jvm;
    }

    /**
     * ��ȡ�ڴ�ʹ����
     *
     * @return ram - �ڴ�ʹ����
     */
    public String getRam() {
        return ram;
    }

    /**
     * �����ڴ�ʹ����
     *
     * @param ram �ڴ�ʹ����
     */
    public void setRam(String ram) {
        this.ram = ram;
    }

    /**
     * ��ȡ����֪ͨ����
     *
     * @return toemail - ����֪ͨ����
     */
    public String getToemail() {
        return toemail;
    }

    /**
     * ���þ���֪ͨ����
     *
     * @param toemail ����֪ͨ����
     */
    public void setToemail(String toemail) {
        this.toemail = toemail;
    }
}