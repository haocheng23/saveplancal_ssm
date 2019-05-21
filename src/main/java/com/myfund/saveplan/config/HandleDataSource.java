package com.myfund.saveplan.config;


/**
 * 数据源处理类
 * 
 * @author: haocheng
 * @date: 2019-05-21 11:52
 * 
 */
public class HandleDataSource {
    public static final ThreadLocal<String> holder = new ThreadLocal<String>();

    /**
     * 绑定当前线程数据源路由
     *
     * @param datasource
     */
    public static void setDataSource(String datasource) {
        holder.set(datasource);
    }

    /**
     * 获取当前线程的数据源路由
     *
     * @return
     */
    public static String getDataSource() {
        return holder.get();
    }

}
