package com.sangto.retail.scheduled;

import org.apache.ibatis.type.Alias;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class ScheduledServiceImpl implements ScheduledService{

    private Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private DataUploadService dataUploadService;
    /**
     * 每一分钟执行一次  1000 * 60 * 1
     */
    @Scheduled(fixedRate=1000 * 11 * 1)
    @Override
    public void execute() {
        logger.info("数据上传到CRM数据库");
        System.out.println("测试一下6秒定时任务");
        dataUploadService.upload();
    }
}
