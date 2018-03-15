package com.project2.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//dispatcher-servlet.xml file configuration in project 1
// <mvc:annotation-driven> , <component-scan> , <bean class="..InternalResourceViewResolver"> 

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.project2")
public class WebAppConfig extends WebMvcConfigurerAdapter{
    public WebAppConfig(){
    	System.out.println("WebAppConfig is instantiated");
    }
    @Bean(name="multipartResolver")
    public CommonsMultipartResolver commonsMultipartResolver()
    {
    	CommonsMultipartResolver a=new CommonsMultipartResolver();
    	
    	a.setMaxUploadSize(10000024);
    	a.setMaxInMemorySize(1048576);
		return a;
    	
    }
}