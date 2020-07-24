package com.sangto.retail;


import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.web.client.RestTemplate;
import pers.mateng.framework.web.config.BootConfig;

@Configuration
public class AppConfig extends Config {
	
	@Value("${sheduled.poolSize}")
	private String poolSize ; 
	
	@Bean
	public RestTemplate restTemplate() {
		SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
		requestFactory.setReadTimeout(100000);// 传递数据的超时时间
		requestFactory.setConnectTimeout(50000);// 建立连接的超时时间
		
		RestTemplate restTemplate = new RestTemplate(requestFactory);
		return restTemplate;
	}

    // 创建ThreadPoolTaskScheduler线程池
	@Bean
    public TaskScheduler taskScheduler(){
        ThreadPoolTaskScheduler taskScheduler = new ThreadPoolTaskScheduler();
        if(StringUtils.isBlank(poolSize) || !StringUtils.isNumeric(poolSize)) {
        	taskScheduler.setPoolSize(10);
        }else {
        	taskScheduler.setPoolSize(Integer.valueOf(poolSize));
        }
        taskScheduler.initialize();
        return taskScheduler;
    }
	
}
