package com.day.study.datasource.springbootseparation.aspect;

import com.day.study.datasource.springbootseparation.config.db.DBContextHolder;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author fengyu
 */
@Aspect
@Component
public class DataSourceAop {
    @Pointcut("!@annotation(com.day.study.datasource.springbootseparation.common.annotation.Master) " +
            "&& (execution(* com.day.study.datasource.springbootseparation.service..*.select*(..)) " +
            "|| execution(* com.day.study.datasource.springbootseparation.service..*.get*(..)))")
    public void readPointcut() {

    }

    @Pointcut("@annotation(com.day.study.datasource.springbootseparation.common.annotation.Master) " +
            "|| execution(* com.day.study.datasource.springbootseparation.service..*.insert*(..)) " +
            "|| execution(* com.day.study.datasource.springbootseparation.service..*.add*(..)) " +
            "|| execution(* com.day.study.datasource.springbootseparation.service..*.update*(..)) " +
            "|| execution(* com.day.study.datasource.springbootseparation.service..*.edit*(..)) " +
            "|| execution(* com.day.study.datasource.springbootseparation.service..*.delete*(..)) " +
            "|| execution(* com.day.study.datasource.springbootseparation.service..*.remove*(..))")
    public void writePointcut() {

    }

    @Before("readPointcut()")
    public void read() {
        DBContextHolder.slave();
    }

    @Before("writePointcut()")
    public void write() {
        DBContextHolder.master();
    }


    /**
     * 另一种写法：if...else...  判断哪些需要读从数据库，其余的走主数据库
     */
//    @Before("execution(* com.day.study.datasource.springbootseparation.service.impl.*.*(..))")
//    public void before(JoinPoint jp) {
//        String methodName = jp.getSignature().getName();
//
//        if (StringUtils.startsWithAny(methodName, "get", "select", "find")) {
//            DBContextHolder.slave();
//        }else {
//            DBContextHolder.master();
//        }
//    }
}
