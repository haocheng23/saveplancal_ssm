package com.myfund.saveplan.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;


/**
 * 数据源选择类
 *
 * @author: haocheng
 * @date: 2019-05-21 13:54
 *
 */
public class ChooseDataSource extends AbstractRoutingDataSource {

    /**
     * 获取与数据源相关的key
     * 此key是Map<String, DataSource> resolvedDataSources 中与数据源绑定的key值
     * 在通过determineTargetDataSource获取目标数据源时使用
     */
    @Override
    protected Object determineCurrentLookupKey() {
        // 从自定义的位置获取数据源标识
        return HandleDataSource.getDataSource();
    }
}
