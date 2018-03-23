package com.suneee.cloud.springcloudzuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @Author:shangwen
 * @Description
 * @Date: Created in 16:10 2018/3/23
 * @Modifired By:
 */
@Component
public class MyZuulFilter extends ZuulFilter {
    private static Logger log = LoggerFactory.getLogger(MyZuulFilter.class);

    public String filterType() {
        /**
         * pre：路由之前
           routing：路由之时
           post： 路由之后
           error：发送错误调用
         */
        return FilterConstants.PRE_TYPE;
    }

    //filterOrder：过滤的顺序
    public int filterOrder() {
        return 0;
    }

    //shouldFilter：这里可以写逻辑判断，是否要过滤，这里为true,永远过滤
    public boolean shouldFilter() {
        return true;
    }

    //run：过滤器的具体逻辑,包括查sql，nosql去判断该请求到底有没有权限访问
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        log.info(String.format("%s >>> %s",request.getMethod(),request.getRequestURL().toString()));
        Object accessToken = request.getParameter("token");
        if(accessToken == null){
            log.warn("token is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try {
                ctx.getResponse().getWriter().write("token is empty");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
        log.info("ok,access...");
        return null;
    }
}
