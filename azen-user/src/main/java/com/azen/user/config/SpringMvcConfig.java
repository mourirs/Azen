package com.azen.user.config;

import com.azen.user.handler.UserLoginHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SpringMvcConfig implements WebMvcConfigurer {

    private final UserLoginHandler userLoginHandler;

    @Autowired
    public SpringMvcConfig(UserLoginHandler userLoginHandler) {
        this.userLoginHandler = userLoginHandler;
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("/static/");
        registry.addResourceHandler("/images/product/**").addResourceLocations("file:F:\\IDEA_CODE\\azen\\azen-user\\src\\main\\resources\\static\\images\\product\\");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(userLoginHandler).addPathPatterns("/*")
                .excludePathPatterns("/login",
                        "/index",
                        "/userLogin",
                        "/contact",
                        "/insertContactInFo",
                        "/userRegister",
                        "/userRetrieve",
                        "/",
                        "/*.jpg");
    }
}
