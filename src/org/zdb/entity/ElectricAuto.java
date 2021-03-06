package org.zdb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 4.4.5电表-自动抄表记录
 * ElectricAuto
 * 数据库表：electric_auto
 */
public class ElectricAuto implements Serializable {

    /**
     * 
     * 表字段 : electric_auto.ea_id
     */
    private Long eaId;

    /**
     * 设备id
     * 表字段 : electric_auto.ea_eq_id
     */
    private Long eaEqId;

    /**
     * 渠道id
     * 表字段 : electric_auto.ea_channel_id
     */
    private Long eaChannelId;

    /**
     * 抄表时间
     * 表字段 : electric_auto.ea_time
     */
    private Date eaTime;

    /**
     * 抄表读数
     * 表字段 : electric_auto.ea_read_num
     */
    private BigDecimal eaReadNum;

    /**
     * 余量
     * 表字段 : electric_auto.ea_residue_num
     */
    private BigDecimal eaResidueNum;

    /**
     * 使用量 （与最近一次抄表相比）
     * 表字段 : electric_auto.ea_use_num
     */
    private BigDecimal eaUseNum;

    /**
     * 尖读数
     * 表字段 : electric_auto.ea_sharp_num
     */
    private BigDecimal eaSharpNum;

    /**
     * 峰读数
     * 表字段 : electric_auto.ea_peak_num
     */
    private BigDecimal eaPeakNum;

    /**
     * 平读数
     * 表字段 : electric_auto.ea_flat_num
     */
    private BigDecimal eaFlatNum;

    /**
     * 谷读数
     * 表字段 : electric_auto.ea_valley_num
     */
    private BigDecimal eaValleyNum;

    /**
     * 抄表人
     * 表字段 : electric_auto.ea_create_admin
     */
    private String eaCreateAdmin;

    /**
     * 需量
     * 表字段 : electric_auto.ea_need
     */
    private Long eaNeed;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table electric_auto
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取  字段:electric_auto.ea_id
     *
     * @return electric_auto.ea_id, 
     */
    public Long getEaId() {
        return eaId;
    }

    /**
     * 设置  字段:electric_auto.ea_id
     *
     * @param eaId the value for electric_auto.ea_id, 
     */
    public void setEaId(Long eaId) {
        this.eaId = eaId;
    }

    /**
     * 获取 设备id 字段:electric_auto.ea_eq_id
     *
     * @return electric_auto.ea_eq_id, 设备id
     */
    public Long getEaEqId() {
        return eaEqId;
    }

    /**
     * 设置 设备id 字段:electric_auto.ea_eq_id
     *
     * @param eaEqId the value for electric_auto.ea_eq_id, 设备id
     */
    public void setEaEqId(Long eaEqId) {
        this.eaEqId = eaEqId;
    }

    /**
     * 获取 渠道id 字段:electric_auto.ea_channel_id
     *
     * @return electric_auto.ea_channel_id, 渠道id
     */
    public Long getEaChannelId() {
        return eaChannelId;
    }

    /**
     * 设置 渠道id 字段:electric_auto.ea_channel_id
     *
     * @param eaChannelId the value for electric_auto.ea_channel_id, 渠道id
     */
    public void setEaChannelId(Long eaChannelId) {
        this.eaChannelId = eaChannelId;
    }

    /**
     * 获取 抄表时间 字段:electric_auto.ea_time
     *
     * @return electric_auto.ea_time, 抄表时间
     */
    public Date getEaTime() {
        return eaTime;
    }

    /**
     * 设置 抄表时间 字段:electric_auto.ea_time
     *
     * @param eaTime the value for electric_auto.ea_time, 抄表时间
     */
    public void setEaTime(Date eaTime) {
        this.eaTime = eaTime;
    }

    /**
     * 获取 抄表读数 字段:electric_auto.ea_read_num
     *
     * @return electric_auto.ea_read_num, 抄表读数
     */
    public BigDecimal getEaReadNum() {
        return eaReadNum;
    }

    /**
     * 设置 抄表读数 字段:electric_auto.ea_read_num
     *
     * @param eaReadNum the value for electric_auto.ea_read_num, 抄表读数
     */
    public void setEaReadNum(BigDecimal eaReadNum) {
        this.eaReadNum = eaReadNum;
    }

