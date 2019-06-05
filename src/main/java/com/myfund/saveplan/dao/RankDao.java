package com.myfund.saveplan.dao;


import java.util.List;
import java.util.Map;

public interface RankDao {

    //获取定投排名信息
    List<Map<String, Object>> getRankInfo();


    List<Map<String, Object>> selectFeerate();


    List<Map<String, Object>> selectLast1YearProfit(String fundcode);


    List<Map<String, Object>> selectMonthLast1DayUnitEquity(String fundcode);

}