package com.myfund.saveplan.controller;

import com.myfund.saveplan.service.RankService;
import com.myfund.saveplan.util.ResultUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class RankController {

    @Resource
    private RankService rankService;

    @RequestMapping("/rank")
    @ResponseBody
    public List getRank() throws IOException {
        List<Map<String, Object>> rankInfo = rankService.getRankInfo();
        System.out.println("执行了。。。。。。。");
        System.out.println(rankInfo);
        List<Map<String, Object>> feerateList = rankService.getFeerate();

        List<Map<String, Object>> fundcodeList = new ArrayList();
        for (int i = 0; i < rankInfo.size(); i++) {
            for (int j = 0; j < feerateList.size(); j++) {
                String code1 = rankInfo.get(i).get("FundCode").toString();
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("fundcode", code1);
                fundcodeList.add(map);
                String code2 = feerateList.get(j).get("FUNDCODE").toString();
                if (code1.equals(code2)) {
                    Double feerate = (Double) feerateList.get(j).get("FEERATE");//百分数
                    Double fee = feerate * 10;//手续费
                    rankInfo.get(i).put("FeeRate", feerate);
                    rankInfo.get(i).put("Fee", fee);
                    //净申购金额
                    Double NetBuyMoney = 1000 - fee;
                    rankInfo.get(i).put("NetBuyMoney", NetBuyMoney);


                    break;
                } else {
                    rankInfo.get(i).put("FeeRate", "--");
                    rankInfo.get(i).put("Fee", "--");
                    rankInfo.get(i).put("NetBuyMoney", "--");
                }
            }
        }

        for (int i = 0; i < fundcodeList.size(); i++) {
            String fundcode = (String) fundcodeList.get(i).get("fundcode");
            List<Map<String, Object>> Last1DayUnitEquity = rankService.getMonthLast1DayUnitEquity(fundcode);
            for (int j = 0; j < Last1DayUnitEquity.size(); j++) {

                Double dayEquity = (Double) Last1DayUnitEquity.get(i).get("UnitEquity");
                //净值当天的份额
//                Double amountvol = NetBuyMoney / dayEquity;

                System.out.println("执行完成了。。。。。。。");
                System.out.println(rankInfo);

            }
        }





        return rankInfo;
    }

}
