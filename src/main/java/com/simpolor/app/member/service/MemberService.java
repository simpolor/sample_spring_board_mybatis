package com.simpolor.app.member.service;

import com.simpolor.app.member.vo.MemberVO;

public interface MemberService {
	
	public MemberVO selectMember(String member_id);
	
	public int updateMember(MemberVO memberVO);
	
	public int updateMemberPassword(MemberVO memberVO);
	
	public int selectMemberConfirm(MemberVO memberVO);
	
}
