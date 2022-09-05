package com.spring.demojms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@Configuration
@EnableAsync
public class TakConfig {
    @Bean
    TaskExecutor taskExecutor(){
        return new SimpleAsyncTaskExecutor();
    }
}
