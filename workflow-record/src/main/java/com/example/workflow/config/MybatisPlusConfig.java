package com.example.workflow.config;

import org.springframework.context.annotation.Configuration;
import org.mybatis.spring.annotation.MapperScan;

@Configuration
@MapperScan("com.example.workflow.mapper")
public class MybatisPlusConfig {
}
