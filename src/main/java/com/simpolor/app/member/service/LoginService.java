package com.simpolor.app.member.service;

import com.simpolor.app.member.service.LoginService;
import com.simpolor.app.member.vo.MemberVO;


public interface LoginService {
	
	public MemberVO selectMemberLogin(MemberVO memberVO);

}
