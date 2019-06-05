package com.myfund.saveplan.pojo;


import java.sql.Timestamp;

public class Cal {
    private String deductMoneyTime;
    private String beginDay;
    private String endDay;
    private String money;
    private String feerate;
    private String fundcode;
    private String delieverType;


    public Cal() {
    }

    public String getDeductMoneyTime() {
        return deductMoneyTime;
    }

    public void setDeductMoneyTime(String deductMoneyTime) {
        this.deductMoneyTime = deductMoneyTime;
    }

    public String getBeginDay() {
        return beginDay;
    }

    public void setBeginDay(String beginDay) {
        this.beginDay = beginDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getFeerate() {
        return feerate;
    }

    public void setFeerate(String feerate) {
        this.feerate = feerate;
    }

    public String getFundcode() {
        return fundcode;
    }

    public void setFundcode(String fundcode) {
        this.fundcode = fundcode;
    }

    public String getDelieverType() {
        return delieverType;
    }

    public void setDelieverType(String delieverType) {
        this.delieverType = delieverType;
    }
}
