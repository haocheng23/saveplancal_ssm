package com.myfund.saveplan.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class PubFund {
    private Integer id;

    private String fundcode;

    private Date dealdate;

    private String fundname;

    private BigDecimal unitequity;

    private BigDecimal totalequity;

    private BigDecimal equity;

    private BigDecimal dayyield;

    private BigDecimal profit;

    private BigDecimal daybenefit;

    private BigDecimal weekbenefit;

    private BigDecimal adjustratio;

    private BigDecimal checkbenefit;

    private Double fuquanunitequity;

    private BigDecimal latestweeklyyield;

    private BigDecimal dailyprofit;

    private Double linechart;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFundname() {
        return fundname;
    }

    public void setFundname(String fundname) {
        this.fundname = fundname == null ? null : fundname.trim();
    }

    public BigDecimal getUnitequity() {
        return unitequity;
    }

    public void setUnitequity(BigDecimal unitequity) {
        this.unitequity = unitequity;
    }

    public BigDecimal getTotalequity() {
        return totalequity;
    }

    public void setTotalequity(BigDecimal totalequity) {
        this.totalequity = totalequity;
    }

    public BigDecimal getEquity() {
        return equity;
    }

    public void setEquity(BigDecimal equity) {
        this.equity = equity;
    }

    public BigDecimal getDayyield() {
        return dayyield;
    }

    public void setDayyield(BigDecimal dayyield) {
        this.dayyield = dayyield;
    }

    public BigDecimal getProfit() {
        return profit;
    }

    public void setProfit(BigDecimal profit) {
        this.profit = profit;
    }

    public BigDecimal getDaybenefit() {
        return daybenefit;
    }

    public void setDaybenefit(BigDecimal daybenefit) {
        this.daybenefit = daybenefit;
    }

    public BigDecimal getWeekbenefit() {
        return weekbenefit;
    }

    public void setWeekbenefit(BigDecimal weekbenefit) {
        this.weekbenefit = weekbenefit;
    }

    public BigDecimal getAdjustratio() {
        return adjustratio;
    }

    public void setAdjustratio(BigDecimal adjustratio) {
        this.adjustratio = adjustratio;
    }

    public BigDecimal getCheckbenefit() {
        return checkbenefit;
    }

    public void setCheckbenefit(BigDecimal checkbenefit) {
        this.checkbenefit = checkbenefit;
    }

    public Double getFuquanunitequity() {
        return fuquanunitequity;
    }

    public void setFuquanunitequity(Double fuquanunitequity) {
        this.fuquanunitequity = fuquanunitequity;
    }

    public BigDecimal getLatestweeklyyield() {
        return latestweeklyyield;
    }

    public void setLatestweeklyyield(BigDecimal latestweeklyyield) {
        this.latestweeklyyield = latestweeklyyield;
    }

    public BigDecimal getDailyprofit() {
        return dailyprofit;
    }

    public void setDailyprofit(BigDecimal dailyprofit) {
        this.dailyprofit = dailyprofit;
    }

    public Double getLinechart() {
        return linechart;
    }

    public void setLinechart(Double linechart) {
        this.linechart = linechart;
    }

    public String getFundcode() {
        return fundcode;
    }

    public void setFundcode(String fundcode) {
        this.fundcode = fundcode;
    }

    public Date getDealdate() {
        return dealdate;
    }

    public void setDealdate(Date dealdate) {
        this.dealdate = dealdate;
    }
}