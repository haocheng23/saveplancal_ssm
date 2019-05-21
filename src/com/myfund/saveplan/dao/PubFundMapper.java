package com.myfund.saveplan.dao;

import com.myfund.saveplan.pojo.PubFund;
import com.myfund.saveplan.pojo.PubFundExample;
import com.myfund.saveplan.pojo.PubFundKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PubFundMapper {
    long countByExample(PubFundExample example);

    int deleteByExample(PubFundExample example);

    int deleteByPrimaryKey(PubFundKey key);

    int insert(PubFund record);

    int insertSelective(PubFund record);

    List<PubFund> selectByExample(PubFundExample example);

    PubFund selectByPrimaryKey(PubFundKey key);

    int updateByExampleSelective(@Param("record") PubFund record, @Param("example") PubFundExample example);

    int updateByExample(@Param("record") PubFund record, @Param("example") PubFundExample example);

    int updateByPrimaryKeySelective(PubFund record);

    int updateByPrimaryKey(PubFund record);
}