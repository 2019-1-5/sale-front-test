package com.sangto.retail.app.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * (RetailGoodPriceChgHead)实体类
 *
 * @author bww
 * @since 2020-07-14 11:10:30
 */
@ApiModel(value = "     ")
public class RetailGoodPriceChgHead implements Serializable {

    private static final long serialVersionUID = 884636141154228285L;

    @ApiModelProperty(value = "     (20)")
    private String chgno;

    @ApiModelProperty(value = "     (4)")
    private String storeId;

    @ApiModelProperty(value = "     (1)")
    private String setType;

    @ApiModelProperty(value = "     (255)")
    private String saleadjCause;

    @ApiModelProperty(value = "     (datetime)")
    private String beginDate;

    @ApiModelProperty(value = "     (datetime)")
    private String endDate;

    @ApiModelProperty(value = "     (255)")
    private String proposer;

    @ApiModelProperty(value = "     (255)")
    private String creopr;

    @ApiModelProperty(value = "     (datetime)")
    private String credate;

    @ApiModelProperty(value = "     (255)")
    private String modopr;

    @ApiModelProperty(value = "     (datetime)")
    private String moddate;

    @ApiModelProperty(value = "     (255)")
    private String chkopr;

    @ApiModelProperty(value = "     (datetime)")
    private String chkdate;

    @ApiModelProperty(value = "     (1)")
    private String stat;

    @ApiModelProperty(value = "     (255)")
    private String notes;


    public String getChgno() {
        return chgno;
    }

    public void setChgno(String chgno) {
        this.chgno = chgno;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getSetType() {
        return setType;
    }

    public void setSetType(String setType) {
        this.setType = setType;
    }

    public String getSaleadjCause() {
        return saleadjCause;
    }

    public void setSaleadjCause(String saleadjCause) {
        this.saleadjCause = saleadjCause;
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

    public String getProposer() {
        return proposer;
    }

    public void setProposer(String proposer) {
        this.proposer = proposer;
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

    public String getChkopr() {
        return chkopr;
    }

    public void setChkopr(String chkopr) {
        this.chkopr = chkopr;
    }

    public String getChkdate() {
        return chkdate;
    }

    public void setChkdate(String chkdate) {
        this.chkdate = chkdate;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

}