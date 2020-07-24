package com.sangto.retail.app.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * (TradeHead)实体类
 *
 * @author bww
 * @since 2020-07-14 11:15:38
 */
@ApiModel(value = "     ")
public class TradeHead implements Serializable {

    private static final long serialVersionUID = -70021610095018842L;

    @ApiModelProperty(value = "     (4)")
    private String shopNo;

    @ApiModelProperty(value = "     (8)")
    private String workDay;

    @ApiModelProperty(value = "     (50)")
    private String tradeNo;

    @ApiModelProperty(value = "     (20)")
    private String posNo;

    @ApiModelProperty(value = "     (11)")
    private Integer shiftNo;

    @ApiModelProperty(value = "     (1)")
    private String posMode;

    @ApiModelProperty(value = "     (20)")
    private String casherNo;

    @ApiModelProperty(value = "     (20)")
    private String contractNo;

    @ApiModelProperty(value = "     (1)")
    private String cardReqType;

    @ApiModelProperty(value = "     (32)")
    private String cardNo;

    @ApiModelProperty(value = "     (32)")
    private String cardAccount;

    @ApiModelProperty(value = "     (3)")
    private String cardType;

    @ApiModelProperty(value = "     (1)")
    private String tradeType;

    @ApiModelProperty(value = "     (12,2)")
    private BigDecimal tradeMoney;

    @ApiModelProperty(value = "     (12,2)")
    private BigDecimal decreaseMoney;

    @ApiModelProperty(value = "     (12,2)")
    private BigDecimal discGiftMoney;

    @ApiModelProperty(value = "     (255)")
    private String discGiftNo;

    @ApiModelProperty(value = "     (12,2)")
    private BigDecimal discMoney;

    @ApiModelProperty(value = "     (12,2)")
    private BigDecimal shouldPayMoney;

    @ApiModelProperty(value = "     (11)")
    private Integer payNum;

    @ApiModelProperty(value = "     (12,2)")
    private BigDecimal payMoney;

    @ApiModelProperty(value = "     (1)")
    private String stat;

    @ApiModelProperty(value = "     (datetime)")
    private String tradeDate;

    @ApiModelProperty(value = "     (1)")
    private String accountTag;

    @ApiModelProperty(value = "     (datetime)")
    private String accountDate;

    @ApiModelProperty(value = "     (1)")
    private String cancelTag;

    @ApiModelProperty(value = "     (datetime)")
    private String cancelDate;

    @ApiModelProperty(value = "     (8)")
    private String orgWorkDay;

    @ApiModelProperty(value = "     (50)")
    private String orgTradeNo;

    @ApiModelProperty(value = "     (12,2)")
    private BigDecimal orgTradeMoney;

    @ApiModelProperty(value = "     (12,2)")
    private BigDecimal refundMoney;

    @ApiModelProperty(value = "     (datetime)")
    private String tradeSaleDate;

    @ApiModelProperty(value = "     (1)")
    private String tradeSaleTag;

    @ApiModelProperty(value = "     (50)")
    private String promotionBacthNo;

    @ApiModelProperty(value = "     (50)")
    private String localNo;

    @ApiModelProperty(value = "     (100)")
    private String otherTradeNo;

    @ApiModelProperty(value = "     (255)")
    private String note;

    @ApiModelProperty(value = "     (1)")
    private String dataFlag;

    @ApiModelProperty(value = "     (12,2)")
    private BigDecimal freight;

    @ApiModelProperty(value = "     (1)")
    private String crmTag;


    public String getShopNo() {
        return shopNo;
    }

    public void setShopNo(String shopNo) {
        this.shopNo = shopNo;
    }

    public String getWorkDay() {
        return workDay;
    }

