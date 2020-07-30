package com.sangto.retail;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Predicates;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class Config {

    //扫描swagger的package
    @Value("${spring.swagger.package}")
    private String swaggerPackage;

    @Value("${spring.swagger.title}")
    private String swaggerTitle;

    @Value("${spring.swagger.description}")
    private String swaggerDescription;

    @Value("${spring.swagger.version}")
    private String swaggerVersion;

    @Autowired
    protected ObjectMapper objectMapper;
    
    

    @Bean
    public Docket createRestApi() {
        if(StringUtils.isBlank(swaggerPackage)) {
            swaggerPackage = "pser.mateng";
        }
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
//	                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
//	                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .apis(RequestHandlerSelectors.basePackage(swaggerPackage))
                .paths(PathSelectors.any())
                .build();
    }

    protected ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(swaggerTitle)
                .description(swaggerDescription)
                .version(swaggerVersion)
                .build();
    }
}
