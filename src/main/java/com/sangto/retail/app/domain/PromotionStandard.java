package com.sangto.retail.app.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * (PromotionStandard)实体类
 *
 * @author bww
 * @since 2020-07-14 11:06:36
 */
@ApiModel(value = "     ")
public class PromotionStandard implements Serializable {

    private static final long serialVersionUID = 165723383984993434L;

    @ApiModelProperty(value = "     (4)")
    private String standardNo;

    @ApiModelProperty(value = "     (100)")
    private String standardNa;

    @ApiModelProperty(value = "     (1)")
    private String promotionMode;

    @ApiModelProperty(value = "     (8,2)")
    private BigDecimal consum;

    @ApiModelProperty(value = "     (8,2)")
    private BigDecimal present;

    @ApiModelProperty(value = "     (5,4)")
    private BigDecimal predictProfitRate;

    @ApiModelProperty(value = "     (5,4)")
    private BigDecimal accountingRate;

    @ApiModelProperty(value = "     (5,4)")
    private BigDecimal pourDiscount;

    @ApiModelProperty(value = "     (1)")
    private String takePart;

    @ApiModelProperty(value = "     (8,2)")
    private BigDecimal buyBase;

    @ApiModelProperty(value = "     (8,2)")
    private BigDecimal useQuota;

    @ApiModelProperty(value = "     (4)")
    private String storeId;

    @ApiModelProperty(value = "     (1)")
    private String usetg;


    public String getStandardNo() {
        return standardNo;
    }

    public void setStandardNo(String standardNo) {
        this.standardNo = standardNo;
    }

    public String getStandardNa() {
        return standardNa;
    }

    public void setStandardNa(String standardNa) {
        this.standardNa = standardNa;
    }

    public String getPromotionMode() {
        return promotionMode;
    }

    public void setPromotionMode(String promotionMode) {
        this.promotionMode = promotionMode;
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

    public BigDecimal getPredictProfitRate() {
        return predictProfitRate;
    }

    public void setPredictProfitRate(BigDecimal predictProfitRate) {
        this.predictProfitRate = predictProfitRate;
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

    public String getTakePart() {
        return takePart;
    }

    public void setTakePart(String takePart) {
        this.takePart = takePart;
    }

    public BigDecimal getBuyBase() {
        return buyBase;
    }

    public void setBuyBase(BigDecimal buyBase) {
        this.buyBase = buyBase;
    }

    public BigDecimal getUseQuota() {
        return useQuota;
    }

    public void setUseQuota(BigDecimal useQuota) {
        this.useQuota = useQuota;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getUsetg() {
        return usetg;
    }

    public void setUsetg(String usetg) {
        this.usetg = usetg;
    }

}