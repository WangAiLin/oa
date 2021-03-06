package com.wal.oa.global;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EncodingFilter implements Filter{
    private String encoding = "utf-8";

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        if (filterConfig.getInitParameter("encoding") != null) {
            encoding = filterConfig.getInitParameter("encoding");
        }
    }

    @Override
    public void doFilter(ServletRequest ServletRequest, ServletResponse ServletResponse, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) ServletRequest;
        HttpServletResponse response = (HttpServletResponse) ServletResponse;
        request.setCharacterEncoding(encoding);
        response.setCharacterEncoding(encoding);
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
