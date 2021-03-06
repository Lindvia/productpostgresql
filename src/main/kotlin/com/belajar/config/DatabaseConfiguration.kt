package com.belajar.config

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import javax.sql.DataSource


@Configuration

class DatabaseConfiguration {
    @Bean
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource")

fun dataSource(): DataSource {

    return DataSourceBuilder.create().build()

}}