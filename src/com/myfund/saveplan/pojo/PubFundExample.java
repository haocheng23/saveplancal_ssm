package com.myfund.saveplan.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PubFundExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PubFundExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andFundcodeIsNull() {
            addCriterion("FundCode is null");
            return (Criteria) this;
        }

        public Criteria andFundcodeIsNotNull() {
            addCriterion("FundCode is not null");
            return (Criteria) this;
        }

        public Criteria andFundcodeEqualTo(String value) {
            addCriterion("FundCode =", value, "fundcode");
            return (Criteria) this;
        }

        public Criteria andFundcodeNotEqualTo(String value) {
            addCriterion("FundCode <>", value, "fundcode");
            return (Criteria) this;
        }

        public Criteria andFundcodeGreaterThan(String value) {
            addCriterion("FundCode >", value, "fundcode");
            return (Criteria) this;
        }

        public Criteria andFundcodeGreaterThanOrEqualTo(String value) {
            addCriterion("FundCode >=", value, "fundcode");
            return (Criteria) this;
        }

        public Criteria andFundcodeLessThan(String value) {
            addCriterion("FundCode <", value, "fundcode");
            return (Criteria) this;
        }

        public Criteria andFundcodeLessThanOrEqualTo(String value) {
            addCriterion("FundCode <=", value, "fundcode");
            return (Criteria) this;
        }

        public Criteria andFundcodeLike(String value) {
            addCriterion("FundCode like", value, "fundcode");
            return (Criteria) this;
        }

        public Criteria andFundcodeNotLike(String value) {
            addCriterion("FundCode not like", value, "fundcode");
            return (Criteria) this;
        }

        public Criteria andFundcodeIn(List<String> values) {
            addCriterion("FundCode in", values, "fundcode");
            return (Criteria) this;
        }

        public Criteria andFundcodeNotIn(List<String> values) {
            addCriterion("FundCode not in", values, "fundcode");
            return (Criteria) this;
        }

        public Criteria andFundcodeBetween(String value1, String value2) {
            addCriterion("FundCode between", value1, value2, "fundcode");
            return (Criteria) this;
        }

        public Criteria andFundcodeNotBetween(String value1, String value2) {
            addCriterion("FundCode not between", value1, value2, "fundcode");
            return (Criteria) this;
        }

        public Criteria andDealdateIsNull() {
            addCriterion("DealDate is null");
            return (Criteria) this;
        }

        public Criteria andDealdateIsNotNull() {
            addCriterion("DealDate is not null");
            return (Criteria) this;
        }

        public Criteria andDealdateEqualTo(Date value) {
            addCriterion("DealDate =", value, "dealdate");
            return (Criteria) this;
        }

        public Criteria andDealdateNotEqualTo(Date value) {
            addCriterion("DealDate <>", value, "dealdate");
            return (Criteria) this;
        }

        public Criteria andDealdateGreaterThan(Date value) {
            addCriterion("DealDate >", value, "dealdate");
            return (Criteria) this;
        }

        public Criteria andDealdateGreaterThanOrEqualTo(Date value) {
            addCriterion("DealDate >=", value, "dealdate");
            return (Criteria) this;
        }

        public Criteria andDealdateLessThan(Date value) {
            addCriterion("DealDate <", value, "dealdate");
            return (Criteria) this;
        }

        public Criteria andDealdateLessThanOrEqualTo(Date value) {
            addCriterion("DealDate <=", value, "dealdate");
            return (Criteria) this;
        }

        public Criteria andDealdateIn(List<Date> values) {
            addCriterion("DealDate in", values, "dealdate");
            return (Criteria) this;
        }

        public Criteria andDealdateNotIn(List<Date> values) {
            addCriterion("DealDate not in", values, "dealdate");
            return (Criteria) this;
        }

        public Criteria andDealdateBetween(Date value1, Date value2) {
            addCriterion("DealDate between", value1, value2, "dealdate");
            return (Criteria) this;
        }

        public Criteria andDealdateNotBetween(Date value1, Date value2) {
            addCriterion("DealDate not between", value1, value2, "dealdate");
            return (Criteria) this;
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFundnameIsNull() {
            addCriterion("FundName is null");
            return (Criteria) this;
        }

        public Criteria andFundnameIsNotNull() {
            addCriterion("FundName is not null");
            return (Criteria) this;
        }

        public Criteria andFundnameEqualTo(String value) {
            addCriterion("FundName =", value, "fundname");
            return (Criteria) this;
        }

        public Criteria andFundnameNotEqualTo(String value) {
            addCriterion("FundName <>", value, "fundname");
            return (Criteria) this;
        }

        public Criteria andFundnameGreaterThan(String value) {
            addCriterion("FundName >", value, "fundname");
            return (Criteria) this;
        }

        public Criteria andFundnameGreaterThanOrEqualTo(String value) {
            addCriterion("FundName >=", value, "fundname");
            return (Criteria) this;
        }

        public Criteria andFundnameLessThan(String value) {
            addCriterion("FundName <", value, "fundname");
            return (Criteria) this;
        }

        public Criteria andFundnameLessThanOrEqualTo(String value) {
            addCriterion("FundName <=", value, "fundname");
            return (Criteria) this;
        }

        public Criteria andFundnameLike(String value) {
            addCriterion("FundName like", value, "fundname");
            return (Criteria) this;
        }

        public Criteria andFundnameNotLike(String value) {
            addCriterion("FundName not like", value, "fundname");
            return (Criteria) this;
        }

        public Criteria andFundnameIn(List<String> values) {
            addCriterion("FundName in", values, "fundname");
            return (Criteria) this;
        }

        public Criteria andFundnameNotIn(List<String> values) {
            addCriterion("FundName not in", values, "fundname");
            return (Criteria) this;
        }

        public Criteria andFundnameBetween(String value1, String value2) {
            addCriterion("FundName between", value1, value2, "fundname");
            return (Criteria) this;
        }

        public Criteria andFundnameNotBetween(String value1, String value2) {
            addCriterion("FundName not between", value1, value2, "fundname");
            return (Criteria) this;
        }

        public Criteria andUnitequityIsNull() {
            addCriterion("UnitEquity is null");
            return (Criteria) this;
        }

        public Criteria andUnitequityIsNotNull() {
            addCriterion("UnitEquity is not null");
            return (Criteria) this;
        }

        public Criteria andUnitequityEqualTo(BigDecimal value) {
            addCriterion("UnitEquity =", value, "unitequity");
            return (Criteria) this;
        }

        public Criteria andUnitequityNotEqualTo(BigDecimal value) {
            addCriterion("UnitEquity <>", value, "unitequity");
            return (Criteria) this;
        }

        public Criteria andUnitequityGreaterThan(BigDecimal value) {
            addCriterion("UnitEquity >", value, "unitequity");
            return (Criteria) this;
        }

        public Criteria andUnitequityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UnitEquity >=", value, "unitequity");
            return (Criteria) this;
        }

        public Criteria andUnitequityLessThan(BigDecimal value) {
            addCriterion("UnitEquity <", value, "unitequity");
            return (Criteria) this;
        }

        public Criteria andUnitequityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UnitEquity <=", value, "unitequity");
            return (Criteria) this;
        }

        public Criteria andUnitequityIn(List<BigDecimal> values) {
            addCriterion("UnitEquity in", values, "unitequity");
            return (Criteria) this;
        }

        public Criteria andUnitequityNotIn(List<BigDecimal> values) {
            addCriterion("UnitEquity not in", values, "unitequity");
            return (Criteria) this;
        }

        public Criteria andUnitequityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UnitEquity between", value1, value2, "unitequity");
            return (Criteria) this;
        }

        public Criteria andUnitequityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UnitEquity not between", value1, value2, "unitequity");
            return (Criteria) this;
        }

        public Criteria andTotalequityIsNull() {
            addCriterion("TotalEquity is null");
            return (Criteria) this;
        }

        public Criteria andTotalequityIsNotNull() {
            addCriterion("TotalEquity is not null");
            return (Criteria) this;
        }

        public Criteria andTotalequityEqualTo(BigDecimal value) {
            addCriterion("TotalEquity =", value, "totalequity");
            return (Criteria) this;
        }

        public Criteria andTotalequityNotEqualTo(BigDecimal value) {
            addCriterion("TotalEquity <>", value, "totalequity");
            return (Criteria) this;
        }

        public Criteria andTotalequityGreaterThan(BigDecimal value) {
            addCriterion("TotalEquity >", value, "totalequity");
            return (Criteria) this;
        }

        public Criteria andTotalequityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TotalEquity >=", value, "totalequity");
            return (Criteria) this;
        }

        public Criteria andTotalequityLessThan(BigDecimal value) {
            addCriterion("TotalEquity <", value, "totalequity");
            return (Criteria) this;
        }

        public Criteria andTotalequityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TotalEquity <=", value, "totalequity");
            return (Criteria) this;
        }

        public Criteria andTotalequityIn(List<BigDecimal> values) {
            addCriterion("TotalEquity in", values, "totalequity");
            return (Criteria) this;
        }

        public Criteria andTotalequityNotIn(List<BigDecimal> values) {
            addCriterion("TotalEquity not in", values, "totalequity");
            return (Criteria) this;
        }

        public Criteria andTotalequityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TotalEquity between", value1, value2, "totalequity");
            return (Criteria) this;
        }

        public Criteria andTotalequityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TotalEquity not between", value1, value2, "totalequity");
            return (Criteria) this;
        }

        public Criteria andEquityIsNull() {
            addCriterion("Equity is null");
            return (Criteria) this;
        }

        public Criteria andEquityIsNotNull() {
            addCriterion("Equity is not null");
            return (Criteria) this;
        }

        public Criteria andEquityEqualTo(BigDecimal value) {
            addCriterion("Equity =", value, "equity");
            return (Criteria) this;
        }

        public Criteria andEquityNotEqualTo(BigDecimal value) {
            addCriterion("Equity <>", value, "equity");
            return (Criteria) this;
        }

        public Criteria andEquityGreaterThan(BigDecimal value) {
            addCriterion("Equity >", value, "equity");
            return (Criteria) this;
        }

        public Criteria andEquityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Equity >=", value, "equity");
            return (Criteria) this;
        }

        public Criteria andEquityLessThan(BigDecimal value) {
            addCriterion("Equity <", value, "equity");
            return (Criteria) this;
        }

        public Criteria andEquityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Equity <=", value, "equity");
            return (Criteria) this;
        }

        public Criteria andEquityIn(List<BigDecimal> values) {
            addCriterion("Equity in", values, "equity");
            return (Criteria) this;
        }

        public Criteria andEquityNotIn(List<BigDecimal> values) {
            addCriterion("Equity not in", values, "equity");
            return (Criteria) this;
        }

        public Criteria andEquityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Equity between", value1, value2, "equity");
            return (Criteria) this;
        }

        public Criteria andEquityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Equity not between", value1, value2, "equity");
            return (Criteria) this;
        }

        public Criteria andDayyieldIsNull() {
            addCriterion("DayYield is null");
            return (Criteria) this;
        }

        public Criteria andDayyieldIsNotNull() {
            addCriterion("DayYield is not null");
            return (Criteria) this;
        }

        public Criteria andDayyieldEqualTo(BigDecimal value) {
            addCriterion("DayYield =", value, "dayyield");
            return (Criteria) this;
        }

        public Criteria andDayyieldNotEqualTo(BigDecimal value) {
            addCriterion("DayYield <>", value, "dayyield");
            return (Criteria) this;
        }

        public Criteria andDayyieldGreaterThan(BigDecimal value) {
            addCriterion("DayYield >", value, "dayyield");
            return (Criteria) this;
        }

        public Criteria andDayyieldGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DayYield >=", value, "dayyield");
            return (Criteria) this;
        }

        public Criteria andDayyieldLessThan(BigDecimal value) {
            addCriterion("DayYield <", value, "dayyield");
            return (Criteria) this;
        }

        public Criteria andDayyieldLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DayYield <=", value, "dayyield");
            return (Criteria) this;
        }

        public Criteria andDayyieldIn(List<BigDecimal> values) {
            addCriterion("DayYield in", values, "dayyield");
            return (Criteria) this;
        }

        public Criteria andDayyieldNotIn(List<BigDecimal> values) {
            addCriterion("DayYield not in", values, "dayyield");
            return (Criteria) this;
        }

        public Criteria andDayyieldBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DayYield between", value1, value2, "dayyield");
            return (Criteria) this;
        }

        public Criteria andDayyieldNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DayYield not between", value1, value2, "dayyield");
            return (Criteria) this;
        }

        public Criteria andProfitIsNull() {
            addCriterion("Profit is null");
            return (Criteria) this;
        }

        public Criteria andProfitIsNotNull() {
            addCriterion("Profit is not null");
            return (Criteria) this;
        }

        public Criteria andProfitEqualTo(BigDecimal value) {
            addCriterion("Profit =", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotEqualTo(BigDecimal value) {
            addCriterion("Profit <>", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitGreaterThan(BigDecimal value) {
            addCriterion("Profit >", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Profit >=", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitLessThan(BigDecimal value) {
            addCriterion("Profit <", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Profit <=", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitIn(List<BigDecimal> values) {
            addCriterion("Profit in", values, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotIn(List<BigDecimal> values) {
            addCriterion("Profit not in", values, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Profit between", value1, value2, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Profit not between", value1, value2, "profit");
            return (Criteria) this;
        }

        public Criteria andDaybenefitIsNull() {
            addCriterion("DayBenefit is null");
            return (Criteria) this;
        }

        public Criteria andDaybenefitIsNotNull() {
            addCriterion("DayBenefit is not null");
            return (Criteria) this;
        }

        public Criteria andDaybenefitEqualTo(BigDecimal value) {
            addCriterion("DayBenefit =", value, "daybenefit");
            return (Criteria) this;
        }

        public Criteria andDaybenefitNotEqualTo(BigDecimal value) {
            addCriterion("DayBenefit <>", value, "daybenefit");
            return (Criteria) this;
        }

        public Criteria andDaybenefitGreaterThan(BigDecimal value) {
            addCriterion("DayBenefit >", value, "daybenefit");
            return (Criteria) this;
        }

        public Criteria andDaybenefitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DayBenefit >=", value, "daybenefit");
            return (Criteria) this;
        }

        public Criteria andDaybenefitLessThan(BigDecimal value) {
            addCriterion("DayBenefit <", value, "daybenefit");
            return (Criteria) this;
        }

        public Criteria andDaybenefitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DayBenefit <=", value, "daybenefit");
            return (Criteria) this;
        }

        public Criteria andDaybenefitIn(List<BigDecimal> values) {
            addCriterion("DayBenefit in", values, "daybenefit");
            return (Criteria) this;
        }

        public Criteria andDaybenefitNotIn(List<BigDecimal> values) {
            addCriterion("DayBenefit not in", values, "daybenefit");
            return (Criteria) this;
        }

        public Criteria andDaybenefitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DayBenefit between", value1, value2, "daybenefit");
            return (Criteria) this;
        }

        public Criteria andDaybenefitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DayBenefit not between", value1, value2, "daybenefit");
            return (Criteria) this;
        }

        public Criteria andWeekbenefitIsNull() {
            addCriterion("WeekBenefit is null");
            return (Criteria) this;
        }

        public Criteria andWeekbenefitIsNotNull() {
            addCriterion("WeekBenefit is not null");
            return (Criteria) this;
        }

        public Criteria andWeekbenefitEqualTo(BigDecimal value) {
            addCriterion("WeekBenefit =", value, "weekbenefit");
            return (Criteria) this;
        }

        public Criteria andWeekbenefitNotEqualTo(BigDecimal value) {
            addCriterion("WeekBenefit <>", value, "weekbenefit");
            return (Criteria) this;
        }

        public Criteria andWeekbenefitGreaterThan(BigDecimal value) {
            addCriterion("WeekBenefit >", value, "weekbenefit");
            return (Criteria) this;
        }

        public Criteria andWeekbenefitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WeekBenefit >=", value, "weekbenefit");
            return (Criteria) this;
        }

        public Criteria andWeekbenefitLessThan(BigDecimal value) {
            addCriterion("WeekBenefit <", value, "weekbenefit");
            return (Criteria) this;
        }

        public Criteria andWeekbenefitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WeekBenefit <=", value, "weekbenefit");
            return (Criteria) this;
        }

        public Criteria andWeekbenefitIn(List<BigDecimal> values) {
            addCriterion("WeekBenefit in", values, "weekbenefit");
            return (Criteria) this;
        }

        public Criteria andWeekbenefitNotIn(List<BigDecimal> values) {
            addCriterion("WeekBenefit not in", values, "weekbenefit");
            return (Criteria) this;
        }

        public Criteria andWeekbenefitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WeekBenefit between", value1, value2, "weekbenefit");
            return (Criteria) this;
        }

        public Criteria andWeekbenefitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WeekBenefit not between", value1, value2, "weekbenefit");
            return (Criteria) this;
        }

        public Criteria andAdjustratioIsNull() {
            addCriterion("AdjustRatio is null");
            return (Criteria) this;
        }

        public Criteria andAdjustratioIsNotNull() {
            addCriterion("AdjustRatio is not null");
            return (Criteria) this;
        }

        public Criteria andAdjustratioEqualTo(BigDecimal value) {
            addCriterion("AdjustRatio =", value, "adjustratio");
            return (Criteria) this;
        }

        public Criteria andAdjustratioNotEqualTo(BigDecimal value) {
            addCriterion("AdjustRatio <>", value, "adjustratio");
            return (Criteria) this;
        }

        public Criteria andAdjustratioGreaterThan(BigDecimal value) {
            addCriterion("AdjustRatio >", value, "adjustratio");
            return (Criteria) this;
        }

        public Criteria andAdjustratioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AdjustRatio >=", value, "adjustratio");
            return (Criteria) this;
        }

        public Criteria andAdjustratioLessThan(BigDecimal value) {
            addCriterion("AdjustRatio <", value, "adjustratio");
            return (Criteria) this;
        }

        public Criteria andAdjustratioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AdjustRatio <=", value, "adjustratio");
            return (Criteria) this;
        }

        public Criteria andAdjustratioIn(List<BigDecimal> values) {
            addCriterion("AdjustRatio in", values, "adjustratio");
            return (Criteria) this;
        }

        public Criteria andAdjustratioNotIn(List<BigDecimal> values) {
            addCriterion("AdjustRatio not in", values, "adjustratio");
            return (Criteria) this;
        }

        public Criteria andAdjustratioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AdjustRatio between", value1, value2, "adjustratio");
            return (Criteria) this;
        }

        public Criteria andAdjustratioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AdjustRatio not between", value1, value2, "adjustratio");
            return (Criteria) this;
        }

        public Criteria andCheckbenefitIsNull() {
            addCriterion("CheckBenefit is null");
            return (Criteria) this;
        }

        public Criteria andCheckbenefitIsNotNull() {
            addCriterion("CheckBenefit is not null");
            return (Criteria) this;
        }

        public Criteria andCheckbenefitEqualTo(BigDecimal value) {
            addCriterion("CheckBenefit =", value, "checkbenefit");
            return (Criteria) this;
        }

        public Criteria andCheckbenefitNotEqualTo(BigDecimal value) {
            addCriterion("CheckBenefit <>", value, "checkbenefit");
            return (Criteria) this;
        }

        public Criteria andCheckbenefitGreaterThan(BigDecimal value) {
            addCriterion("CheckBenefit >", value, "checkbenefit");
            return (Criteria) this;
        }

        public Criteria andCheckbenefitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CheckBenefit >=", value, "checkbenefit");
            return (Criteria) this;
        }

        public Criteria andCheckbenefitLessThan(BigDecimal value) {
            addCriterion("CheckBenefit <", value, "checkbenefit");
            return (Criteria) this;
        }

        public Criteria andCheckbenefitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CheckBenefit <=", value, "checkbenefit");
            return (Criteria) this;
        }

        public Criteria andCheckbenefitIn(List<BigDecimal> values) {
            addCriterion("CheckBenefit in", values, "checkbenefit");
            return (Criteria) this;
        }

        public Criteria andCheckbenefitNotIn(List<BigDecimal> values) {
            addCriterion("CheckBenefit not in", values, "checkbenefit");
            return (Criteria) this;
        }

        public Criteria andCheckbenefitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CheckBenefit between", value1, value2, "checkbenefit");
            return (Criteria) this;
        }

        public Criteria andCheckbenefitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CheckBenefit not between", value1, value2, "checkbenefit");
            return (Criteria) this;
        }

        public Criteria andFuquanunitequityIsNull() {
            addCriterion("FuQuanUnitEquity is null");
            return (Criteria) this;
        }

        public Criteria andFuquanunitequityIsNotNull() {
            addCriterion("FuQuanUnitEquity is not null");
            return (Criteria) this;
        }

        public Criteria andFuquanunitequityEqualTo(Double value) {
            addCriterion("FuQuanUnitEquity =", value, "fuquanunitequity");
            return (Criteria) this;
        }

        public Criteria andFuquanunitequityNotEqualTo(Double value) {
            addCriterion("FuQuanUnitEquity <>", value, "fuquanunitequity");
            return (Criteria) this;
        }

        public Criteria andFuquanunitequityGreaterThan(Double value) {
            addCriterion("FuQuanUnitEquity >", value, "fuquanunitequity");
            return (Criteria) this;
        }

        public Criteria andFuquanunitequityGreaterThanOrEqualTo(Double value) {
            addCriterion("FuQuanUnitEquity >=", value, "fuquanunitequity");
            return (Criteria) this;
        }

        public Criteria andFuquanunitequityLessThan(Double value) {
            addCriterion("FuQuanUnitEquity <", value, "fuquanunitequity");
            return (Criteria) this;
        }

        public Criteria andFuquanunitequityLessThanOrEqualTo(Double value) {
            addCriterion("FuQuanUnitEquity <=", value, "fuquanunitequity");
            return (Criteria) this;
        }

        public Criteria andFuquanunitequityIn(List<Double> values) {
            addCriterion("FuQuanUnitEquity in", values, "fuquanunitequity");
            return (Criteria) this;
        }

        public Criteria andFuquanunitequityNotIn(List<Double> values) {
            addCriterion("FuQuanUnitEquity not in", values, "fuquanunitequity");
            return (Criteria) this;
        }

        public Criteria andFuquanunitequityBetween(Double value1, Double value2) {
            addCriterion("FuQuanUnitEquity between", value1, value2, "fuquanunitequity");
            return (Criteria) this;
        }

        public Criteria andFuquanunitequityNotBetween(Double value1, Double value2) {
            addCriterion("FuQuanUnitEquity not between", value1, value2, "fuquanunitequity");
            return (Criteria) this;
        }

        public Criteria andLatestweeklyyieldIsNull() {
            addCriterion("LatestWeeklyYield is null");
            return (Criteria) this;
        }

        public Criteria andLatestweeklyyieldIsNotNull() {
            addCriterion("LatestWeeklyYield is not null");
            return (Criteria) this;
        }

        public Criteria andLatestweeklyyieldEqualTo(BigDecimal value) {
            addCriterion("LatestWeeklyYield =", value, "latestweeklyyield");
            return (Criteria) this;
        }

        public Criteria andLatestweeklyyieldNotEqualTo(BigDecimal value) {
            addCriterion("LatestWeeklyYield <>", value, "latestweeklyyield");
            return (Criteria) this;
        }

        public Criteria andLatestweeklyyieldGreaterThan(BigDecimal value) {
            addCriterion("LatestWeeklyYield >", value, "latestweeklyyield");
            return (Criteria) this;
        }

        public Criteria andLatestweeklyyieldGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LatestWeeklyYield >=", value, "latestweeklyyield");
            return (Criteria) this;
        }

        public Criteria andLatestweeklyyieldLessThan(BigDecimal value) {
            addCriterion("LatestWeeklyYield <", value, "latestweeklyyield");
            return (Criteria) this;
        }

        public Criteria andLatestweeklyyieldLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LatestWeeklyYield <=", value, "latestweeklyyield");
            return (Criteria) this;
        }

        public Criteria andLatestweeklyyieldIn(List<BigDecimal> values) {
            addCriterion("LatestWeeklyYield in", values, "latestweeklyyield");
            return (Criteria) this;
        }

        public Criteria andLatestweeklyyieldNotIn(List<BigDecimal> values) {
            addCriterion("LatestWeeklyYield not in", values, "latestweeklyyield");
            return (Criteria) this;
        }

        public Criteria andLatestweeklyyieldBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LatestWeeklyYield between", value1, value2, "latestweeklyyield");
            return (Criteria) this;
        }

        public Criteria andLatestweeklyyieldNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LatestWeeklyYield not between", value1, value2, "latestweeklyyield");
            return (Criteria) this;
        }

        public Criteria andDailyprofitIsNull() {
            addCriterion("DailyProfit is null");
            return (Criteria) this;
        }

        public Criteria andDailyprofitIsNotNull() {
            addCriterion("DailyProfit is not null");
            return (Criteria) this;
        }

        public Criteria andDailyprofitEqualTo(BigDecimal value) {
            addCriterion("DailyProfit =", value, "dailyprofit");
            return (Criteria) this;
        }

        public Criteria andDailyprofitNotEqualTo(BigDecimal value) {
            addCriterion("DailyProfit <>", value, "dailyprofit");
            return (Criteria) this;
        }

        public Criteria andDailyprofitGreaterThan(BigDecimal value) {
            addCriterion("DailyProfit >", value, "dailyprofit");
            return (Criteria) this;
        }

        public Criteria andDailyprofitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DailyProfit >=", value, "dailyprofit");
            return (Criteria) this;
        }

        public Criteria andDailyprofitLessThan(BigDecimal value) {
            addCriterion("DailyProfit <", value, "dailyprofit");
            return (Criteria) this;
        }

        public Criteria andDailyprofitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DailyProfit <=", value, "dailyprofit");
            return (Criteria) this;
        }

        public Criteria andDailyprofitIn(List<BigDecimal> values) {
            addCriterion("DailyProfit in", values, "dailyprofit");
            return (Criteria) this;
        }

        public Criteria andDailyprofitNotIn(List<BigDecimal> values) {
            addCriterion("DailyProfit not in", values, "dailyprofit");
            return (Criteria) this;
        }

        public Criteria andDailyprofitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DailyProfit between", value1, value2, "dailyprofit");
            return (Criteria) this;
        }

        public Criteria andDailyprofitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DailyProfit not between", value1, value2, "dailyprofit");
            return (Criteria) this;
        }

        public Criteria andLinechartIsNull() {
            addCriterion("LineChart is null");
            return (Criteria) this;
        }

        public Criteria andLinechartIsNotNull() {
            addCriterion("LineChart is not null");
            return (Criteria) this;
        }

        public Criteria andLinechartEqualTo(Double value) {
            addCriterion("LineChart =", value, "linechart");
            return (Criteria) this;
        }

        public Criteria andLinechartNotEqualTo(Double value) {
            addCriterion("LineChart <>", value, "linechart");
            return (Criteria) this;
        }

        public Criteria andLinechartGreaterThan(Double value) {
            addCriterion("LineChart >", value, "linechart");
            return (Criteria) this;
        }

        public Criteria andLinechartGreaterThanOrEqualTo(Double value) {
            addCriterion("LineChart >=", value, "linechart");
            return (Criteria) this;
        }

        public Criteria andLinechartLessThan(Double value) {
            addCriterion("LineChart <", value, "linechart");
            return (Criteria) this;
        }

        public Criteria andLinechartLessThanOrEqualTo(Double value) {
            addCriterion("LineChart <=", value, "linechart");
            return (Criteria) this;
        }

        public Criteria andLinechartIn(List<Double> values) {
            addCriterion("LineChart in", values, "linechart");
            return (Criteria) this;
        }

        public Criteria andLinechartNotIn(List<Double> values) {
            addCriterion("LineChart not in", values, "linechart");
            return (Criteria) this;
        }

        public Criteria andLinechartBetween(Double value1, Double value2) {
            addCriterion("LineChart between", value1, value2, "linechart");
            return (Criteria) this;
        }

        public Criteria andLinechartNotBetween(Double value1, Double value2) {
            addCriterion("LineChart not between", value1, value2, "linechart");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}