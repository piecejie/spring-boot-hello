package com.piecejie.utils;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by with IntelliJ IDEA.
 * User: ${user}
 * Date: 2017/6/13
 * Time: 17:48
 * 定时任务类
 */
@Configuration
@EnableScheduling
public class SchedulingConfig {
    @Scheduled(cron = "0/20 * * * * ?")//每隔20秒执行一次
    public void Scheduler() {
        System.out.println("执行定时任务:SchedulingConfig.Scheduler()");
    }
}

