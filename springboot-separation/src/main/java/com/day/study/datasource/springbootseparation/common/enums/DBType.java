package com.day.study.datasource.springbootseparation.common.enums;

/**
 * @author fengyu
 * 数据源key,用于获取实际数据源的
 */
public enum DBType {
    /**
     * 主库
     */
    MASTER,
    /**
     * 从库1
     */
    SLAVE1,
    /**
     * 从库2
     */
    SLAVE2;
}
