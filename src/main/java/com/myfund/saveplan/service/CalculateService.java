package com.myfund.saveplan.service;

import com.myfund.saveplan.config.DataSource;
import com.myfund.saveplan.pojo.Cal;

import java.util.List;
import java.util.Map;

public interface CalculateService {

    @DataSource(value = "dataSource2")
    List<Map<String, Object>> getFeerate(String fundcode);


    List<Map<String, Object>> getUnity(Cal cal);


    List<Map<String, Object>> selectLatestUnity(Cal cal);
}
