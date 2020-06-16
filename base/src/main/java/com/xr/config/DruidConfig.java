package com.xr.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Configuration//表示是一个配置类
public class DruidConfig {
    //读取全局配置文件中的spring.datasource元素
    @ConfigurationProperties(prefix = "spring.datasource")
    //加入到容器中
    @Bean
    public DataSource druid() {
        return new DruidDataSource();
    }

    @Bean
    /**
     * 配置Druid的web监控的Servlet
     */
    public ServletRegistrationBean statViewServlet() {
        //添加Druid的Servlet，捕获所有的/druid/*请求
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
        //StatViewServlet的父类ResourceServlet里定义了一些属性，我们可以配置
        Map<String, String> map = new HashMap<>();
        map.put("loginUsername", "admin");//登录的用户名
        map.put("loginPassword", "admin");//登录的密码
        map.put("allow", "");//默认允许所有访问
        map.put("deny", "127.0.0.1");//不允许谁访问
        servletRegistrationBean.setInitParameters(map);
        return servletRegistrationBean;
    }

    @Bean
    /**
     * 配置Druid的web监控的过滤器
     */
    public FilterRegistrationBean webStatFilter() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new WebStatFilter());
        //设置拦截所有
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/*"));
        Map<String, String> map = new HashMap<>();
        //这些请求不拦截
        map.put("exclusions", "*.js,*.css,*./druid/*");
        filterRegistrationBean.setInitParameters(map);
        return filterRegistrationBean;
    }
}