    public void setWorkDay(String workDay) {
        this.workDay = workDay;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getPosNo() {
        return posNo;
    }

    public void setPosNo(String posNo) {
        this.posNo = posNo;
    }

    public Integer getShiftNo() {
        return shiftNo;
    }

    public void setShiftNo(Integer shiftNo) {
        this.shiftNo = shiftNo;
    }

    public String getPosMode() {
        return posMode;
    }

    public void setPosMode(String posMode) {
        this.posMode = posMode;
    }

    public String getCasherNo() {
        return casherNo;
    }

    public void setCasherNo(String casherNo) {
        this.casherNo = casherNo;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getCardReqType() {
        return cardReqType;
    }

    public void setCardReqType(String cardReqType) {
        this.cardReqType = cardReqType;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardAccount() {
        return cardAccount;
    }

    public void setCardAccount(String cardAccount) {
        this.cardAccount = cardAccount;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public BigDecimal getTradeMoney() {
        return tradeMoney;
    }

    public void setTradeMoney(BigDecimal tradeMoney) {
        this.tradeMoney = tradeMoney;
    }

    public BigDecimal getDecreaseMoney() {
        return decreaseMoney;
    }

    public void setDecreaseMoney(BigDecimal decreaseMoney) {
        this.decreaseMoney = decreaseMoney;
    }

    public BigDecimal getDiscGiftMoney() {
        return discGiftMoney;
    }

    public void setDiscGiftMoney(BigDecimal discGiftMoney) {
        this.discGiftMoney = discGiftMoney;
    }

    public String getDiscGiftNo() {
        return discGiftNo;
    }

    public void setDiscGiftNo(String discGiftNo) {
        this.discGiftNo = discGiftNo;
    }

    public BigDecimal getDiscMoney() {
        return discMoney;
    }

    public void setDiscMoney(BigDecimal discMoney) {
        this.discMoney = discMoney;
    }

    public BigDecimal getShouldPayMoney() {
        return shouldPayMoney;
    }

    public void setShouldPayMoney(BigDecimal shouldPayMoney) {
        this.shouldPayMoney = shouldPayMoney;
    }

    public Integer getPayNum() {
        return payNum;
    }

    public void setPayNum(Integer payNum) {
        this.payNum = payNum;
    }

    public BigDecimal getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(BigDecimal payMoney) {
        this.payMoney = payMoney;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public String getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate;
    }

    public String getAccountTag() {
        return accountTag;
    }

    public void setAccountTag(String accountTag) {
        this.accountTag = accountTag;
    }

    public String getAccountDate() {
        return accountDate;
    }

    public void setAccountDate(String accountDate) {
        this.accountDate = accountDate;
    }

    public String getCancelTag() {
        return cancelTag;
    }

    public void setCancelTag(String cancelTag) {
        this.cancelTag = cancelTag;
    }

    public String getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(String cancelDate) {
        this.cancelDate = cancelDate;
    }

    public String getOrgWorkDay() {
        return orgWorkDay;
    }

    public void setOrgWorkDay(String orgWorkDay) {
        this.orgWorkDay = orgWorkDay;
    }

    public String getOrgTradeNo() {
        return orgTradeNo;
    }

    public void setOrgTradeNo(String orgTradeNo) {
        this.orgTradeNo = orgTradeNo;
    }

    public BigDecimal getOrgTradeMoney() {
        return orgTradeMoney;
    }

    public void setOrgTradeMoney(BigDecimal orgTradeMoney) {
        this.orgTradeMoney = orgTradeMoney;
    }

    public BigDecimal getRefundMoney() {
        return refundMoney;
    }

    public void setRefundMoney(BigDecimal refundMoney) {
        this.refundMoney = refundMoney;
    }

    public String getTradeSaleDate() {
        return tradeSaleDate;
    }

    public void setTradeSaleDate(String tradeSaleDate) {
        this.tradeSaleDate = tradeSaleDate;
    }

    public String getTradeSaleTag() {
        return tradeSaleTag;
    }

    public void setTradeSaleTag(String tradeSaleTag) {
        this.tradeSaleTag = tradeSaleTag;
    }

    public String getPromotionBacthNo() {
        return promotionBacthNo;
    }

    public void setPromotionBacthNo(String promotionBacthNo) {
        this.promotionBacthNo = promotionBacthNo;
    }

    public String getLocalNo() {
        return localNo;
    }

    public void setLocalNo(String localNo) {
        this.localNo = localNo;
    }

    public String getOtherTradeNo() {
        return otherTradeNo;
    }

    public void setOtherTradeNo(String otherTradeNo) {
        this.otherTradeNo = otherTradeNo;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getDataFlag() {
        return dataFlag;
    }

    public void setDataFlag(String dataFlag) {
        this.dataFlag = dataFlag;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public String getCrmTag() {
        return crmTag;
    }

    public void setCrmTag(String crmTag) {
        this.crmTag = crmTag;
    }

}