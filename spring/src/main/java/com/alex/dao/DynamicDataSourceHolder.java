package com.alex.dao;

/**
 * @author alex
 * @Title: DynamicDataSourceHolder
 * @ProjectName spring
 * @Description: TODO
 * @date 2019/8/14  22:26
 */
public class DynamicDataSourceHolder {
    //解决线程安全问题
    private static final ThreadLocal<String> holder = new ThreadLocal<String>();

    public static void putDataSourceName(String dataName){
        holder.set(dataName);
    }

    public static String getDataSourceName(){
        return holder.get();
    }
    public static void  clear(){
        holder.remove();
    }

    public static class DataSourceName{
        public final static String BASE = "datasource1";
    }
}
