package com.sangto.retail.app.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * (RetailGoodPrice)实体类
 *
 * @author bww
 * @since 2020-07-14 11:10:28
 */
@ApiModel(value = "     ")
public class RetailGoodPrice implements Serializable {

    private static final long serialVersionUID = 809413383892855887L;

    @ApiModelProperty(value = "     (4)")
    private String storeId;

    @ApiModelProperty(value = "     (20)")
    private String gdno;

    @ApiModelProperty(value = "     (8,2)")
    private BigDecimal purchasingPrice;

    @ApiModelProperty(value = "     (8,2)")
    private BigDecimal sellingPrice;

    @ApiModelProperty(value = "     (1)")
    private String vipDisTg;

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

    @ApiModelProperty(value = "     (5,4)")
    private BigDecimal taxrate;

    @ApiModelProperty(value = "     (5,4)")
    private BigDecimal outTaxrate;

    @ApiModelProperty(value = "     (1)")
    private String netSaleTg;

    @ApiModelProperty(value = "     (1)")
    private String priceLinkageTg;

    @ApiModelProperty(value = "     (5,4)")
    private BigDecimal linkageRatio;

    @ApiModelProperty(value = "     (255)")
    private String creopr;

    @ApiModelProperty(value = "     (datetime)")
    private String credate;

    @ApiModelProperty(value = "     (255)")
    private String modopr;

    @ApiModelProperty(value = "     (datetime)")
    private String moddate;


    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getGdno() {
        return gdno;
    }

    public void setGdno(String gdno) {
        this.gdno = gdno;
    }

    public BigDecimal getPurchasingPrice() {
        return purchasingPrice;
    }

    public void setPurchasingPrice(BigDecimal purchasingPrice) {
        this.purchasingPrice = purchasingPrice;
    }

    public BigDecimal getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(BigDecimal sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String getVipDisTg() {
        return vipDisTg;
    }

    public void setVipDisTg(String vipDisTg) {
        this.vipDisTg = vipDisTg;
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

    public BigDecimal getTaxrate() {
        return taxrate;
    }

    public void setTaxrate(BigDecimal taxrate) {
        this.taxrate = taxrate;
    }

    public BigDecimal getOutTaxrate() {
        return outTaxrate;
    }

    public void setOutTaxrate(BigDecimal outTaxrate) {
        this.outTaxrate = outTaxrate;
    }

    public String getNetSaleTg() {
        return netSaleTg;
    }

    public void setNetSaleTg(String netSaleTg) {
        this.netSaleTg = netSaleTg;
    }

    public String getPriceLinkageTg() {
        return priceLinkageTg;
    }

    public void setPriceLinkageTg(String priceLinkageTg) {
        this.priceLinkageTg = priceLinkageTg;
    }

    public BigDecimal getLinkageRatio() {
        return linkageRatio;
    }

    public void setLinkageRatio(BigDecimal linkageRatio) {
        this.linkageRatio = linkageRatio;
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