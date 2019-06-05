package com.myfund.saveplan.service;

import com.myfund.saveplan.config.DataSource;

import java.util.List;

public interface RankService {

    List getRankInfo();

    @DataSource(value = "dataSource2")
    List getFeerate();

    List getYearProfit(String fundcode);

    List getMonthLast1DayUnitEquity(String fundcode);
}
