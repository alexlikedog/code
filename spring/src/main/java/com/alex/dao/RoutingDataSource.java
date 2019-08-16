package com.alex.dao;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author alex
 * @Title: RoutingDataSource
 * @ProjectName spring
 * @Description: TODO
 * @date 2019/8/14  22:19
 */
@Slf4j
public class RoutingDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        String dataSourceName = DynamicDataSourceHolder.getDataSourceName();
        if(dataSourceName == null){
            dataSourceName = DataSourceType.DATASOURCE1.getDataSource();
        }
        log.info("选择的数据库是："+dataSourceName);
        return dataSourceName;
    }
}
