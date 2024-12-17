package com.macro.mall.tiny.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import com.github.pagehelper.PageInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Properties;

/**
 * MyBatis配置类
 * Created by macro on 2019/4/8.
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.macro.mall.tiny.modules.*.mapper"})
public class MyBatisConfig {

    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
        return interceptor;
    }
    @Bean
    public PageInterceptor pageInterceptor() {
        PageInterceptor interceptor = new PageInterceptor();
        Properties properties = new Properties();
        properties.setProperty("helperDialect", "mysql"); // 根据数据库类型设置
        properties.setProperty("reasonable", "true"); // 合理化分页参数
        properties.setProperty("supportMethodsArguments", "true");
        interceptor.setProperties(properties);
        return interceptor;
    }
}
