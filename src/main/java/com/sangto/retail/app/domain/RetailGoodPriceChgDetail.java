package com.sangto.retail.app.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * (RetailGoodPriceChgDetail)实体类
 *
 * @author bww
 * @since 2020-07-14 11:10:29
 */
@ApiModel(value = "     ")
public class RetailGoodPriceChgDetail implements Serializable {

    private static final long serialVersionUID = 329568482764537703L;

    @ApiModelProperty(value = "     (20)")
    private String chgno;

    @ApiModelProperty(value = "     (11)")
    private Integer seq;

    @ApiModelProperty(value = "     (20)")
    private String gdno;

    @ApiModelProperty(value = "     (8,2)")
    private BigDecimal sellingPrice;

    @ApiModelProperty(value = "     (8,2)")
    private BigDecimal vipPrice;

    @ApiModelProperty(value = "     (8,5)")
    private BigDecimal vipDiscount;

    @ApiModelProperty(value = "     (5,4)")
    private BigDecimal vipDisThan;

    @ApiModelProperty(value = "     (8,5)")
    private BigDecimal usualDiscount;

    @ApiModelProperty(value = "     (5,4)")
    private BigDecimal disThan;

    @ApiModelProperty(value = "     (8,5)")
    private BigDecimal vipCoefficient;

    @ApiModelProperty(value = "     (5,4)")
    private BigDecimal vipThan;

    @ApiModelProperty(value = "     (datetime)")
    private String beginDate;

    @ApiModelProperty(value = "     (datetime)")
    private String endDate;

    @ApiModelProperty(value = "     (1)")
    private String stat;


    public String getChgno() {
        return chgno;
    }

    public void setChgno(String chgno) {
        this.chgno = chgno;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getGdno() {
        return gdno;
    }

    public void setGdno(String gdno) {
        this.gdno = gdno;
    }

    public BigDecimal getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(BigDecimal sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public BigDecimal getVipPrice() {
        return vipPrice;
    }

    public void setVipPrice(BigDecimal vipPrice) {
        this.vipPrice = vipPrice;
    }

    public BigDecimal getVipDiscount() {
        return vipDiscount;
    }

    public void setVipDiscount(BigDecimal vipDiscount) {
        this.vipDiscount = vipDiscount;
    }

    public BigDecimal getVipDisThan() {
        return vipDisThan;
    }

    public void setVipDisThan(BigDecimal vipDisThan) {
        this.vipDisThan = vipDisThan;
    }

    public BigDecimal getUsualDiscount() {
        return usualDiscount;
    }

    public void setUsualDiscount(BigDecimal usualDiscount) {
        this.usualDiscount = usualDiscount;
    }

    public BigDecimal getDisThan() {
        return disThan;
    }

    public void setDisThan(BigDecimal disThan) {
        this.disThan = disThan;
    }

    public BigDecimal getVipCoefficient() {
        return vipCoefficient;
    }

    public void setVipCoefficient(BigDecimal vipCoefficient) {
        this.vipCoefficient = vipCoefficient;
    }

    public BigDecimal getVipThan() {
        return vipThan;
    }

    public void setVipThan(BigDecimal vipThan) {
        this.vipThan = vipThan;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

}