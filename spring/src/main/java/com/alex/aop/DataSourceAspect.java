package com.alex.aop;

import com.alex.dao.DataSourceType;
import com.alex.dao.DynamicDataSourceHolder;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

/**
 * @author alex
 * @Title: DataSourceAspect
 * @ProjectName spring
 * @Description: TODO
 * @date 2019/8/14  23:08
 */
@Slf4j
@Aspect
public class DataSourceAspect {
    @Pointcut("@annotation(com.alex.aop.ChooseDataSource)")
    public void pointCut() {}
    
    @Before("pointCut()")
    public void before(JoinPoint point) {
        log.info("...前置增强选择key...");
        MethodSignature signa = (MethodSignature) point.getSignature();
        Method method = signa.getMethod();
        ChooseDataSource annotationClass = method.getAnnotation(ChooseDataSource.class);
        if(annotationClass != null){
            String sourceName = annotationClass.dataSourceName();
            DynamicDataSourceHolder.putDataSourceName(sourceName);
        }else{
            DynamicDataSourceHolder.putDataSourceName(DataSourceType.DATASOURCE1.getName());
        }
    }

    /**
     * 清理掉当前设置的数据源，让默认的数据源不受影响
     * */
    @After("pointCut()")
    public void after(JoinPoint point){
        log.info("...后置增强清除key...");
        DynamicDataSourceHolder.clear();
    }
}
