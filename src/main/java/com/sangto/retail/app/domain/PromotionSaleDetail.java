package com.sangto.retail.app.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * (PromotionSaleDetail)实体类
 *
 * @author bww
 * @since 2020-07-14 11:06:24
 */
@ApiModel(value = "     ")
public class PromotionSaleDetail implements Serializable {

    private static final long serialVersionUID = 814004521939549240L;

    @ApiModelProperty(value = "     (4)")
    private String storeId;

    @ApiModelProperty(value = "     (8)")
    private String workDay;

    @ApiModelProperty(value = "     (8)")
    private String saleDay;

    @ApiModelProperty(value = "     (50)")
    private String tradeNo;

    @ApiModelProperty(value = "     (11)")
    private Integer seqNo;

    @ApiModelProperty(value = "     (1)")
    private String metchType;

    @ApiModelProperty(value = "     (20)")
    private String contractNo;

    @ApiModelProperty(value = "     (4)")
    private String saleCodeType;

    @ApiModelProperty(value = "     (4)")
    private String rangeNo;

    @ApiModelProperty(value = "     (20)")
    private String saleCode;

    @ApiModelProperty(value = "     (12,3)")
    private BigDecimal num;

    @ApiModelProperty(value = "     (12,2)")
    private BigDecimal saleMoney;

    @ApiModelProperty(value = "     (50)")
    private String batchno;

    @ApiModelProperty(value = "     (1)")
    private String promotionMode;

    @ApiModelProperty(value = "     (4)")
    private String standardNo;

    @ApiModelProperty(value = "     (12,2)")
    private BigDecimal giftAmtShare;

    @ApiModelProperty(value = "     (12,2)")
    private BigDecimal giftDiscShare;

    @ApiModelProperty(value = "     (8,2)")
    private BigDecimal consum;

    @ApiModelProperty(value = "     (8,2)")
    private BigDecimal present;

    @ApiModelProperty(value = "     (5,4)")
    private BigDecimal accountingRate;

    @ApiModelProperty(value = "     (5,4)")
    private BigDecimal pourDiscount;


    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getWorkDay() {
        return workDay;
    }

    public void setWorkDay(String workDay) {
        this.workDay = workDay;
    }

    public String getSaleDay() {
        return saleDay;
    }

    public void setSaleDay(String saleDay) {
        this.saleDay = saleDay;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public Integer getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(Integer seqNo) {
        this.seqNo = seqNo;
    }

    public String getMetchType() {
        return metchType;
    }

    public void setMetchType(String metchType) {
        this.metchType = metchType;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getSaleCodeType() {
        return saleCodeType;
    }

    public void setSaleCodeType(String saleCodeType) {
        this.saleCodeType = saleCodeType;
    }

    public String getRangeNo() {
        return rangeNo;
    }

    public void setRangeNo(String rangeNo) {
        this.rangeNo = rangeNo;
    }

    public String getSaleCode() {
        return saleCode;
    }

    public void setSaleCode(String saleCode) {
        this.saleCode = saleCode;
    }

    public BigDecimal getNum() {
        return num;
    }

    public void setNum(BigDecimal num) {
        this.num = num;
    }

    public BigDecimal getSaleMoney() {
        return saleMoney;
    }

    public void setSaleMoney(BigDecimal saleMoney) {
        this.saleMoney = saleMoney;
    }

    public String getBatchno() {
        return batchno;
    }

    public void setBatchno(String batchno) {
        this.batchno = batchno;
    }

    public String getPromotionMode() {
        return promotionMode;
    }

    public void setPromotionMode(String promotionMode) {
        this.promotionMode = promotionMode;
    }

    public String getStandardNo() {
        return standardNo;
    }

    public void setStandardNo(String standardNo) {
        this.standardNo = standardNo;
    }

    public BigDecimal getGiftAmtShare() {
        return giftAmtShare;
    }

    public void setGiftAmtShare(BigDecimal giftAmtShare) {
        this.giftAmtShare = giftAmtShare;
    }

    public BigDecimal getGiftDiscShare() {
        return giftDiscShare;
    }

    public void setGiftDiscShare(BigDecimal giftDiscShare) {
        this.giftDiscShare = giftDiscShare;
    }

    public BigDecimal getConsum() {
        return consum;
    }

    public void setConsum(BigDecimal consum) {
        this.consum = consum;
    }

    public BigDecimal getPresent() {
        return present;
    }

    public void setPresent(BigDecimal present) {
        this.present = present;
    }

    public BigDecimal getAccountingRate() {
        return accountingRate;
    }

    public void setAccountingRate(BigDecimal accountingRate) {
        this.accountingRate = accountingRate;
    }

    public BigDecimal getPourDiscount() {
        return pourDiscount;
    }

    public void setPourDiscount(BigDecimal pourDiscount) {
        this.pourDiscount = pourDiscount;
    }

}