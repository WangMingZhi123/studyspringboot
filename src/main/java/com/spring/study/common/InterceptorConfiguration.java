package com.spring.study.common;

import com.spring.study.interceptor.MyInterceptor1;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

/**
 *ClassDescription 拦截器的配置文件（springboot的配置文件最好用java来写少用xml文件），以此配置文件来调用拦截器MyInterceptor1.class
 *@Author Wisdom
 *@Date 2019/5/12 0012
 *@return
 **/
@Configuration
public class InterceptorConfiguration implements WebMvcConfigurer {
    /**
     *@Description 实现WebMvcConfigurer接口中的添加拦截器方法
     *@Author Wisdom
     *@param  * @param registry
     *Date 2019/5/12 0012
     *@return
     **/
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        MyInterceptor1 myInterceptor1 = new MyInterceptor1();
        List<String> patterns = new ArrayList<>();
        patterns.add("/loginpage");
        patterns.add("/login");
        registry.addInterceptor(myInterceptor1)
                .addPathPatterns("/**")   //表示拦截的路径
                .excludePathPatterns(patterns);   //表示排除的路径（可string可list）
    }
}
