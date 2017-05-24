package com.ghgs.brewer.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.ghgs.brewer.controllers.BrewController;

@Configuration
@ComponentScan(basePackageClasses = {BrewController.class})
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {
	
	
	
	

}
