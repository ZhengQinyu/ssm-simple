package com.qida.gdufs.base.interceptor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 权限拦截器
 * Created by zqy on 2017/3/28.
 */
public class AuthInterceptor extends HandlerInterceptorAdapter {

    private static Log logger = LogFactory.getLog(AuthInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.debug("ssssssssssssssss");
        return super.preHandle(request, response, handler);
    }
}
