package com.myfund.saveplan.controller;

import com.myfund.saveplan.service.RankService;
import com.myfund.saveplan.util.ResultUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
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
        for (int i = 0; i < rankInfo.size(); i++) {
            for (int j = 0; j < feerateList.size(); j++) {
                String code1 = rankInfo.get(i).get("FundCode").toString();
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
        System.out.println("执行完成了。。。。。。。");
        System.out.println(rankInfo);


        return rankInfo;
    }

}
