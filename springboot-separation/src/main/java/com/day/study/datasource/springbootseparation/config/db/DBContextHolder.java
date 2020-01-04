package com.day.study.datasource.springbootseparation.config.db;

import com.day.study.datasource.springbootseparation.common.enums.DBType;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author fengyu
 * 通过ThreadLocal将数据源设置到每个线程上下文中
 */
public class DBContextHolder {
    private static final ThreadLocal<DBType> contexHolder = new ThreadLocal<>();
    private static final AtomicInteger counter = new AtomicInteger();

    public static void set(DBType dbType) {
        contexHolder.set(dbType);
    }

    public static DBType get() {
        return contexHolder.get();
    }

    public static void master() {
        set(DBType.MASTER);
        System.out.println("切换到master");
    }

    public static void slave() {
        //  轮询
        int index = counter.getAndIncrement() % 2;
        if (counter.get() > 9999) {
            counter.set(-1);
        }
        if (index == 0) {
            set(DBType.SLAVE1);
            System.out.println("切换到slave1");
        } else {
            set(DBType.SLAVE2);
            System.out.println("切换到slave2");
        }
    }
}
