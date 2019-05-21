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
        List<Map<String, Object>> feerate = rankService.getFeerate();
        for (int i = 0; i < rankInfo.size(); i++) {
            for (int j = 0; j < feerate.size(); j++) {
                String code1 = rankInfo.get(i).get("FundCode").toString().trim();
                String code2 = feerate.get(j).get("FUNDCODE").toString().trim();
                if (code1.equals(code2)){
                    String fee = feerate.get(j).get("FEE").toString();
                    rankInfo.get(i).put("fee", feerate.get(j).get("FEE"));
                    break;
                }else{
                    rankInfo.get(i).put("fee", "--");
                }
            }
        }
        System.out.println("执行完成了。。。。。。。");
        System.out.println(rankInfo);
        return rankInfo;
    }

}