    /**
     * 获取 余量 字段:electric_auto.ea_residue_num
     *
     * @return electric_auto.ea_residue_num, 余量
     */
    public BigDecimal getEaResidueNum() {
        return eaResidueNum;
    }

    /**
     * 设置 余量 字段:electric_auto.ea_residue_num
     *
     * @param eaResidueNum the value for electric_auto.ea_residue_num, 余量
     */
    public void setEaResidueNum(BigDecimal eaResidueNum) {
        this.eaResidueNum = eaResidueNum;
    }

    /**
     * 获取 使用量 （与最近一次抄表相比） 字段:electric_auto.ea_use_num
     *
     * @return electric_auto.ea_use_num, 使用量 （与最近一次抄表相比）
     */
    public BigDecimal getEaUseNum() {
        return eaUseNum;
    }

    /**
     * 设置 使用量 （与最近一次抄表相比） 字段:electric_auto.ea_use_num
     *
     * @param eaUseNum the value for electric_auto.ea_use_num, 使用量 （与最近一次抄表相比）
     */
    public void setEaUseNum(BigDecimal eaUseNum) {
        this.eaUseNum = eaUseNum;
    }

    /**
     * 获取 尖读数 字段:electric_auto.ea_sharp_num
     *
     * @return electric_auto.ea_sharp_num, 尖读数
     */
    public BigDecimal getEaSharpNum() {
        return eaSharpNum;
    }

    /**
     * 设置 尖读数 字段:electric_auto.ea_sharp_num
     *
     * @param eaSharpNum the value for electric_auto.ea_sharp_num, 尖读数
     */
    public void setEaSharpNum(BigDecimal eaSharpNum) {
        this.eaSharpNum = eaSharpNum;
    }

    /**
     * 获取 峰读数 字段:electric_auto.ea_peak_num
     *
     * @return electric_auto.ea_peak_num, 峰读数
     */
    public BigDecimal getEaPeakNum() {
        return eaPeakNum;
    }

    /**
     * 设置 峰读数 字段:electric_auto.ea_peak_num
     *
     * @param eaPeakNum the value for electric_auto.ea_peak_num, 峰读数
     */
    public void setEaPeakNum(BigDecimal eaPeakNum) {
        this.eaPeakNum = eaPeakNum;
    }

    /**
     * 获取 平读数 字段:electric_auto.ea_flat_num
     *
     * @return electric_auto.ea_flat_num, 平读数
     */
    public BigDecimal getEaFlatNum() {
        return eaFlatNum;
    }

    /**
     * 设置 平读数 字段:electric_auto.ea_flat_num
     *
     * @param eaFlatNum the value for electric_auto.ea_flat_num, 平读数
     */
    public void setEaFlatNum(BigDecimal eaFlatNum) {
        this.eaFlatNum = eaFlatNum;
    }

    /**
     * 获取 谷读数 字段:electric_auto.ea_valley_num
     *
     * @return electric_auto.ea_valley_num, 谷读数
     */
    public BigDecimal getEaValleyNum() {
        return eaValleyNum;
    }

    /**
     * 设置 谷读数 字段:electric_auto.ea_valley_num
     *
     * @param eaValleyNum the value for electric_auto.ea_valley_num, 谷读数
     */
    public void setEaValleyNum(BigDecimal eaValleyNum) {
        this.eaValleyNum = eaValleyNum;
    }

    /**
     * 获取 抄表人 字段:electric_auto.ea_create_admin
     *
     * @return electric_auto.ea_create_admin, 抄表人
     */
    public String getEaCreateAdmin() {
        return eaCreateAdmin;
    }

    /**
     * 设置 抄表人 字段:electric_auto.ea_create_admin
     *
     * @param eaCreateAdmin the value for electric_auto.ea_create_admin, 抄表人
     */
    public void setEaCreateAdmin(String eaCreateAdmin) {
        this.eaCreateAdmin = eaCreateAdmin == null ? null : eaCreateAdmin.trim();
    }

    /**
     * 获取 需量 字段:electric_auto.ea_need
     *
     * @return electric_auto.ea_need, 需量
     */
    public Long getEaNeed() {
        return eaNeed;
    }

    /**
     * 设置 需量 字段:electric_auto.ea_need
     *
     * @param eaNeed the value for electric_auto.ea_need, 需量
     */
    public void setEaNeed(Long eaNeed) {
        this.eaNeed = eaNeed;
    }
}