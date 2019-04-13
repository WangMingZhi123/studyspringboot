package com.spring.study;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

//@EnableAutoConfiguration        //此注解的主要含义：由于已经存在了web的jar包，用它来开启自动化配置
//@ComponentScan                  //主要意思将controller注册到spring mvc容器中
@SpringBootApplication           //相当于上面两个注解
public class StudyApplication {

    public static void main(String[] args) {
//        去除spring的banner
//        SpringApplicationBuilder builder = new SpringApplicationBuilder(StudyApplication.class);
//        builder.bannerMode(Banner.Mode.OFF).run(args);
        SpringApplication.run(StudyApplication.class, args);
    }

}
