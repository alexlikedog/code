package com.alex.aop;

import java.lang.annotation.*;

@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ChooseDataSource {
    /**
     * 数据库名称 默认datasource1
     * @return 数据库名称
     */
    String dataSourceName() default "datasource1";
}
