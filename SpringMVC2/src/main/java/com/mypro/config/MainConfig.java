package com.mypro.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.mypro")
public class MainConfig {

	@Bean
	public ViewResolver getViewResolver()
	{
		InternalResourceViewResolver view = new InternalResourceViewResolver();
		view.setSuffix(".jsp");
		view.setPrefix("/WEB-INF/view/");
		return view;
		
	}
}
