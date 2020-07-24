package com.sangto.retail.app.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * (PromotionSalePay)实体类
 *
 * @author bww
 * @since 2020-07-14 11:06:33
 */
@ApiModel(value = "     ")
public class PromotionSalePay implements Serializable {

    private static final long serialVersionUID = -24607394590008114L;

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
    private String tradeType;

    @ApiModelProperty(value = "     (100)")
    private String account;

    @ApiModelProperty(value = "     (50)")
    private String batchno;

    @ApiModelProperty(value = "     (4)")
    private String rangeNo;

    @ApiModelProperty(value = "     (12,2)")
    private BigDecimal consMny;

    @ApiModelProperty(value = "     (datetime)")
    private String tradeTime;

    @ApiModelProperty(value = "     (1)")
    private String voidTag;


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

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
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

    public String getRangeNo() {
        return rangeNo;
    }

    public void setRangeNo(String rangeNo) {
        this.rangeNo = rangeNo;
    }

    public BigDecimal getConsMny() {
        return consMny;
    }

    public void setConsMny(BigDecimal consMny) {
        this.consMny = consMny;
    }

    public String getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(String tradeTime) {
        this.tradeTime = tradeTime;
    }

    public String getVoidTag() {
        return voidTag;
    }

    public void setVoidTag(String voidTag) {
        this.voidTag = voidTag;
    }

}