package com.daniel.study.springbootmybatis.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mapstruct.Qualifier;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * @author fengy
 */
@Configuration
@ConditionalOnProperty(name = "spring.datasource.dbcp2.url", matchIfMissing = false)
@MapperScan(value = {"com.daniel.study.springbootmybatis.service.*.mapper*"}, sqlSessionFactoryRef = "sqlSessionFactory")
public class DataSourceConfiguration {
//    @Bean(name = "dataSource")
//    @ConfigurationProperties(prefix = "spring.datasource.dbcp2")
//    public DataSource dataSource() {
//        //return new BasicDataSource();
//        return null;
//    }
//    @Bean(name = "transactionManager")
//    public DataSourceTransactionManager dbOneTransactionManager(
//            @Qualifier("dataSource") DataSource dataSource) {
//        return new DataSourceTransactionManager(dataSource);
//    }
//
//    @Bean(name = "sqlSessionFactory")
//    @ConditionalOnMissingBean(name = "sqlSessionFactory")
//    public SqlSessionFactory dbOneSqlSessionFactory(@Qualifier("dataSource") DataSource dataSource) throws Exception {
//        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
//        sessionFactory.setDataSource(dataSource);
//        return sessionFactory.getObject();
//    }
}
