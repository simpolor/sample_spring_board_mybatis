package com.simpolor.app.member.service;

import com.simpolor.app.member.vo.MemberVO;

public interface JoinService {
	
	public int selectMemberIdDupCheck(String member_id);
	
	public int selectMemberEmailDupCheck(String email) ;
	
	public int insertJoinMember(MemberVO memberVO);
	
}
