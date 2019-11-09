package com.daniel.study.springbootmybatis.config;

import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.core.parser.ISqlParser;
import com.baomidou.mybatisplus.extension.parsers.BlockAttackSqlParser;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fengy
 */
@EnableTransactionManagement
@Configuration
@MapperScan("com.daniel.study.springbootmybatis.service.*.mapper*")
public class MybatisPlusConfig {
    /**
     * SQL执行效率插件
     * 设置 dev test 环境开启
     */
    @Bean
    @Profile({"dev", "test"})
    public PerformanceInterceptor performanceInterceptor() {
        return new PerformanceInterceptor();
    }

    /**
     * mybatis-plus分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor page = new PaginationInterceptor();
        BlockAttackSqlParser blockAttackSqlParser = new BlockAttackSqlParser();
        List<ISqlParser> parsers = new ArrayList<>();
        parsers.add(blockAttackSqlParser);
        page.setSqlParserList(parsers);
        page.setDialectType("mysql");
        return page;
    }
}