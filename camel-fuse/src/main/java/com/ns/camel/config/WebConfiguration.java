package com.ns.camel.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
@Import({ CommonConfiguration.class })
@ComponentScan("com.ns.camel")
public class WebConfiguration extends WebMvcConfigurerAdapter {
}
