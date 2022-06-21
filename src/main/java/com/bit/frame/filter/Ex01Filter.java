package com.bit.frame.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
@WebFilter(value = "/*", initParams = @WebInitParam(name = "encoding", value = "val"))
public class Ex01Filter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("ex01filter init");
	}
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("before ex01filter dofilter");
		long before=System.currentTimeMillis();
		//필터를 한개 이상 사용할수 있고 jsp 까지 사용
		chain.doFilter(request, response);
		long after=System.currentTimeMillis();
		System.out.println("after ex01filter dofilter");
	}
	@Override
	public void destroy() {
		System.out.println("ex01filter destroy");
		
	}
}
