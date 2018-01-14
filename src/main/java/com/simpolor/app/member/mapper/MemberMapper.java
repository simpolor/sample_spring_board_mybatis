package com.simpolor.app.member.mapper;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.simpolor.app.member.vo.MemberVO;

@Repository("memberMapper")
public class MemberMapper {
	
	@Autowired
	private SqlSession sqlSession;
	
	public MemberVO selectMember( String member_id ){
		return sqlSession.selectOne("selectMember", member_id);
	}
	
	public int updateMember( MemberVO memberVO ){
		return sqlSession.update("updateMember", memberVO);
	}
	
	public int updateMemberPassword( MemberVO memberVO ){
		return sqlSession.update("updateMemberPassword", memberVO);
	}
	
	public int selectMemberConfirm( MemberVO memberVO ){
		return sqlSession.selectOne("selectMemberConfirm", memberVO);
	}
	
}
