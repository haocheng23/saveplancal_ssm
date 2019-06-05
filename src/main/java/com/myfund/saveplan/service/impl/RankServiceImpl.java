package com.myfund.saveplan.service.impl;

import com.myfund.saveplan.dao.RankDao;
import com.myfund.saveplan.service.RankService;
import com.myfund.saveplan.util.HttpClientUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class RankServiceImpl implements RankService {

    @Autowired
    private RankDao rankDao;

    @Override
    public List<Map<String, Object>> getRankInfo() {
        List<Map<String, Object>> rankInfo = rankDao.getRankInfo();
//        System.out.println(rankInfo);
        for (int i = 0; i < rankInfo.size(); i++) {
            Map map = rankInfo.get(i);
            String fundCode = rankInfo.get(i).get("FundCode").toString().trim();
            map.put("FundCode", fundCode);
        }
        return rankInfo;
    }

    @Override
    public List<Map<String, Object>> getFeerate() {
        List<Map<String, Object>> feerateList = rankDao.selectFeerate();
//        System.out.println(feerateList);
        for (int i = 0; i < feerateList.size(); i++) {
            double feerate = Double.parseDouble(feerateList.get(i).get("FEERATE").toString()) * 100;
            Map<String, Object> map = feerateList.get(i);
            map.put("FEERATE", feerate);
        }
        System.out.println(feerateList);
        return feerateList;
    }

    @Override
    public List getYearProfit(String fundcode) {
        return null;
    }

    @Override
    public List<Map<String, Object>> getMonthLast1DayUnitEquity(String fundcode) {

        List<Map<String, Object>> list = rankDao.selectMonthLast1DayUnitEquity(fundcode);
        return list;
    }


}
