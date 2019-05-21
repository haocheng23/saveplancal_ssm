package com.myfund.saveplan.service.impl;

import com.myfund.saveplan.dao.RankDao;
import com.myfund.saveplan.service.RankService;
import com.myfund.saveplan.util.HttpClientUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RankServiceImpl implements RankService {

    @Autowired
    private RankDao rankDao;

    @Override
    public List getRankInfo() {
        List<Map<String, Object>> rankInfo = rankDao.getRankInfo();
//        for (int i = 0; i < rankInfo.size(); i++) {
//            String url = "https://10.20.31.29:9091/appwebnew/ws/webapp-cxf/getFundFeeRate?fundcode=" + rankInfo.get(i).get("FundCode").toString().trim() + "&businesscode=22";
//            String s = HttpClientUtil.doGet(url);
//            System.out.println(s);
//        }
        return rankInfo;
    }
}
