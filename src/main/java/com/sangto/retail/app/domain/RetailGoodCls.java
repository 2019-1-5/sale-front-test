package com.sangto.retail.app.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * (RetailGoodCls)实体类
 *
 * @author bww
 * @since 2020-07-14 11:10:27
 */
@ApiModel(value = "     ")
public class RetailGoodCls implements Serializable {

    private static final long serialVersionUID = 149132825944186085L;

    @ApiModelProperty(value = "     (11)")
    private Integer clsId;

    @ApiModelProperty(value = "     (255)")
    private String clsCode;

    @ApiModelProperty(value = "     (255)")
    private String clsName;

    @ApiModelProperty(value = "     (255)")
    private String highCode;

    @ApiModelProperty(value = "     (1)")
    private String lastFlag;

    @ApiModelProperty(value = "     (8,5)")
    private BigDecimal vipCoefficient;

    @ApiModelProperty(value = "     (255)")
    private String firstGradeCode;

    @ApiModelProperty(value = "     (255)")
    private String creopr;

    @ApiModelProperty(value = "     (datetime)")
    private String credate;

    @ApiModelProperty(value = "     (255)")
    private String modopr;

    @ApiModelProperty(value = "     (datetime)")
    private String moddate;


    public Integer getClsId() {
        return clsId;
    }

    public void setClsId(Integer clsId) {
        this.clsId = clsId;
    }

    public String getClsCode() {
        return clsCode;
    }

    public void setClsCode(String clsCode) {
        this.clsCode = clsCode;
    }

    public String getClsName() {
        return clsName;
    }

    public void setClsName(String clsName) {
        this.clsName = clsName;
    }

    public String getHighCode() {
        return highCode;
    }

    public void setHighCode(String highCode) {
        this.highCode = highCode;
    }

    public String getLastFlag() {
        return lastFlag;
    }

    public void setLastFlag(String lastFlag) {
        this.lastFlag = lastFlag;
    }

    public BigDecimal getVipCoefficient() {
        return vipCoefficient;
    }

    public void setVipCoefficient(BigDecimal vipCoefficient) {
        this.vipCoefficient = vipCoefficient;
    }

    public String getFirstGradeCode() {
        return firstGradeCode;
    }

    public void setFirstGradeCode(String firstGradeCode) {
        this.firstGradeCode = firstGradeCode;
    }

    public String getCreopr() {
        return creopr;
    }

    public void setCreopr(String creopr) {
        this.creopr = creopr;
    }

    public String getCredate() {
        return credate;
    }

    public void setCredate(String credate) {
        this.credate = credate;
    }

    public String getModopr() {
        return modopr;
    }

    public void setModopr(String modopr) {
        this.modopr = modopr;
    }

    public String getModdate() {
        return moddate;
    }

    public void setModdate(String moddate) {
        this.moddate = moddate;
    }

}