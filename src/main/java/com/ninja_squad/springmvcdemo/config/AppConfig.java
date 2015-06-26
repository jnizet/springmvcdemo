package com.ninja_squad.springmvcdemo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Spring application configuration. Lacks some annotations.
 * @author JB Nizet
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.ninja_squad.springmvcdemo")
@EnableAspectJAutoProxy
public class AppConfig extends WebMvcConfigurerAdapter {

    /**
     * Delegates to the default servlet in case the Dispatcher, which is mapped to /, hasn't found a mapping
     */
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
