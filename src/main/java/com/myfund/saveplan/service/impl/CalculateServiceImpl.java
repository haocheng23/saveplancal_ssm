package com.myfund.saveplan.service.impl;

import com.myfund.saveplan.dao.CalculateDao;
import com.myfund.saveplan.pojo.Cal;
import com.myfund.saveplan.service.CalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CalculateServiceImpl implements CalculateService {
    @Autowired
    private CalculateDao calculateDao;


    public List<Map<String, Object>> getFeerate(String fundcode) {
        List<Map<String, Object>> feerateMap = calculateDao.selectFeerate(fundcode);
//        System.out.println(feerateList);
        double feerate = Double.parseDouble(feerateMap.get(0).get("FEERATE").toString()) * 100;
        feerateMap.get(0).put("FEERATE", feerate);
        System.out.println(feerateMap.toString());
        return feerateMap;
    }

    @Override
    public List<Map<String, Object>> getUnity(Cal cal) {
        List<Map<String, Object>> unityMap = calculateDao.selectUnity(cal);
        System.out.println(unityMap);
        return unityMap;
    }

    @Override
    public List<Map<String, Object>> selectLatestUnity(Cal cal) {
        List<Map<String, Object>> latestUnity = calculateDao.selectLatestUnity(cal);
        return latestUnity;
    }


}







