package com.myfund.saveplan.config;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 注解类（设置数据源时需要使用本注解）
 *
 * @author: haocheng
 * @date: 2019-05-21 10:38
 *
 */
//该类型的注解会被保留到那个阶段
@Retention(RetentionPolicy.RUNTIME)
//注解执行的目标地址  TYPE  类/接口    METHOD  方法    PARAMETER  参数
@Target(ElementType.METHOD)
public @interface DataSource {
    String value();
}