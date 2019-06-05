package com.myfund.saveplan.dao;

import com.myfund.saveplan.pojo.Cal;

import java.util.List;
import java.util.Map;

public interface CalculateDao {

    List<Map<String, Object>> selectFeerate(String fundcode);


    List<Map<String, Object>> selectUnity(Cal cal);


    List<Map<String, Object>> selectLatestUnity(Cal cal);



}