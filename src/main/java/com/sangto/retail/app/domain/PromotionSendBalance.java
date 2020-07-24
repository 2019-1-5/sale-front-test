package com.sangto.retail.app.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * (PromotionSendBalance)实体类
 *
 * @author bww
 * @since 2020-07-14 11:06:34
 */
@ApiModel(value = "     ")
public class PromotionSendBalance implements Serializable {

    private static final long serialVersionUID = -59097999562683197L;

    @ApiModelProperty(value = "     (4)")
    private String storeId;

    @ApiModelProperty(value = "     (100)")
    private String account;

    @ApiModelProperty(value = "     (50)")
    private String batchno;

    @ApiModelProperty(value = "     (4)")
    private String standardNo;

    @ApiModelProperty(value = "     (8,2)")
    private BigDecimal consum;

    @ApiModelProperty(value = "     (8,2)")
    private BigDecimal present;

    @ApiModelProperty(value = "     (12,2)")
    private BigDecimal consMnySum;

    @ApiModelProperty(value = "     (12,2)")
    private BigDecimal sendAmtSum;

    @ApiModelProperty(value = "     (12,2)")
    private BigDecimal notGivingAmt;


    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getBatchno() {
        return batchno;
    }

    public void setBatchno(String batchno) {
        this.batchno = batchno;
    }

    public String getStandardNo() {
        return standardNo;
    }

    public void setStandardNo(String standardNo) {
        this.standardNo = standardNo;
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

    public BigDecimal getConsMnySum() {
        return consMnySum;
    }

    public void setConsMnySum(BigDecimal consMnySum) {
        this.consMnySum = consMnySum;
    }

    public BigDecimal getSendAmtSum() {
        return sendAmtSum;
    }

    public void setSendAmtSum(BigDecimal sendAmtSum) {
        this.sendAmtSum = sendAmtSum;
    }

    public BigDecimal getNotGivingAmt() {
        return notGivingAmt;
    }

    public void setNotGivingAmt(BigDecimal notGivingAmt) {
        this.notGivingAmt = notGivingAmt;
    }

}