package com.simpolor.app.member.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.simpolor.app.member.mapper.LoginMapper;
import com.simpolor.app.member.service.LoginService;
import com.simpolor.app.member.vo.MemberVO;

@Service("loginService")
public class LoginServiceImpl implements LoginService {
	
	@Resource(name="loginMapper")
	private LoginMapper loginMapper;

	public MemberVO selectMemberLogin(MemberVO memberVO) {
		
		memberVO = loginMapper.selectMemberLogin(memberVO);
		
		return memberVO;
	}

}
