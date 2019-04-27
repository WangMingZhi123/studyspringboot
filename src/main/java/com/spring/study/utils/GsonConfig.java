//package com.spring.study.utils;
//
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.converter.json.GsonHttpMessageConverter;
//
//import java.lang.reflect.Modifier;
//
///**
// * 此类的作用就是在使用google的gson包时，需要对时间格式进行转换
// * **/
//@Configuration
//public class GsonConfig {
//
//    @Bean
//    GsonHttpMessageConverter gsonHttpMessageConverter(){
//        GsonHttpMessageConverter converter = new GsonHttpMessageConverter();
//        GsonBuilder builder = new GsonBuilder();
//        builder.setDateFormat("yyyy-MM-dd hh:mm:ss");
//        builder.excludeFieldsWithModifiers(Modifier.PROTECTED); //过滤掉修饰符是protected的字段
//        Gson gson = builder.create();
//        converter.setGson(gson);
//        return converter;
//    }
//}
