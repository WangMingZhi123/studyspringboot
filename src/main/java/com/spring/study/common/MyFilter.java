package com.spring.study.common;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 *ClassDescription filter
 *@Author Wisdom
 *@Date 2019/5/12 0012
 *@return
 **/
@WebFilter("/*")
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        System.out.print("MyFilter>>>init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.print("MyFilter>>>doFilter");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

        System.out.print("MyFilter>>>destroy");
    }
}
