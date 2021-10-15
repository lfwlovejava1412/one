package com.bwie.config;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

@Component
public class MyZuulConfig extends ZuulFilter {

    /**
     * 过滤类型
     * @return
     */
    @Override
    public String filterType() {
        //请求前过滤   pre
        //请求时过滤   route
        //请求后过滤   post
        //请求错误时过滤  error
        return "post";
    }

    /**
     * 过滤顺序
     * @return
     */
    @Override
    public int filterOrder() {
        //返回值越大,优先级越低
        return 0;
    }

    /**
     * 是否过滤
     * @return
     */
    @Override
    public boolean shouldFilter() {


        return true;
    }

    /**
     * 执行逻辑
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {

        System.out.println("zuul开始运行了...");
        return null;
    }
}
