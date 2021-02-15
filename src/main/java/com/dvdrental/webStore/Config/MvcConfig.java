package com.dvdrental.webStore.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

        // register view for frontend react router, not sure how to register all path except for /api, will be changed
        // registry.addViewController("/").setViewName("forward:/");
        // registry.addViewController("/actors").setViewName("forward:/");
        // registry.addViewController("/films").setViewName("forward:/");
        // registry.addViewController("/films/*").setViewName("backward:/");
    }

}
