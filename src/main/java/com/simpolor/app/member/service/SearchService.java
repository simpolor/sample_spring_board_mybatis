package com.simpolor.app.member.service;

import com.simpolor.app.member.vo.MemberVO;

public interface SearchService {
	
	public MemberVO selectMemberSearch(MemberVO memberVO);
	
	public int updateMemberChange(MemberVO memberVO);
	
	
}
