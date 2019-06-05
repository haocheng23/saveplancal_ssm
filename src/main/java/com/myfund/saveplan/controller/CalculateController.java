package com.myfund.saveplan.controller;

import com.myfund.saveplan.pojo.Cal;
import com.myfund.saveplan.service.CalculateService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CalculateController {
    @Resource
    private CalculateService calculateService;

    //获取费率
    @RequestMapping(value = "/feerate", method = RequestMethod.POST)
    @ResponseBody
    public List getFeerate(@RequestParam("fundcode") String fundcode) {
        List feerate = calculateService.getFeerate(fundcode);
        return feerate;
    }

    //定投明细   TODO-hc 缺失（现金分红/红利再投）部分
    @RequestMapping(value = "/toCalculate", method = RequestMethod.POST)
    @ResponseBody
    public List toCalculate(@ModelAttribute("cal") Cal cal) {

        //累计份额
        BigDecimal totalVol = new BigDecimal("0");
        //本金
        BigDecimal money = new BigDecimal(cal.getMoney());
        //费率
        BigDecimal feerate = new BigDecimal(String.valueOf(Double.valueOf(cal.getFeerate()) / 100));
        //净申购金额 = 本金 / (1 + 费率)
        BigDecimal pureMoney = money.divide((feerate.add(new BigDecimal("1"))), 4, BigDecimal.ROUND_HALF_UP);
        //手续费
        BigDecimal fee = money.subtract(pureMoney);
        List<Map<String, Object>> unity = calculateService.getUnity(cal);
        for (int i = 0; i < unity.size(); i++) {
            Map<String, Object> map = unity.get(i);
            map.put("number", i + 1);
            map.put("money", money);
            map.put("FundCode", unity.get(i).get("FundCode").toString().trim());
            //单位净值
            BigDecimal unitEquity = (BigDecimal) unity.get(i).get("UnitEquity");
            //确认份额
            BigDecimal confirmedVol = pureMoney.divide(unitEquity, 4, BigDecimal.ROUND_HALF_UP);
            map.put("confirmedVol", confirmedVol);
            totalVol = totalVol.add(confirmedVol);
            map.put("totalVol", totalVol);
        }
        System.out.println(unity);

        //投资总期数
        int totalNumber = unity.size();
        //总投入
        BigDecimal totalMoney = money.multiply(BigDecimal.valueOf(totalNumber));
        //最新累计份额
        BigDecimal newestTotalVol = (BigDecimal) unity.get(unity.size() - 1).get("totalVol");
        //选定区间内的最新净值
        List<Map<String, Object>> latestUnity = calculateService.selectLatestUnity(cal);
        BigDecimal newestUnity = (BigDecimal) latestUnity.get(0).get("UnitEquity");
        //期末总资产
        BigDecimal totalAssets = newestTotalVol.multiply(newestUnity);
        //总收益
        BigDecimal totalYield = totalAssets.subtract(totalMoney);
        //收益率百分比
        BigDecimal yieldRate = totalYield.divide(totalMoney, 4, BigDecimal.ROUND_HALF_UP);
        BigDecimal yieldRatePercent = yieldRate.multiply(BigDecimal.valueOf(100));

        List<Map<String, Object>> calResult = new ArrayList<>();
        Map<String, Object> map2 = new HashMap<>();
        map2.put("totalNumber", totalNumber);
        map2.put("totalMoney", totalMoney);
        map2.put("totalAssets", totalAssets);
        map2.put("totalYield", totalYield);
        map2.put("yieldRatePercent", yieldRatePercent);
        calResult.add(map2);


        //合并数据集
        List<Map<String, Object>> result = new ArrayList<>();
        Map<String, Object> map3 = new HashMap<>();
        map3.put("savePlanDetail", unity);
        map3.put("savePlanResult", calResult);
        result.add(map3);
        return result;
    }

}
