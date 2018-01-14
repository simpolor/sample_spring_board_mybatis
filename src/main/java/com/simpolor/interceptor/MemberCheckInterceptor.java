package com.simpolor.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MemberCheckInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		HttpSession session = request.getSession(false);
		if (session != null) {
			String member_id = (String)session.getAttribute("SESSION_MEMBER_ID");
			if (member_id != null) {
				return true;
			}
		}
		response.sendRedirect(request.getContextPath() + "/member/login");
		
		return false;
	}
	
}
