package com.myfund.saveplan.dao;


import java.util.List;
import java.util.Map;

public interface RankDao {

    //获取定投排名信息
    List<Map<String, Object>> getRankInfo();
}