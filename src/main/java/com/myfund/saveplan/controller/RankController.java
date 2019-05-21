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

@Controller
public class RankController {

    @Resource
    private RankService rankService;

    @RequestMapping("/rank")
    @ResponseBody
    public List getRank() throws IOException {
        List rankInfo = rankService.getRankInfo();
        System.out.println("执行了。。。。。。。");
        List feerate = rankService.getFeerate();
        System.out.println(feerate.toString());
        return rankInfo;
    }

}
