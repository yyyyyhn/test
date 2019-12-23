package com.woniu.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Base64;

@Component
public class TokenFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        //获取容器
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        HttpSession session = request.getSession();
        ctx.addZuulRequestHeader("cookie","SESSION="+
                Base64.getEncoder().encodeToString(session.getId().getBytes()));
        Cookie[] cookies = request.getCookies();
        session.setAttribute("user","zhangsan");
        System.out.println("网关:"+session.getId());

        //停止向下路由
//        ctx.setSendZuulResponse(false);
        //设置响应的错误编码
//        ctx.setResponseStatusCode(401);
        //设置响应的错误信息
//        ctx.setResponseBody("miss token");


        return null;
    }
}
