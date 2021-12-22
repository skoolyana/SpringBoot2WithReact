package com.sunil.cardatabase.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.GenericFilterBean;

import com.sunil.cardatabase.service.AuthenticationService;

public class AuthenticationFilter extends GenericFilterBean {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		 Authentication authentication = AuthenticationService.getAuthentication((HttpServletRequest)request);
		
		 SecurityContextHolder.getContext().setAuthentication(authentication);
		 
		 filterChain.doFilter(request, response);
		 
		 
		 
	}

}
